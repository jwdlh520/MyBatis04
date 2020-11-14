package com.itlaobing.util.handler1;

import com.itlaobing.util.SqlsessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SqlsessionInvocationHandler implements InvocationHandler {
    private Object target;

    public SqlsessionInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        SqlSession sqlSession = null;
        Object res = null;
        try {
            sqlSession = SqlsessionUtil.getSqlsession();
            res = method.invoke(target, args);
            sqlSession.commit();
        } catch (Exception e) {
            sqlSession.rollback();
            e.printStackTrace();
        } finally {
            SqlsessionUtil.close(sqlSession);
        }
        return res;
    }

    /*
        获取代理类对象
     */
    public Object getProxy(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
}
