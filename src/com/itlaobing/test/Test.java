package com.itlaobing.test;

import com.itlaobing.domain.Student;
import com.itlaobing.service.StudentServiceBiz;
import com.itlaobing.service.impl.StudentServiceImpl;
import com.itlaobing.util.factory.ServiceFactory;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        StudentServiceBiz ss = (StudentServiceBiz) ServiceFactory.getService(new StudentServiceImpl());
        Student s1 = new Student();
        s1.setId("A001");
        s1.setName("赵云");
        s1.setAge(25);
        s1.setAddress("北京");
       ss.delById("A001");
    }
}
