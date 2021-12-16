package com.lzw;

import com.lzw.ba02.SomeService;
import com.lzw.ba02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Mytest02 {

    @Test
    public void test01(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeService proxy = (SomeService) ac.getBean("someService");
        //  proxy:com.sun.proxy.$Proxy8:jdk的动态代理
        System.out.println("proxy:" + proxy.getClass().getName());
        //  通过代理对象执行方法，才能在执行时增强功能
        String str = proxy.doOther("lzw",22);
        System.out.println("str=" + str);
    }

    @Test
    public void test02(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeService proxy = (SomeService) ac.getBean("someService");
        //  proxy:com.sun.proxy.$Proxy8:jdk的动态代理
        //System.out.println("proxy:" + proxy.getClass().getName());
        //  通过代理对象执行方法，才能在执行时增强功能
        Student student = proxy.doOther2("lzw",22);
        System.out.println("student=" + student);
    }
}
