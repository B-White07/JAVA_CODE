package com.lzw.test;

import java.lang.reflect.Method;

public class UserServletTest {

    public void login(){
        System.out.println("login()方法");
    }

    public void regist(){
        System.out.println("regist()方法");
    }

    public void uodateUser(){
        System.out.println("uodateUser()方法");
    }

//    public void updateUserPassword(){
//        System.out.println("updateUserPassword()方法");
//    }

    public static void main(String[] args) {
        String action = "login";

        try {
            //  获取action业务鉴别字符串，获取相应的业务方法反射对象
            Method method = UserServletTest.class.getDeclaredMethod(action);

            System.out.println(method);
            //  调用目标业务方法
            method.invoke(new UserServletTest());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
