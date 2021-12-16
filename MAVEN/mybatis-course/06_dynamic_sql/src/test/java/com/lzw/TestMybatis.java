package com.lzw;

import com.github.pagehelper.PageHelper;
import com.lzw.dao.StudentDao;
import com.lzw.domain.Student;
import com.lzw.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TestMybatis {

    @Test
    public void testSelectStudentIf() {

        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        Student stu= new Student();
        //stu.setName("zjl");
        stu.setAge(20);

        List<Student> studentList = dao.selectStudentIf(stu);
        for(Student student :studentList){
            System.out.println(student);
        }

        sqlSession.close();
    }

    @Test
    public void testSelectStudentWhere() {

        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        Student stu= new Student();
        stu.setName("zjl");
        stu.setAge(20);

        List<Student> studentList = dao.selectStudentWhere(stu);
        for(Student student :studentList){
            System.out.println(student);
        }

        sqlSession.close();
    }

    @Test
    public void testFor(){
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(1001);
        integerList.add(1002);
        integerList.add(1003);
        //String sql = "select id,name,email,age from student id in (1001,1002,1003)";
        String sql = "select id,name,email,age from student id in ";

        StringBuilder builder = new StringBuilder("");
        builder.append("(");
        for(Integer i : integerList){
            if(integerList.size() - 1 != integerList.indexOf(i)){
                builder.append(i).append(",");
            }else {
                builder.append(i).append(")");
            }
        }

        sql = sql + builder.toString();
        System.out.println(sql);
    }

    @Test
    public void testSelectForeachOne() {

        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        List<Integer> list = new ArrayList<Integer>();
        list.add(1001);
        list.add(1002);
        list.add(1003);

        List<Student> studentList = dao.selectForeachOne(list);
        for(Student student :studentList){
            System.out.println(student);
        }

        sqlSession.close();
    }

    @Test
    public void testSelectForeachTwo() {

        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        List<Student> studentList = new ArrayList<Student>();
        Student s1 = new Student();
        s1.setId(1001);
        studentList.add(s1);

        s1 = new Student();
        s1.setId(1004);
        studentList.add(s1);

        List<Student> students = dao.selectForeachTwo(studentList);
        for(Student student :students){
            System.out.println(student);
        }

        sqlSession.close();
    }

    @Test
    public void testSelectAll() {

        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        //  加入PageHelper的方法，分页
        //  pageNum：第几页，从1开始
        //  pageSize：一页中有多少行数据
        PageHelper.startPage(4,3);
        List<Student> studentList = dao.selectAll();
        for(Student student :studentList){
            System.out.println(student);
        }

        sqlSession.close();
    }
}