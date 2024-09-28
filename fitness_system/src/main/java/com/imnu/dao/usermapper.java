package com.imnu.dao;

import com.imnu.pojo.userbean;
import org.apache.ibatis.annotations.Param;


import java.util.List;

public interface usermapper {

    List<userbean> getUserList();

    userbean selectById(int id);

    int insert(userbean user);

    int delete(int id);

    int updatename(userbean user);

    int selectIsLive(@Param("name") String name,@Param("password") String password);

    int is_exist(@Param("name") String name);

    userbean selectByName(@Param("name") String name);

    int isAdmin(@Param("name") String name,@Param("password") String password);

    List<userbean> getsomeuser(@Param("name") String name);

    int isCoach(@Param("name") String name,@Param("password") String password);
}
