package com.lzw;

import com.lzw.service.SomeService;
import com.lzw.service.impl.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MyTest {
    @Test
    public void testDoSome(){
        SomeService someService = new SomeServiceImpl();
        someService.doSome();
    }


    /**
     * spring默认创建对象的时间：在创建spring容器时，会创建配置文件中的所有对象。
     * spring创建对象，默认调用无参构造
     */
    @Test
    public void testSpring01(){
        //  使用spring容器创建的对象
        //  1.指定spring配置文件的名称
        String config = "beans.xml";
        //  2.创建表示spring容器的对象
        //  ApplicationContext表示Spring容器，通过容器获取对象
        //  ClassPathXmlApplicationContext:表示从类路径家再spring的配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //  从容器中获取某个对象，调用对象的方法
        //  getBean("配置文件中的bean的id值");
        SomeService someService = (SomeService) ac.getBean("someService");
        //  使用spring创建好的对象
        someService.doSome();
    }

    /**
     * 获取spring容器中Java对象的信息
     */
    @Test
    public void testSpring02(){
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //  使用spring提供的方法，获取容器中定义的对象的数量
        int nums = ac.getBeanDefinitionCount();
        System.out.println("容器中定义的对象的数量：" + nums);
        //  容器中每个定义的对象的名称
        String[] names = ac.getBeanDefinitionNames();
        for(String name : names){
            System.out.println(name);
        }
    }

    //  获取一个非自定义类的对象
    @Test
    public void testSpring03(){
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Date mydate = (Date) ac.getBean("mydate");
        System.out.println(mydate);
    }
}
