package com.yidu.ssmdemo002.controller;

import com.yidu.ssmdemo002.entity.UserInfo;
import com.yidu.ssmdemo002.service.UserInfoService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 罗彩霞
 * @version 1.0
 * @description 用户控制层, 处理登录与注册(增删改查)
 * @date 2021-4-12 星期一 10:24
 */
@Controller // 控制层注解
public class UserController {

    @Autowired
    UserInfoService userInfoService;

    /**
     * 登录
     * @param userName  表单中传过来的用户名
     * @param userPass  表单中传过来的密码
     * @return 响应页面
     */
    @ResponseBody   // 响应体
    @RequestMapping("login")    // 设置请求地址
    public UserInfo login(String userName, String userPass){
        System.out.println("userName="+userName+"-userPass="+userPass);
        // 调用数据库登录查询方法？
        return userInfoService.login(userName, userPass);
    }

    /**
     * 注册
     * @param userInfo 用户对象
     * @return 注册是否成功
     */
    @ResponseBody
    @RequestMapping("insert")
    public int insert(UserInfo userInfo){
        System.out.println(userInfo.toString());
        return userInfoService.insert(userInfo);
    }

    @RequestMapping("hello")
    public String hello(){
        return "login";
    }

}
