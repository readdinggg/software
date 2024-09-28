package com.imnu.dao;

import com.imnu.pojo.userbean;
import com.imnu.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class userdao {
    public List<userbean> selectAll(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        usermapper mapper = sqlSession.getMapper(usermapper.class);
        List<userbean> userList = mapper.getUserList();

        return userList;
    }

    public userbean selectById(int id){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        usermapper mapper = sqlSession.getMapper(usermapper.class);
        userbean userbean = mapper.selectById(id);
        return userbean;
    }

    public int add(userbean user){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        usermapper mapper = sqlSession.getMapper(usermapper.class);
        int insert = mapper.insert(user);
        return insert;
    }

    public int delete(int id){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        usermapper mapper = sqlSession.getMapper(usermapper.class);
        int delete = mapper.delete(id);
        return delete;
    }

    public int updatename(userbean u1){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        usermapper mapper = sqlSession.getMapper(usermapper.class);
        int updatename = mapper.updatename(u1);
        return updatename;
    }

    public int IsLive(String name,String password){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        usermapper mapper = sqlSession.getMapper(usermapper.class);
        int IsLive = mapper.selectIsLive(name, password);
        return IsLive;
    }

    public int Is_exist(String name){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        usermapper mapper = sqlSession.getMapper(usermapper.class);
        int is_exist = mapper.is_exist(name);
        return is_exist;
    }

    public userbean selectByName(String name){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        usermapper mapper = sqlSession.getMapper(usermapper.class);
        userbean userbean = mapper.selectByName(name);
        return userbean;
    }

    public int isAdmin(String name,String password){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        usermapper mapper = sqlSession.getMapper(usermapper.class);
        int i = mapper.isAdmin(name, password);
        return i;
    }

    public List<userbean> getsomeuser(String name){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        usermapper mapper = sqlSession.getMapper(usermapper.class);
        List<userbean> getsomeuser = mapper.getsomeuser(name);
        return getsomeuser;
    }

    public int isCoach(String name,String password){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        usermapper mapper = sqlSession.getMapper(usermapper.class);
        int coach = mapper.isCoach(name, password);
        return coach;
    }
}
