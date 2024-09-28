package com.imnu.dao;

import com.imnu.pojo.dingdanbean;
import com.imnu.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class dingdandao {
    public List<dingdanbean> selectalldingdan(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        dingdanmapper mapper = sqlSession.getMapper(dingdanmapper.class);
        List<dingdanbean> selectalldingdan = mapper.selectalldingdan();
        return selectalldingdan;

    }

    public List<dingdanbean> selectByUsername(String name){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        dingdanmapper mapper = sqlSession.getMapper(dingdanmapper.class);
        List<dingdanbean> dingdanbeans = mapper.selectByUsername(name);
        return dingdanbeans;
    }

    public int updatepaymessage(int id){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        dingdanmapper mapper = sqlSession.getMapper(dingdanmapper.class);
        int updatepaymessage = mapper.updatepaymessage(id);
        return updatepaymessage;
    }

    public int updatecomments(String comments , int id){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        dingdanmapper mapper = sqlSession.getMapper(dingdanmapper.class);
        int updatecomments = mapper.updatecomments(comments, id);
        return updatecomments;
    }

    public int insertdingdan(dingdanbean dingdan){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        dingdanmapper mapper = sqlSession.getMapper(dingdanmapper.class);

        int insertdingdan = mapper.insertdingdan(dingdan);
        return   insertdingdan;
    }

    public List<dingdanbean> selectnopaydingdan(String name){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        dingdanmapper mapper = sqlSession.getMapper(dingdanmapper.class);

        List<dingdanbean> selectnopaydingdan = mapper.selectnopaydingdan(name);
        return selectnopaydingdan;
    }
}
