package com.yidu.ssmdemo002.service;

import com.yidu.ssmdemo002.dao.RoleInfoDao;
import com.yidu.ssmdemo002.entity.RoleInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 罗彩霞
 * @version 1.0
 * @description
 * @date 2021-04-15 9:01
 */
@Service
public class RoleInfoService {

    @Autowired
    RoleInfoDao roleInfoDao;

    public RoleInfo selectById(int roleid){
        return roleInfoDao.selectById(roleid);
    }

    public int insert(RoleInfo roleInfo){
        return roleInfoDao.insert(roleInfo);
    }

}
