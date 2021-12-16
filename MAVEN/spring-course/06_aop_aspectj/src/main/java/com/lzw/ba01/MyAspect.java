package com.lzw.ba01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

/**
 * @Aspect : 是aspectj框架中的注解
 *          作用：表示当前类是切面类
 *          切面类：用来给目标的业务方法增加功能，在这个类中有切面的功能代码
 *          位置：在类定义的上面
 */
@Aspect
public class MyAspect {
    /*
    定义方法，方法是实现切面功能的
    方法的定义要求：
    1.公共的   public
    2.无返回值  void
    3.名称自定义
    4.可以有参数，也可以没有参数
        如果有参数，参数不是自定义的，有几个参数类型可以使用
     */

    /**
     * @Before:前置通知注解
     *      属性：value，是切入点表达式，表示切面的功能执行的位置。
     *      位置：在方法的上面
     *      特点：
     *          1.在目标方法之前执行
     *          2.不会改变目标方法的执行结果
     *          3.不会影响目标方法的执行
     */
/*    @Before(value = "execution(public void com.lzw.ba01.SomeServiceImpl.doSome(String,Integer))")
    public void myBefore(){
        //  切面要执行的代码
        System.out.println("前置通知，切面功能：在目标方法之前输出执行时间：" + new Date());
    }*/

/*    @Before(value = "execution( void com.lzw.ba01.SomeServiceImpl.doSome(String,Integer))")
    public void myBefore(){
        //  切面要执行的代码
        System.out.println("1前置通知，切面功能：在目标方法之前输出执行时间：" + new Date());
    }*/

/*    @Before(value = "execution( void *..SomeServiceImpl.doSome(String,Integer))")
    public void myBefore(){
        //  切面要执行的代码
        System.out.println("2前置通知，切面功能：在目标方法之前输出执行时间：" + new Date());
    }*/

/*    @Before(value = "execution( * *..SomeServiceImpl.do*(..))")
    public void myBefore(){
        //  切面要执行的代码
        System.out.println("3前置通知，切面功能：在目标方法之前输出执行时间：" + new Date());
    }
    @Before(value = "execution( * *..SomeServiceImpl.do*(..))")
    public void myBefore2(){
        //  切面要执行的代码
        System.out.println("3前置通知，切面功能：在目标方法之前输出执行时间：" + new Date());
    }*/

    /*
    指定通知方法中的参数：JoinPoint
    JoinPoint：业务方法，要加入切面功能的业务方法
        作用是：可以在通知方法中获取方法执行是的信息，例如方法名称，实参。
        如果你的切面功能中要用到方法的信息，就加入JoinPoint
        这个JoinPoint参数的值由框架赋予，必须是第一个位置的参数
     */
    @Before(value = "execution( void *..SomeServiceImpl.doSome(String,Integer))")
    public void myBefore(JoinPoint jp){
        //  获取方法的完整的定义
        System.out.println("方法的签名（定义） = " + jp.getSignature());
        System.out.println("方法的名称 = " + jp.getSignature().getName());
        //  获取方法的实参
        Object[] args = jp.getArgs();
        for(Object arg : args){
            System.out.println("参数 = " + arg);
        }
        //  切面要执行的代码
        System.out.println("2前置通知，切面功能：在目标方法之前输出执行时间：" + new Date());
    }
}
