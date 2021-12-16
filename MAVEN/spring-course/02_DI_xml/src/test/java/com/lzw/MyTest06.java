package com.lzw;

import com.lzw.ba06.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyTest06 {

    @Test
    public void testSpring01(){
        System.out.println("------testSpring01------");
        //  加载总文件
        String config = "ba06/total.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        Student student = (Student) ac.getBean("myStudent");
        System.out.println("Student对象：" + student);

    }

}
