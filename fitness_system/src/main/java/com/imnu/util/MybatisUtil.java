package com.imnu.util;




import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.IOException;
import java.io.InputStream;


public class MybatisUtil {
    private static SqlSessionFactory sqlSessionFactory;
    static{
        try {
        	/*
        	由于文件是存放在resources路径下的，
        	所以此处默认是指向resources下的文件，
        	故只写对应的文件名就能读取到指定的文件了
        	*/
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSession getSqlSession(){
        //设置为true是为了进行增删改的时候可以自动提交事务
        return sqlSessionFactory.openSession(true);
    }
}
