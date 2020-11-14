package com.itlaobing.dao;

import com.itlaobing.domain.Student;
import com.itlaobing.vo.StudentAndClassVo;

import java.util.List;
import java.util.Map;

public interface StudentDaoBiz {
    Student findById(String id);

    List<Student> findAll();

    Integer delById(String id);

    Integer update(Student s);

    Integer save(Student s);

    Student select1(Student s1);

    Student select2(Map<String, Object> map);

    List<Student> select3(String j);

    List<Student> select4(String j);

    List<Map<String, Object>> select5();

    List<Student> select6();

    List<Student> select7();

    List<Student> select8(Student stu);

    List<Student> select9(String[] ids);

    Student select10(String a001);

    List<Map<String, Object>> select11();

    List<StudentAndClassVo> select12();

    List<StudentAndClassVo> select13(String name);
}
