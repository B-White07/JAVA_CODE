package com.gcl.module.controller;

import com.gcl.module.domain.Users;
import com.gcl.module.service.IUserService;
import com.gcl.module.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/test")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/findAll.do")
    public ModelAndView findAll() throws Exception {
        ModelAndView mv = new ModelAndView();

        List<Users> all = userService.findAll();
        mv.addObject("test", all);
        mv.setViewName("another");

        return mv;
    }
}
