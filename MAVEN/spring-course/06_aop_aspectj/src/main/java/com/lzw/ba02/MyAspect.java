package com.lzw.ba02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

@Aspect
public class MyAspect {
    /*
    后置通知定义方法，方法是实现切面功能的
    方法的定义要求：
    1.公共的   public
    2.无返回值  void
    3.名称自定义
    4.有参数，推荐使用Object，参数名自定义
     */

    /**
     * @AfterReturning:后置通知
     *              属性：1.value  切入点表达式
     *                         2.returning  自定义的变量，表示目标方法的返回值的。
     *                                       自定义变量名必须和通知方法的形参名一样。
     *              位置：在方法定义的上面
     *              特点：
     *                      1.在目标方法之后执行
     *                      2.能够获取到目标方法的返回值，可以根据这个返回值做不同的处理功能
     *                          Object res = doOther();
     *                      3.可以修改这个返回值
     *              后置通知的执行：
     *                      Object res = doOther();
     *                      参数传递：传值，传引用
     *                      myAfterReturning(res);
     *                      System.out.println("res：" + res);
     */
    @AfterReturning(value = "execution(* *..SomeServiceImpl.doOther(..))",returning = "res")
    public void myAfterReturning(JoinPoint joinPoint,Object res) {
        //  Object res ：是目标方法执行后的返回值，根据返回值做切面功能的处理
        System.out.println("后置通知：方法的定义" + joinPoint.getSignature());
        System.out.println("后置通知：在目标方法之后执行，获取的返回值是：" + res);

        //  修改目标方法的返回值，看一下是否会影响最后的方法调用结果
        if( res != null){
            res = "Hello Aspectj";
        }
    }

    @AfterReturning(value = "execution(* *..SomeServiceImpl.doOther2(..))",returning = "res")
    public void myAfterReturning2(Student res) {
        //  Object res ：是目标方法执行后的返回值，根据返回值做切面功能的处理
        System.out.println("后置通知：在目标方法之后执行，获取的返回值是：" + res);

        //  修改目标方法的返回值，看一下是否会影响最后的方法调用结果
        //  修改了res的内容，属性值等，是否会影响最后的调用结果
        if(res.getName() != null){
            res.setName("zjl");
        }

    }
}
