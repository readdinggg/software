package com.imnu.dao;

import com.imnu.pojo.coachbean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface coachmapper {
    List<coachbean> selectallcoach(@Param("name") String name);

    int insertCoach(@Param("name") String name);

    int updateCoach(coachbean coach);

    List<coachbean> selectSomeCoach(@Param("name") String name);

    List<coachbean> selectAllcoach();

    String selectonecoachnamebyid(int id);
}
