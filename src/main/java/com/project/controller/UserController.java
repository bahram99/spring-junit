package com.project.controller;


import com.project.model.entity.Book;
import com.project.model.entity.User;
import com.project.model.service.contract.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping({"/user","/users"})
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/regform",method = RequestMethod.GET)
    public String showRegisterForm()
    {
        return "registerForm";
    }

    List<Book> bookList = new ArrayList<>();
    @RequestMapping(value = "/book", method = RequestMethod.POST)
    public String showselectForm(Book book) {
        book.setDate(new Date());
        bookList.add(book);
        return "registerForm";
    }


    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String register(User user , Model model)
    {
        user.getBooks().addAll(bookList);

        if (userService.insertUser(user))
        {
            model.addAttribute("msg",user.getName());
            return "success";
        }
        else
        {
            model.addAttribute("msg","faile register!");
            return "fail";
        }
    }
    @RequestMapping(value = "/getall" , method = RequestMethod.GET)
    public String getall(){
        ModelAndView model = new ModelAndView();
        List<User> users = userService.getall();
        System.out.println(users.size());
        model.addObject("users",users);
        return "userinfo";
    }

    @RequestMapping(value = "/delete/{id}" , method = RequestMethod.GET)
    public String delete(@PathVariable("id") int id , Model model){
        if (userService.delete(id))
        {
            model.addAttribute("msg","حذف با موفقیت انجام شد");
            return "success";
        }
        else
        {
            model.addAttribute("msg","حذف انجام نشد!!!");
            return "fail";
        }
    }

    @RequestMapping(value = "/get/{id}" , method = RequestMethod.GET)
    public String getuser(@PathVariable("id") int id , Model model){
        User user = userService.getUserById(id);
        if (user != null)
        {
            model.addAttribute("name",user.getName());
            model.addAttribute("pass",user.getPass());
            model.addAttribute("user",user.getUsername());
            List<Book> li = userService.getBookById(id);
            model.addAttribute("bname",li.get(0).getBname());
            model.addAttribute("bserial",li.get(0).getSerialnumber());
            model.addAttribute("bdate",li.get(0).getDate());
            return "userinfo";
        }
        else
        {
            model.addAttribute("msg","رکورد یافت نشد !!!");
            return "fail";
        }
    }





}
