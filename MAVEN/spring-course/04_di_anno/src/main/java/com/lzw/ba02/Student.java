package com.lzw.ba02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myStudent")
public class Student {

    /**
     * @Value：简单类型的属性赋值
     *      属性：value是String类型的，表示简单类型的属性值
     *      位置：1.在属性定义的上面，无需set方法，推荐使用
     *                 2.在set方法上面
     */
    //@Value("zlw")
    @Value("${myname}")
    private String name;
    @Value("${myage}")
    private int age;

    public Student() {
        System.out.println("student的无参构造");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public int getAge() {
        return age;
    }

    //@Value("22")
    public void setAge(int age) {
        System.out.println("setAge:" + age);
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
