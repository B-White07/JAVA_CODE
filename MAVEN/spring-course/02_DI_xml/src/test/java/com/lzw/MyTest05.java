package com.lzw;

import com.lzw.ba05.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyTest05 {

    @Test
    public void testSpring01(){
        System.out.println("------testSpring01------");
        String config = "ba05/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        Student student = (Student) ac.getBean("myStudent");
        System.out.println("Student对象：" + student);

    }

}
