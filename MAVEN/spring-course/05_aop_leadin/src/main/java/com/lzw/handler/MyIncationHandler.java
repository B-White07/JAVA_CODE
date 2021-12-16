package com.lzw.handler;

import com.lzw.utils.ServiceTools;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyIncationHandler implements InvocationHandler {

    //  目标对象
    private Object target; //   最终会是目标类：SomeServiceImpl

    public MyIncationHandler(Object target) {
        this.target = target;
    }

    public MyIncationHandler() {
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //  通过代理对象执行方法时，会调用invoke()方法
        System.out.println("执行了MyIncationHandler中的invoke()方法");
        System.out.println("method名称：" + method.getName());
        String methodName = method.getName();
        Object res = null;

        if("doSome".equals(methodName)){//  joinpoint ，pointcut
            ServiceTools.doLog();// 目标方法之前，输出时间
            //  执行目标类的方法，通过Method类实现
            method.invoke(target,args); //  SomeServiceImpl.doSome(),doOther()
            ServiceTools.doTrans();//   目标方法之后，提交事务
        }else {
            method.invoke(target,args); //  SomeServiceImpl.doOther()
        }

        //  目标方法执行结果
        return res;
    }
}
