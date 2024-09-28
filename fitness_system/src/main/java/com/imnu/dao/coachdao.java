package com.imnu.dao;

import com.imnu.pojo.coachbean;
import com.imnu.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class coachdao {
    public List<coachbean> selectallcoach(String name){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        coachmapper mapper = sqlSession.getMapper(coachmapper.class);

        List<coachbean> selectallcoach = mapper.selectallcoach(name);
        return selectallcoach;
    }

    public int insertCoach(String name){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        coachmapper mapper = sqlSession.getMapper(coachmapper.class);
        int i = mapper.insertCoach(name);
        return i;
    }

    public int updateCoach(coachbean coach){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        coachmapper mapper = sqlSession.getMapper(coachmapper.class);
        int i = mapper.updateCoach(coach);
        return i;
    }

    public List<coachbean> selectSomeCoach(String name){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        coachmapper mapper = sqlSession.getMapper(coachmapper.class);
        List<coachbean> coachbeans = mapper.selectSomeCoach(name);
        return coachbeans;
    }

    public List<coachbean> selectAllcoach(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        coachmapper mapper = sqlSession.getMapper(coachmapper.class);
        List<coachbean> coachbeanList = mapper.selectAllcoach();
        return coachbeanList;
    }

    public String selectonecoachnamebyid(int id){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        coachmapper mapper = sqlSession.getMapper(coachmapper.class);
        String selectonecoachnamebyid = mapper.selectonecoachnamebyid(id);
        return selectonecoachnamebyid;
    }
}
