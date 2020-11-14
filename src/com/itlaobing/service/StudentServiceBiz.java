package com.itlaobing.service;

import com.itlaobing.domain.Student;

import java.util.List;

public interface StudentServiceBiz {
    Student findById(String id);

    List<Student> findAll();

    Integer delById(String id);

    Integer update(Student s);

    Integer save(Student s);
}
