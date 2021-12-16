package com.lzw;

import com.lzw.ba01.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MyTest {

    @Test
    public void testSpring01(){
        String config = "ba01/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student student = (Student) ac.getBean("myStudent");
        System.out.println("Student对象：" + student);

        Date myDate = (Date) ac.getBean("myDate");
        System.out.println("myDate:" + myDate);
    }

}
