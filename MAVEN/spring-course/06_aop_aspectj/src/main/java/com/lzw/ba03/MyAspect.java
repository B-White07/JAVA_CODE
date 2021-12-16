package com.lzw.ba03;

import com.lzw.ba02.Student;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Date;

@Aspect
public class MyAspect {
    /*
    环绕通知定义方法，方法是实现切面功能的
    方法的定义要求：
    1.公共的   public
    2.必须有返回值，推荐使用Object
    3.名称自定义
    4.有固定的参数，ProceedingJoinPoint
     */

    /**
     * @Around：环绕通知
     *              属性：value    切入点表达式
     *              位置：在方法的定义上
     *              特点：
     *                  1.他是功能最强的通知
     *                  2.在目标方法的前和后都能增强功能
     *                  3.控制目标方法是否被调用执行
     *                  4.修改原来的目标方法的执行结果。影响最后的调用结果
     *
     *              环绕通知等同于jak的动态代理，InvocationHandler接口
     *
     *              参数： ProceedingJoinPoint 等同于 Method
     *              作用：执行目标方法的
     *              返回值：就是目标方法的执行结果，可以被修改
     *
     *              环绕通知：经常做事务，在目标方法之前开启事务，执行目标方法，在目标方法之后提交事务
     */
    @Around(value = "execution(* *..SomeServiceImpl.doFirst(..))")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        String temp = "";
        //  获取第一个参数
        Object[] args = pjp.getArgs();
        if(args != null && args.length > 1){
            //System.out.println(args.length);
            temp = (String) args[0];

        }
        //  实现环绕通知
        Object res = null;
        //  1.目标方法调用
        System.out.println("环绕通知：在目标方法之前，输出时间：" + new Date());

        if("lzw".equals(temp)){
            //  符合条件，调用目标方法
            res = pjp.proceed();//method.invoke();Object res = doFirst();
        }

        System.out.println("环绕通知：在目标方法之后，提交事务");
        //  2.在目标方法前后加入功能

        //  修改目标方法的执行结果，影响方法最后的调用
        if(res != null){
            res = "Hello Aspectj AOP";
        }
        //  返回目标方法的执行结果
        return res;
    }
}
