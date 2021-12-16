package com.lzw;

import com.lzw.dao.StudentDao;
import com.lzw.domain.Student;
import com.lzw.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TestMybatis {

    @Test
    public void testSelectStudents() {
        /**
         * 使用mubatis的动态代理机制，使用SqlSession.getMapper（dao接口）
         * getMapper能获取dao接口对应的实现类对象
         */
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        //  dao:com.sun.proxy.$Proxy2:jdk的动态代理
        System.out.println("dao:" + dao.getClass().getName());
        //  调用dao的方法，执行数据库操作
        List<Student> studentList = dao.selectStudents();
        for(Student student : studentList){
            System.out.println(student);
        }
        sqlSession.close();
    }

    @Test
    public void testInsertStudent(){
            SqlSession sqlSession = MyBatisUtils.getSqlSession();
            StudentDao dao = sqlSession.getMapper(StudentDao.class);
            int num = dao.insertStudent(new Student(1006, "admin2", "admin2@qq.com", 30));
            sqlSession.commit();
            System.out.println("添加了" + num + "个学生");
            sqlSession.close();
        }
}