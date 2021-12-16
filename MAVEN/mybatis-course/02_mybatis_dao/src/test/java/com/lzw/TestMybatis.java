package com.lzw;

import com.lzw.dao.StudentDao;
import com.lzw.dao.impl.StudentDaoImpl;
import com.lzw.domain.Student;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TestMybatis {

    @Test
    public void testSelectStudent() {
        //com.lzw.dao.StudentDao
            StudentDao studentDao = new StudentDaoImpl();
        /**
         * List<Student> studentList = studentDao.selectStudent();调用
         * 1.studentDao对象的类型是StudentDao，全限定名称：com.lzw.dao.StudentDao
         *      全限定名称和namespace是一样的
         * 2.方法名称，selectStudents，这个方法就是mapper文件中的id值selectStudents
         * 3.通过dao中方法的返回值也可以确定MyBatis要调用的SqlSession方法
         *      如果返回List，调用的是SqlSession.selectList()方法。
         *      如果返回值int，或者非list，看mapper文件中的标签<insert>,<uodate>就会调用
         *      SqlSession的insert，update等方法
         *
         *      mybatis的动态代理：mybatis根据dao的方法调用，获取执行sql语句的信息
         *          mybatis根据你的dao接口，创建出一个dao接口的实现类，并创建这个类的对象
         *          完成SqlSession调用方法，访问数据库。
         */
        List<Student> studentList = studentDao.selectStudent();
            for(Student student : studentList){
                System.out.println("查询到的学生是：" + student);
            }
        }

        @Test
    public void testInsertStudent(){
            StudentDao studentDao = new StudentDaoImpl();
            int num = studentDao.insertStudent(new Student(1006, "admin2", "admin2@qq.com", 30));
            System.out.println("添加了" + num + "个学生");
        }
}