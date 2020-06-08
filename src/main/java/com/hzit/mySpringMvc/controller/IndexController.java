package com.hzit.mySpringMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Index 控制器
 */
@Controller //代表是控制器
@RequestMapping(value = {"/index","index1/"})
public class IndexController {


    @RequestMapping(value = "/index.do",method = {RequestMethod.GET,RequestMethod.POST})  //只支持get
    public ModelAndView showIndex(){
        System.out.println("-----加载主页-------");
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("msg","小翠你真厉害");
        modelAndView.setViewName("index");
        return modelAndView;
//        return "index";
    }


    @RequestMapping("/login.do")
    public String showLogin(){
        System.out.println("-----加载主页-------");
        return "login";
    }



}
