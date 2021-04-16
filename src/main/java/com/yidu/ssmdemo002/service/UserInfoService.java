package com.yidu.ssmdemo002.service;

import com.yidu.ssmdemo002.dao.UserInfoDao;
import com.yidu.ssmdemo002.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 罗彩霞
 * @version 1.0
 * @description
 * @date 2021-04-14 10:02
 */
@Service
public class UserInfoService {

    @Autowired
    UserInfoDao userInfoDao;

    public UserInfo login(String username, String userpass){
        return userInfoDao.login(username, userpass);
    }

    public int insert(UserInfo userInfo){
        return userInfoDao.insert(userInfo);
    }

}
