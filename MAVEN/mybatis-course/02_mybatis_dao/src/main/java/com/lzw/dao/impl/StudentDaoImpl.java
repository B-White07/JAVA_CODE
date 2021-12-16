package com.lzw.dao.impl;

import com.lzw.dao.StudentDao;
import com.lzw.domain.Student;
import com.lzw.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class StudentDaoImpl implements StudentDao {
    @Override
    public List<Student> selectStudent() {

        //  获取sqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        String sqlId = "com.lzw.dao.StudentDao.selectStudent";
        //  执行sql语句，使用sqlSession类的方法
        List<Student> stus = sqlSession.selectList(sqlId);
        //  关闭连接
        sqlSession.close();
        return stus;
    }

    @Override
    public int insertStudent(Student student) {
        //  获取sqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        String sqlId = "com.lzw.dao.StudentDao.insertStudent";
        //  执行sql语句，使用sqlSession类的方法
        int res = sqlSession.insert(sqlId,student);
        //  提交事务
        sqlSession.commit();
        //  关闭连接
        sqlSession.close();
        return res;
    }
}
