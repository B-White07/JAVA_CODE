
package com.lzw.dao;


import com.lzw.domain.Student;

import java.util.List;

public interface OrderDao {

    //  动态sql，要使用java对象作为参数
    List<Student> selectStudentIf(Student student);

    //  where的使用
    List<Student> selectStudentWhere(Student student);

    //  foreach 用法1
    List<Student> selectForeachOne(List<Integer> idList);

    //  foreach 用法2
    List<Student> selectForeachTwo(List<Student> stuList);
}
