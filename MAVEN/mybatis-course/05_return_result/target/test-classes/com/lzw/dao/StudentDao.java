
package com.lzw.dao;

import com.lzw.domain.MyStudent;
import com.lzw.domain.Student;
import com.lzw.vo.QueryParam;
import com.lzw.vo.ViewStudent;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface StudentDao {


    public Student selectStudentById(@Param("id") Integer id);

    List<Student> selectMultiParam(@Param("myname") String name,@Param("myage") Integer age);

    ViewStudent selectStudentReturnViewStudent(@Param("sid") Integer id);

    int countStudent();

    //  定义一个方法返回Map
    Map<Object,Object> selectMapById(Integer id);

    /**
     *  使用resultMap定义映射关系
     */
    List<Student> selectAllStudents();

    List<MyStudent> selectMyStudent();

    List<MyStudent> selectDiffColProperty();

    /*  第一种模糊查询，在java代码中指定like的内容*/
    List<Student>  selectLikeOne(String name);

    /*  name就是值，在mapper中拼接 like "%" l "%" */
    List<Student>  selectLikeTwo(String name);
}
