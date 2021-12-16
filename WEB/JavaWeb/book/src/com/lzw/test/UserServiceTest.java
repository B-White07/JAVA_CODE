package com.lzw.test;

import com.lzw.pojo.User;
import com.lzw.service.UserService;
import com.lzw.service.impl.UserServiceImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserServiceTest {

    UserService userService = new UserServiceImpl();

    @Test
    public void registUser() {
        userService.registUser(new User(null,"Jay","123","jay@qq.com"));
        userService.registUser(new User(null,"JJLin","123","jjlin@qq.com"));
    }

    @Test
    public void login() {
        System.out.println(userService.login(new User(null,"Jay","123","jay@qq.com")));
    }

    @Test
    public void existsUsername() {
        if (userService.existsUsername("Jayd")){
            System.out.println("用户名已存在！");
        }else {
            System.out.println("用户名可用！");
        }
    }
}