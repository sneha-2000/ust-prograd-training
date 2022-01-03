package com.example.AbcBankApplication.controller;

import com.example.AbcBankApplication.entity.Account;
import com.example.AbcBankApplication.entity.Customer;
import com.example.AbcBankApplication.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


@Controller
public class BankController {
    @Autowired
    private CustomerService service;

    @RequestMapping("/")
    public String index() {
        return "Login";
    }

    @RequestMapping("/Register")
    public String register() {
        return "Register";
    }

    @PostMapping ("/Login")
    public String customerRegistration(HttpServletRequest req, Model model) {
        if (!(req.getParameter("password").equals(req.getParameter("confirmPassword")))) {
            model.addAttribute("message", "password doesn't match");
            return "Register";
        }
        Customer customer = new Customer(req.getParameter("name"), req.getParameter("email"), req.getParameter("password"));
        service.saveCustomer(customer);
        return "Login";

    }

    @PostMapping("/Home")
    public String validateCustomer(HttpServletRequest req) {
        Customer customer = service.findCustomerByEmail(req.getParameter("email"));
                if (customer.getPassword("password").equals(req.getParameter("password"))){
                    String email = customer.getEmail();
            }
        return "Home";

    }

//    @PostMapping("/Account")
//    public String accountDetails(HttpServletRequest req,Model model) {
//      Long accountId = Long.parseLong(req.getParameter("accountId"));
//      Long customerId = Long.parseLong(req.getParameter("customerId"));
//      String IFSCCode = req.getParameter("IFSCCode");
//      Double balanceAmount = Double.parseDouble(req.getParameter("balanceAmount"));
//
//      Account account = service.getCustomerBy
//      model.addAttribute("accountId",account.getAccountId());
//
//    }






}
