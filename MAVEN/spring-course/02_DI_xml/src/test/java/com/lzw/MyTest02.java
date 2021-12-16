package com.lzw;

import com.lzw.ba02.School;
import com.lzw.ba02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyTest02 {

    @Test
    public void testSpring01(){
        String config = "ba02/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student student = (Student) ac.getBean("myStudent");
        System.out.println("Student对象：" + student);

    }

    @Test
    public void test02(){
        Student student = new Student();
        student.setName("lzw");
        student.setAge(21);

        School school = new School();
        school.setAddress("上海");
        school.setName("复旦大学");

        student.setSchool(school);
        System.out.println(school);
    }

}
