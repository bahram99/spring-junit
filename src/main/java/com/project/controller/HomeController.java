package com.project.controller;

import com.project.model.service.contract.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {


    @Autowired
    private UserService userService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String home(Model model)
    {
        System.out.println("*******home");
        model.addAttribute("msg","go to home");
        return "home";
    }

    @RequestMapping(value = "/get" , method = RequestMethod.GET)
    public String getuser(Model model){
        model.addAttribute("nam",userService.get().getName());
        return "salam";

    }
}
