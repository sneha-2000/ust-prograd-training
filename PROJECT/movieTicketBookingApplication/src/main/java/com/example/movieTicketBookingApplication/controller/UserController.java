package com.example.movieTicketBookingApplication.controller;

import com.example.movieTicketBookingApplication.entity.Movie;
import com.example.movieTicketBookingApplication.entity.User;
import com.example.movieTicketBookingApplication.service.MovieService;
import com.example.movieTicketBookingApplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Objects;

@Controller
public class UserController {
    public static Long userId;
    @Autowired
    private UserService userService;
    static String email;

    @Autowired
    private MovieService movieService;

    @RequestMapping("/")
    public String index() {
        return "index";//index
    }

    @RequestMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("/login")
    public String userRegistration(HttpServletRequest request, Model model) {
        if (!(request.getParameter("password").equals(request.getParameter("confirmPassword")))) {
            model.addAttribute("message", "Password and confirm-password doesn't match!!");
            return "register";
        }
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String phone = request.getParameter("phone");

        User user = new User(name,email,password,phone);
        userService.saveUser(user);
        return "login";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/movieDetails")
    public String validateUser(HttpServletRequest request, Model model) {
        User user = userService.findUserByEmail(request.getParameter("email"));
        email = request.getParameter("email");
        if (!(Objects.isNull(user))) {

            if ((user.getPassword()).equals(request.getParameter("password"))) {
                model.addAttribute("movies",movieService.getAllMovies());
                userId=user.getCustomerId();
                return "movieDetails";
            } else {
                model.addAttribute("message", "Invalid password!!");
                return "login";
            }
        } else {
            model.addAttribute("message", "Invalid credentials!!");
            return "login";
        }
    }

}

