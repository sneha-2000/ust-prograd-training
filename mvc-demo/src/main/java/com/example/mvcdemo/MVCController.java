package com.example.mvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MVCController {

    @RequestMapping("/")
//    @ResponseBody
    public String index(){
        return "home";
    }

    @RequestMapping("/dynamic")
    public  String dynamic(Model model){
        int a = 10;
        model.addAttribute("var",a);
        return "dynamic";
    }

    @RequestMapping("/add")
    public String add(){
        return "add";
    }

    @RequestMapping("/additionResult")
    public String additionResult(HttpServletRequest request, Model model){
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));

        int additionResult= num1 + num2;
        model.addAttribute("additionResult", additionResult);

        return "addResult";
    }

    @RequestMapping("/subtract")
    public String subtract(){
        return "subtract";
    }

    @RequestMapping("/subtractionResult")
    public String subtractionResult(HttpServletRequest req, Model model){
        int value1 = Integer.parseInt(req.getParameter("value1"));
        int value2 = Integer.parseInt(req.getParameter("value2"));

        int subtractionResult= value1 - value2;
        model.addAttribute("subtractionResult", subtractionResult);

        return "subResult";
    }


}
