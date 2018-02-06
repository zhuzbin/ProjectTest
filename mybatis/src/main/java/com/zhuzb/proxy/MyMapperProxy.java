package com.zhuzb.proxy;

import org.apache.ibatis.session.SqlSession;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/1/15
 * Time：16:55
 */
public class MyMapperProxy<T> implements InvocationHandler {
    private Class<T> mapperInterface;
    private SqlSession sqlSession;

    public MyMapperProxy(Class<T> mapperInterface, SqlSession sqlSession) {
        this.mapperInterface = mapperInterface;
        this.sqlSession = sqlSession;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String name = mapperInterface.getCanonicalName()+"."+method.getName();
        List<T> list = sqlSession.selectList(name);
        //T list = sqlSession.selectOne(name,args);
        return list;
    }
}
