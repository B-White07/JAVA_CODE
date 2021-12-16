package homework;

import java.util.Objects;

public class Student {
    private String no;
    private String name;
    private char sex;
    private int age;

    @Override
    public String toString() {
        return  "学号：" + no  +"\t\t姓名：" + name  + "\t\t性别：" + sex + "\t\t年龄：" + age ;
    }

    public Student() {
        sex = '男';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex &&
                age == student.age &&
                no.equals(student.no) &&
                name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, name, sex, age);
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
