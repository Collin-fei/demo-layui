package com.example.demolayui.service;


import com.example.demolayui.entity.Teacher;


/**
 * @ClassName TeacherService
 * @Deprecated 学校缴费教师模块
 * @Author: yekai
 * @Date:
 * @version: 1.0
 */
public interface TeacherService {


    /**
     * 获取教师ID以及学习ID
     * @param username
     * @param password
     * @return
     */
    Teacher getTea(String username, String password);

}
