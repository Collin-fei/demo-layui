package com.example.demolayui.service.impl;


import com.example.demolayui.entity.Teacher;
import com.example.demolayui.mapper.TeacherMapper;
import com.example.demolayui.service.TeacherService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;


/**
 * @ClassName TeacherServiceImpl
 * @Deprecated 学校缴费教师模块
 * @Author: yekai
 * @Date:
 * @version: 1.0
 */
@Service
public class TeacherServiceImpl implements TeacherService {

    @Resource
    private TeacherMapper teacherMapper;


    /**
     * 获取教师ID以及商户ID
     * @param username 用户名
     * @param password 密码
     * @return
     */
    @Override
    public Teacher getTea(String username, String password) {
        return teacherMapper.getTea(username,password);
    }


}
