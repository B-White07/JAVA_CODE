package com.lzw;

import com.lzw.dao.StudentDao;
import com.lzw.domain.Student;
import com.lzw.utils.MyBatisUtils;
import com.lzw.vo.QueryParam;
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
    public void testSelectMultiObject(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<Student> studentList = dao.selectMultiObject(new QueryParam("zjl",30));
        for(Student student : studentList){
            System.out.println(student);
        }
        sqlSession.close();
    }

    @Test
    public void testSelectMultiStudent(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<Student> studentList = dao.selectMultiStudent(new Student(1002,"zjl","ljj@qq.com",30));
        for(Student student : studentList){
            System.out.println(student);
        }
        sqlSession.close();
    }

    @Test
    public void testSelectMultiPosition(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<Student> studentList = dao.selectMultiPosition("zjl",30);
        for(Student student : studentList){
            System.out.println(student);
        }
        sqlSession.close();
    }

    @Test
    public void testSelectMultiMap(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        Map<String,Object> map = new HashMap<String, Object>();
        map.put("myname","zjl");
        map.put("myage",40);
        List<Student> studentList = dao.selectMultiMap(map);

        for(Student student : studentList){
            System.out.println(student);
        }
        sqlSession.close();
    }

    @Test
    public void testSelectUse$(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        List<Student> studentList = dao.selectUse$("'李增伟';select * from student");

        for(Student student : studentList){
            System.out.println(student);
        }
        sqlSession.close();
    }

    @Test
    public void testSelectUse$Order(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        List<Student> studentList = dao.selectUse$Order("age");

        for(Student student : studentList){
            System.out.println(student);
        }
        sqlSession.close();
    }
}