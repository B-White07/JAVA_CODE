package com.lzw;

import com.lzw.dao.StudentDao;
import com.lzw.domain.MyStudent;
import com.lzw.domain.Student;
import com.lzw.utils.MyBatisUtils;
import com.lzw.vo.QueryParam;
import com.lzw.vo.ViewStudent;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class TestMybatis {

    @Test
    public void testSelectStudentById() {

        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Student student = dao.selectStudentById(1002);
        System.out.println(student);
        sqlSession.close();
    }

    @Test
    public void testSelectMultiParam(){
            SqlSession sqlSession = MyBatisUtils.getSqlSession();
            StudentDao dao = sqlSession.getMapper(StudentDao.class);
            List<Student> studentList = dao.selectMultiParam("admin", 30);
            for(Student student : studentList){
                System.out.println(student);
            }
        sqlSession.close();
    }

    @Test
    public void testSelectViewStudentById() {

        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        ViewStudent viewStudent = dao.selectStudentReturnViewStudent(1003);
        System.out.println(viewStudent);
        sqlSession.close();
    }

    @Test
    public void testCountStudent() {

        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        int countStudent = dao.countStudent();
        System.out.println("totalNums:" + countStudent);
        sqlSession.close();
    }

    //  返回Map
    @Test
    public void testSelectMapById() {

        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        Map<Object, Object> countStudent = dao.selectMapById(1003);
        System.out.println("totalNums:" + countStudent);
        sqlSession.close();
    }

    @Test
    public void testSelectAllStudents(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<Student> studentList = dao.selectAllStudents();
        for(Student student : studentList){
            System.out.println(student);
        }
        sqlSession.close();
    }

    @Test
    public void testSelectMyStudent(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<MyStudent> studentList = dao.selectMyStudent();
        for(MyStudent myStudent : studentList){
            System.out.println(myStudent);
        }
        sqlSession.close();
    }

    @Test
    public void testSelectDiffColProperty(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<MyStudent> studentList = dao.selectDiffColProperty();
        for(MyStudent myStudent : studentList){
            System.out.println(myStudent);
        }
        sqlSession.close();
    }

    @Test
    public void testSelectLikeOne(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        //  定义好like的内容
        String name = "%l%";
        List<Student> students = dao.selectLikeOne(name);

        for(Student student : students){
            System.out.println(student);
        }
        sqlSession.close();
    }

    @Test
    public void testSelectLikeTwo(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        //  定义好like的内容
        String name = "l";
        List<Student> students = dao.selectLikeTwo(name);

        for(Student student : students){
            System.out.println(student);
        }
        sqlSession.close();
    }

}