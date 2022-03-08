package com.example.AbcBankApplication.controller;

import com.example.AbcBankApplication.entity.Account;
import com.example.AbcBankApplication.entity.Customer;
import com.example.AbcBankApplication.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

/**
 * It contains login page as index page, after login it will redirect to home page which consists of user details
 * account details, fund transfer and logout .
 */
@Controller
public class BankController {
    static String email;
    static double balanceAmount;


    @Autowired
    private BankService service;

    @RequestMapping("/")
    public String index() {
        return "login";
    }

    @RequestMapping("/register")
    public String register() {
        return "register";
    }

    /**
     * @param request taking request from user for name,email,password,etc.and saving the customer along with that
     *                his account will also be created with zero balance.
     * @param model   to display message if confirm and actual password doesn't match.
     * @return to login page
     */
    @PostMapping("/login")
    public String customerRegistration(HttpServletRequest request, Model model) {
        if (!(request.getParameter("password").equals(request.getParameter("confirmPassword")))) {
            model.addAttribute("message", "password doesn't match");
            return "register";
        }
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String country = request.getParameter("country");

        Customer customer = new Customer(name, email, password, phone, address, city, state, country);
        service.saveCustomer(customer);

        Account account = new Account(customer, name, "ABC001", address, 0.00);
        service.saveAccount(account);
        return "Login";

    }

    /**
     * checking the customer by it unique email, if customer is not null then, check if customer's password
     * matches with the password  that the user is entering---->if matches then return to home page,
     * else display msg invalid password.
     *
     * @param request email, password
     * @param model   display if credentials doesn't match.
     * @return to home page if password matches, else return to login page.
     */
    @PostMapping("/home")
    public String validateCustomer(HttpServletRequest request, Model model) {
        Customer customer = service.findByEmail(request.getParameter("email"));
        email = request.getParameter("email");
        if (!(Objects.isNull(customer))) {

            if ((customer.getPassword()).equals(request.getParameter("password"))) {
                return "home";
            } else {
                model.addAttribute("message", "Invalid password!!");
                return "login";
            }
        } else {
            model.addAttribute("message", "Invalid credentials!!");
            return "login";
        }
    }

    @RequestMapping("/home")
    public String home() {
        return "home";
    }

    @RequestMapping("/details")   //("/details/customer/{id}")
    public String details(Model model) {
        Customer customer = service.findByEmail(email);
        model.addAttribute("name", customer.getName());
        model.addAttribute("email", customer.getEmail());
        model.addAttribute("phone", customer.getPhone());
        model.addAttribute("address", customer.getAddress());
        model.addAttribute("city", customer.getCity());
        model.addAttribute("state", customer.getState());
        model.addAttribute("country", customer.getCountry());

        return "details";
    }


    @RequestMapping("/account")
    public String accountDetails(Model model) {
        Customer customer = service.findByEmail(email);
        Account account = service.getAccountByCustomerId(customer);

        model.addAttribute("customerId", customer.getId());
        model.addAttribute("customerName", customer.getName());
        model.addAttribute("accountId", account.getAccountId());
        model.addAttribute("IFSCCode", account.getIFSCCode());
        model.addAttribute("address", customer.getAddress());
        model.addAttribute("balanceAmount", account.getBalanceAmount());


        return "account";
    }

    /**
     * to update customer details.
     *
     * @param model
     * @return
     */
    @RequestMapping("/update")
    public String updateDetails(Model model) {
        Customer customer = service.findByEmail(email);

        model.addAttribute("name", customer.getName());
        model.addAttribute("email", customer.getEmail());
        model.addAttribute("phone", customer.getPhone());
        model.addAttribute("address", customer.getAddress());
        model.addAttribute("city", customer.getCity());
        model.addAttribute("state", customer.getState());
        model.addAttribute("country", customer.getCountry());

        return "update";

    }

    @PostMapping("/details")
    public String afterUpdate(Model model, HttpServletRequest request) {
        Customer customer = service.findByEmail(email);

        customer.setName(request.getParameter("name"));
        customer.setEmail(request.getParameter("email"));
        customer.setPhone(request.getParameter("phone"));
        customer.setAddress(request.getParameter("address"));
        customer.setCity(request.getParameter("city"));
        customer.setState(request.getParameter("state"));
        customer.setCountry(request.getParameter("country"));

        service.saveCustomer(customer);

        model.addAttribute("message", "Details are updated successfully!");

        model.addAttribute("name", customer.getName());
        model.addAttribute("email", customer.getEmail());
        model.addAttribute("phone", customer.getPhone());
        model.addAttribute("address", customer.getAddress());
        model.addAttribute("city", customer.getCity());
        model.addAttribute("state", customer.getState());
        model.addAttribute("country", customer.getCountry());

        return "details";
    }

    @RequestMapping("/deposit")
    public String deposit(HttpServletRequest request) {
        return "deposit";
    }

    @PostMapping("/deposit")
    public String depositAmount(HttpServletRequest request,Model model) {
        Customer customer = service.findByEmail(email);
        Account account = service.getAccountByCustomerId(customer);

        balanceAmount = account.getBalanceAmount() + Double.parseDouble(request.getParameter("amount"));
        account.setBalanceAmount(balanceAmount);
        service.saveAccount(account);

        model.addAttribute("message","Successfully deposited!!");

        return "deposit";
    }

    /**
     * Fund Transfer
     */
//    @GetMapping("/fundTransfer/{accountId}")
//    public String fundTransferForm(@PathVariable Long accountId, Model model) {
//        model.addAttribute("accountId", accountId);
//        return "fundTransfer";
//    }

//    @PostMapping("/fundTransfer/{accountId}")
//    public String fundTransfer(@PathVariable Long accountId,HttpServletRequest request,Model model){
//
//        Long toAccount =Long.parseLong(request.getParameter("toAccount"));
//        Double amount = Double.parseDouble(request.getParameter("amount"));
//
//        if(service.existAccount(toAccount)){
//            Account account1 = service.getByAccountId(accountId);
//            Account account2 = service.getByAccountId(toAccount);
//            if(account1.getBalanceAmount() <= amount) {
//                model.addAttribute("message", "Insufficient Amount in your Account");
//            }
//            else {
//                account1.withdraw(amount);
//                account2.deposit(amount);
//                service.saveAccount(account1);
//                service.saveAccount(account2);
//                model.addAttribute("message","Transaction successful!!");
//            }
//        }
//        else {
//            model.addAttribute("message","Account does not exist! Please enter valid Account number");
//        }
//        return "fundTransfer";
//    }
    @RequestMapping("/fundTransfer")
    public String transferFund(HttpServletRequest request, Model model) {
        return "fundTransfer";
    }

    @PostMapping("/fundTransfer")
    public String transaction(HttpServletRequest request, Model model) {
        Customer customer = service.findByEmail(email);
        Account account = service.getAccountByCustomerId(customer);

        Double amount = Double.parseDouble(request.getParameter("amount"));
        if (account.getBalanceAmount() < amount) {
            model.addAttribute("message", "Insufficient balance in your account!!");
        } else {
            account.setBalanceAmount(account.getBalanceAmount() - amount);
            service.saveAccount(account);
            Account toAccount = service.getAccountByAccountId(Long.parseLong(request.getParameter("toAccount")));
            toAccount.setBalanceAmount(toAccount.getBalanceAmount() + amount);
            service.saveAccount(toAccount);
            model.addAttribute("message","Amount transferred successfully!!");
        }
        return "fundTransfer";
    }
}







