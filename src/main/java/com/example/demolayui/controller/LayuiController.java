package com.example.demolayui.controller;


import com.example.demolayui.entity.Teacher;
import com.example.demolayui.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @author: Collin
 * @Date: 2022/12/15 14:23
 * @description:
 */
@Controller
@RequestMapping("/user")
public class LayuiController {
    @Autowired
    private TeacherService teacherService;
    @RequestMapping("/first")
    public ModelAndView first() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/user/first");
        return modelAndView;
    }
    @RequestMapping("/addUser")
    public ModelAndView addUser() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/user/addUser");
        return modelAndView;
    }
    @RequestMapping("/list")
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/user/userList");
        return modelAndView;
    }

    @RequestMapping("/test")
    public ModelAndView test() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/user/test");
        return modelAndView;
    }
    @RequestMapping("/testDatabase")
    @ResponseBody
    public Teacher testDatabase() {
        Teacher teacher = teacherService.getTea("34324","yyf123456");
        return teacher;
    }

}
