package com.itlaobing.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlsessionUtil {
    private SqlsessionUtil(){}
    private static SqlSessionFactory sqlSessionFactory;
    static {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }
    private static ThreadLocal<SqlSession> t = new ThreadLocal<>();
    /*
        获取sqlSession对象
     */
   /* public static SqlSession getSqlsession(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSession;
    }*/

    public static SqlSession getSqlsession(){
        SqlSession sqlSession = t.get();
        if(sqlSession == null){
            sqlSession = sqlSessionFactory.openSession();
            t.set(sqlSession);
        }
        return sqlSession;
    }

    /*
        关闭sqlSession对象
     */
    /*public static void close(SqlSession sqlSession){
        if (sqlSession != null){
            sqlSession.close();
        }
    }*/
    public static void close(SqlSession sqlSession){
        if (sqlSession != null){
            sqlSession.close();
            t.remove();
        }
    }
}
