package com.lzw;

import com.lzw.domain.SysUser;
import com.lzw.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) ac.getBean("userService");

        SysUser user = new SysUser();
        user.setAge(21);
        user.setName("lzw");

        userService.addUser(user);

    }
}
