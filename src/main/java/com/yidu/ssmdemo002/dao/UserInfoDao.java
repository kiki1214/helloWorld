package com.yidu.ssmdemo002.dao;

import com.yidu.ssmdemo002.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author 罗彩霞
 * @version 1.0
 * @description
 * @date 2021-04-14 9:46
 */
@Mapper
@Repository
public interface UserInfoDao {

    /**
     * 用户登录
     * @param username 用户名
     * @param userpass 用户密码
     * @return 用户对象
     */
    public UserInfo login(String username, String userpass);

    public int insert(UserInfo userInfo);

}
