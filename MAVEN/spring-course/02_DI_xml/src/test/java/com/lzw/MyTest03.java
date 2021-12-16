package com.lzw;

import com.lzw.ba03.School;
import com.lzw.ba03.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;


public class MyTest03 {

    @Test
    public void testSpring01(){
        System.out.println("------testSpring01------");
        String config = "ba03/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        Student student = (Student) ac.getBean("myStudent2");
        System.out.println("Student对象：" + student);

        File myFile = (File) ac.getBean("myFile");
        System.out.println("File:" + myFile.getName());
    }

}
