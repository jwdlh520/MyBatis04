package com.itlaobing.service.impl;

import com.itlaobing.dao.StudentDaoBiz;
import com.itlaobing.domain.Student;
import com.itlaobing.service.StudentServiceBiz;
import com.itlaobing.util.SqlsessionUtil;

import java.util.List;

public class StudentServiceImpl implements StudentServiceBiz {
    //获取dao的代理类对象
    private StudentDaoBiz sDao = SqlsessionUtil.getSqlsession().getMapper(StudentDaoBiz.class);
    @Override
    public Student findById(String id) {
        Student s = sDao.findById(id);
        return s;
    }

    @Override
    public List<Student> findAll() {
        List<Student> sList = sDao.findAll();
        return sList;
    }

    @Override
    public Integer delById(String id) {
        Integer res = sDao.delById(id);
        return res;
    }

    @Override
    public Integer update(Student s) {
        Integer res = sDao.update(s);
        return res;
    }

    @Override
    public Integer save(Student s) {
        Integer res = sDao.save(s);
        return res;
    }
}
