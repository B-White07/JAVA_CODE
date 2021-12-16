package com.lzw.service;

import com.lzw.handler.MyIncationHandler;
import com.lzw.service.impl.SomeServiceImpl;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import static org.junit.Assert.*;

public class SomeServiceTest {

    @Test
    public void doSome() {
//        SomeService someService = new SomeServiceImpl();
//        someService.doSome();
        //  使用jdk的Proxy创建代理对象
        //  创建目标对象
        SomeService someService = new SomeServiceImpl();
        //  创建InvocationHandler对象
        InvocationHandler handler = new MyIncationHandler(someService);
        //  使用Proxy创建代理
        SomeService proxy = (SomeService) Proxy.newProxyInstance(someService.getClass().getClassLoader(),
                someService.getClass().getInterfaces(), handler);
        //  通过代理执行方法，会调用handler中的invoke()
        proxy.doSome();

    }

    @Test
    public void doOther() {
//        SomeService someService = new SomeServiceImpl();
//        someService.doOther();

        //        SomeService someService = new SomeServiceImpl();
//        someService.doSome();
        //  使用jdk的Proxy创建代理对象
        //  创建目标对象
        SomeService someService = new SomeServiceImpl();
        //  创建InvocationHandler对象
        InvocationHandler handler = new MyIncationHandler(someService);
        //  使用Proxy创建代理
        SomeService proxy = (SomeService) Proxy.newProxyInstance(someService.getClass().getClassLoader(),
                someService.getClass().getInterfaces(), handler);
        //  通过代理执行方法，会调用handler中的invoke()
        proxy.doOther();
    }
}