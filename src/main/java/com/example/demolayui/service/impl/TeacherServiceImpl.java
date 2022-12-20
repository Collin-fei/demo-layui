package com.example.demolayui.service.impl;


import com.example.demolayui.mapper.TeacherMapper;
import com.example.demolayui.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.*;

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
    public Map<String, String> getTea(String username, String password) {

        Map<String, String> teacher = teacherMapper.getTea(username,password);

        return teacher;
    }


}
