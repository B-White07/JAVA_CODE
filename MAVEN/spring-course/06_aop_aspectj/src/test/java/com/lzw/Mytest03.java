package com.lzw;

import com.lzw.ba02.Student;
import com.lzw.ba03.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Mytest03 {

    @Test
    public void test01(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeService proxy = (SomeService) ac.getBean("someService");
        //  proxy:com.sun.proxy.$Proxy8:jdk的动态代理
        System.out.println("proxy:" + proxy.getClass().getName());
        //  通过代理对象执行方法，才能在执行时增强功能
        String str = proxy.doFirst("lzw",22);//myAround()
        System.out.println("str=" + str);
    }

}
