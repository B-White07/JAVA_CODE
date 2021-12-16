package com.lzw;

import com.lzw.ba01.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Mytest01 {

    @Test
    public void test01(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeService proxy = (SomeService) ac.getBean("someService");
        //  proxy:com.sun.proxy.$Proxy8:jdk的动态代理
        System.out.println("proxy:" + proxy.getClass().getName());
        //  通过代理对象执行方法，才能在执行时增强功能
        proxy.doSome("lzw",21);
    }
}
