package com.lzw;

import com.lzw.domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMybatis {
    //  测试方法，测试功能
    @Test
    public void testInsert() throws IOException {
        //  访问mybatis读取student数据
        //  1.定义mybatis主配置文件的名称，从类路径开始（target/classes）
        String config = "mybatis.xml";
        //  2.读取这个config文件
        InputStream resourceAsStream = Resources.getResourceAsStream(config);
        //  3.创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //  4.创建SqlSessionFactory对象
        SqlSessionFactory factory = builder.build(resourceAsStream);
        //  5.【重要】获取SqlSession对象，从SqlSessionFactory中获取获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //  6.【重要】指定要执行的sql语句的表示。sql映射文件中的namespace + “.” + 标签的id
        String sqlId = "com.lzw.dao.StudentDao" + "." + "insertStudent";
        //  7.执行sql语句，通过sqlId找到语句
        int nums = sqlSession.insert(sqlId, new Student(1009, "hda", "haa@qq.com", 30));

        //  mybatis默认不自动提交事务，需要在 insert，update，delete后手动提交事务
        sqlSession.commit();

        //  8.输出结果
//        studentList.forEach( stu -> System.out.println(stu));
        System.out.println("执行insert，共有" + nums + "行数据受到影响");
        //  9.关闭SqlSession对象
        sqlSession.close();
    }
}
