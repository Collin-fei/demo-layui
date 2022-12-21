package com.example.demolayui.mapper;


import com.example.demolayui.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;



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
    Teacher getTea(@Param("username") String username, @Param("password") String password);


}
