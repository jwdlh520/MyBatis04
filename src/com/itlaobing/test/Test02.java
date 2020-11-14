package com.itlaobing.test;

import com.itlaobing.dao.StudentDaoBiz;
import com.itlaobing.domain.Student;
import com.itlaobing.util.SqlsessionUtil;
import com.itlaobing.vo.StudentAndClassVo;

import java.util.*;

public class Test02 {
    public static void main(String[] args) {
        //直接创建dao的代理对象
        StudentDaoBiz studentDaoBiz = SqlsessionUtil.getSqlsession().getMapper(StudentDaoBiz.class);
       /* Student student = studentDaoBiz.findById("A003");
        System.out.println(student);*/

        /*
         * 传入多个参数：
         * MyBatis中不允许一次传入多个参数
         *   1.使用引用数据类型（domain对象）
         *   2.使用map集合
         * */
        /*Student s1 = new Student();
        s1.setName("赵云");
        s1.setAge(25);*/
       /* Map<String,Object> map = new HashMap<>();
        map.put("name","赵云");
        map.put("age",25);
        Student s = studentDaoBiz.select2(map);
        System.out.println(s);*/

        //模糊查询:查询名字首字母为"j"的学生列表
        /*
        第一种：使用#{}的方式
        */
        /*List<Student> sList = studentDaoBiz.select3("j");
        for (Student student : sList){
            System.out.println(student);
        }*/
       /* List<Student> sList = studentDaoBiz.select4("j");
        for (Student student : sList){
            System.out.println(student);
        }*/

        //使用List<Map<Object,Object>>的形式获取学生的信息
       /* List<Map<String,Object>> mapList = studentDaoBiz.select5();
        for (Map<String,Object> map : mapList){
            Set<String> keys = map.keySet();
            for (String key : keys){
                System.out.println("key:" + key);
                System.out.println("value:" + map.get(key));
            }
            System.out.println("=================");
        }*/

        //当数据库中表的字段名称和domain的属性名称不一致时：
        /*List<Student> sList = studentDaoBiz.select6();
        for (Student student : sList){
            System.out.println(student);
        }*/
        /*
        结果：
            Student{id='A001', name='null', age=22}
            Student{id='A002', name='null', age=19}
            Student{id='A003', name='null', age=25}
            Student{id='A004', name='null', age=30}
            Student{id='A005', name='null', age=33}
            Student{id='A006', name='null', age=24}
            Student{id='A009', name='null', age=20}
        * */
        /*List<Student> sList = studentDaoBiz.select7();
        for (Student student : sList){
            System.out.println(student);
        }*/

        //使用动态sql where标签+if标签
        /*Student stu = new Student();
        stu.setName("j");
        stu.setAddress("dads");
        List<Student> sList = studentDaoBiz.select8(stu);
        for (Student student : sList){
            System.out.println(student);
        }*/

        //使用foreach标签传递参数。传递的参数是一个数组
        /*String[] ids = {"A001","A002","A004"};
        List<Student> sList = studentDaoBiz.select9(ids);
        for (Student student : sList){
            System.out.println(student);
        }*/
        /*Student s1 = new Student();
        s1.setId("A010");
        s1.setName("赵云");
        s1.setAge(25);
        s1.setAddress("北京");

        Integer i = studentDaoBiz.save(s1);
        System.out.println(i);*/

        /*Student student = studentDaoBiz.select10("A002");
        System.out.println(student);*/

        //多表联查功能：查询学生名称和对应的班级名称
        /*List<Map<String,Object>> mapList = studentDaoBiz.select11();
        for (Map<String,Object> map : mapList){
            Set<String> keys = map.keySet();
            for (String key : keys){
                System.out.println("key:" + key);
                System.out.println("value:" + map.get(key));
            }
            System.out.println("------------------------");
        }*/

        //多表联查功能：查询学生名称和对应的班级名称 使用VO
        /*List<StudentAndClassVo> voList = studentDaoBiz.select12();
        for (StudentAndClassVo vo : voList){
            System.out.println(vo);
        }*/

        //多表联查功能：查询名字带"今"的学生的全部信息
        List<StudentAndClassVo> voList = studentDaoBiz.select13("今");
        for (StudentAndClassVo vo : voList){
            System.out.println(vo);
        }

    }
}
