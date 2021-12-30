package com.bank.BankApplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class BankApplicationController {
    @RequestMapping("/Home")
    public String index() {
        return "Home";
    }

    //register
    @RequestMapping("/loginDetails")
    public String registration(Model model, HttpServletRequest request) {
        String name = request.getParameter("Username");
        String email = request.getParameter("Email");
        String password = request.getParameter("Password");
        return "LoginDetails";

    }

    @PostMapping("/userDetails")
    public String userDetails(Model model, HttpServletRequest request) {
        String username = request.getParameter("customerName");
        String customerId = request.getParameter("customerId");
        String emailId = request.getParameter("emailId");
        String address = request.getParameter("address");
        String accountNumber = request.getParameter("accountNumber");
        String branchName = request.getParameter("branchName");

        model.addAttribute("customerName", username);
        model.addAttribute("customerId", customerId);
        model.addAttribute("emailId", emailId);
        model.addAttribute("address", address);
        model.addAttribute("accountNumber", accountNumber);
        model.addAttribute("branchName", branchName);

        return "userDetails";
    }
}




    //login
//    @RequestMapping("/Home")
//    public String loginCustomer(Model model, HttpServletRequest request) {
//        if (request.getParameter("Email").equals(email) && request.getParameter("Password").equals(password)) {
//            System.out.println("Login Successful!");
//            return "userDetails";
//        } else {
//            System.out.println("Wrong Credentials");
//            model.addAttribute("message", "Invalid credentials!");
//            return "loginDetails";
//        }
//    }

//    @RequestMapping("/registrationForm")
//    public String register(){
//        return "registrationForm";
//    }





//
//    @RequestMapping("/userDetails")
//    public String userInfo(Model model,HttpServletRequest request) {
//
////        String username = request.getParameter("customerName");
////        model.addAttribute("customerName",username);
//        return "userDetails";
//    }


