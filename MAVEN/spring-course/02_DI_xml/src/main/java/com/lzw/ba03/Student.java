package com.lzw.ba03;

public class Student {

    private String name;
    private int age;

    //  声明一个引用类型
    private School school;

    public Student() {
        System.out.println("------spring调用无参构造------");
    }

    public Student(String name, int age, School school) {
        System.out.println("------student的有参构造------");
        this.name = name;
        this.age = age;
        this.school = school;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
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
