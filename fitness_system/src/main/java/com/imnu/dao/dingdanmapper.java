package com.imnu.dao;

import com.imnu.pojo.dingdanbean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface dingdanmapper {
        List<dingdanbean> selectalldingdan();

        List<dingdanbean> selectByUsername(@Param("username") String username);

        int updatepaymessage(int id);

        int updatecomments(@Param("comments") String comments,@Param("id") int id);

        int insertdingdan(dingdanbean dingdan);

        List<dingdanbean> selectnopaydingdan(@Param("name") String name);

}
