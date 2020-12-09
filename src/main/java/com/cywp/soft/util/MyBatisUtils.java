package com.cywp.soft.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class MyBatisUtils {

    //mybatis配置文件路径
    private static final String CONFIG_PATH = "mybatis-config.xml";
    //SqlSessionFactory工厂对象
    private SqlSessionFactory sqlSessionFactory = null;
    private SqlSession session = null;
    private static MyBatisUtils myBatisUtils = null;

    private MyBatisUtils(){
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader(CONFIG_PATH);
            //新建一个session工厂
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            //通过session工厂拿到session
            session = sqlSessionFactory.openSession(false);//打开事务，取消自动提交
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //获取mybatis单例
    public static synchronized MyBatisUtils getInstance(){
        if(null == myBatisUtils){
            synchronized (MyBatisUtils.class){
                myBatisUtils = new MyBatisUtils();
            }
        }
        return myBatisUtils;
    }
    //获取到session
    public synchronized SqlSession getSqlSession(){
        return session;
    }

}
