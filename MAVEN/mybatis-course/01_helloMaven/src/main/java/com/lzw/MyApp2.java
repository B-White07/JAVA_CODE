package com.lzw;

import com.lzw.domain.Student;
import com.lzw.utils.MyBatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyApp2 {
    public static void main(String[] args) throws IOException {

        //  利用工具类获取SqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        //  6.【重要】指定要执行的sql语句的表示。sql映射文件中的namespace + “.” + 标签的id
        String sqlId = "com.lzw.dao.StudentDao" + "." + "selectStudent";
        //  7.执行sql语句，通过sqlId找到语句
        List<Student> studentList = sqlSession.selectList(sqlId);
        //  8.输出结果
        studentList.forEach( stu -> System.out.println(stu));
//        for(Student stu : studentList){
//            System.out.println("查询到的学生是：" + stu);
//        }
        //  9.关闭SqlSession对象
        sqlSession.close();
    }
}
