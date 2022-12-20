package com.example.demolayui.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @ClassName TeacherMapper
 * @Deprecated 学校缴费 教师模块
 * @Author: yekai
 * @Date:
 * @version: 1.0
 */
@Mapper
public interface TeacherMapper {


    /**
     * 获取教师ID以及商户ID
     *
     * @param username
     * @param password
     * @return
     */
    Map<String, String> getTea(@Param("username") String username, @Param("password") String password);


}
