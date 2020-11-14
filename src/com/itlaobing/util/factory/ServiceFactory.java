package com.itlaobing.util.factory;

import com.itlaobing.util.handler1.SqlsessionInvocationHandler;

public class ServiceFactory {
    public static Object getService(Object obj){
        return new SqlsessionInvocationHandler(obj).getProxy();
    }
}
