package com.lzw.dao;

import com.lzw.domain.Student;

import java.util.List;

public interface StudentDao {

    List<Student> selectStudent();

    int insertStudent(Student student);
}
