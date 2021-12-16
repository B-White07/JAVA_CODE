package com.lzw.ba07;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("myStudent")
public class Student {

    @Value("zlw")
    private String name;
    @Value("21")
    private int age;

    /**
     *  引用类型
     * @Resource：来自jdk中的注解，spring框架提供了对这个注解的功能支持，可以使用它给引用类型赋值
     *                      使用的也是自动注入原理，支持byName，byType，默认byName
     *  位置：1.在属性定义的上面，无需set方法，推荐使用
     *              2.在set方法上面
     * @Resource只是用byName方式，需要增加一个属性name
     * name的值是bean的id
     */
    //  默认byName：先使用byName自动注入，如果byName赋值失败，在使用byType
    @Resource(name = "mySchool")
    private School school;

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

    public void setAge(int age) {
        System.out.println("setAge:" + age);
        this.age = age;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }

}
