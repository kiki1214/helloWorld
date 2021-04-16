package com.yidu.ssmdemo002.controller;

import com.yidu.ssmdemo002.entity.RoleInfo;
import com.yidu.ssmdemo002.entity.UserInfo;
import com.yidu.ssmdemo002.service.RoleInfoService;
import com.yidu.ssmdemo002.service.UserInfoService;
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
public class RoleController {

    @Autowired
    RoleInfoService roleInfoService;

    /**
     * 根据角色id查询角色
     * @param roleid 角色id
     * @return 角色对象
     */
    @ResponseBody
    @RequestMapping("roleSelectById")
    public RoleInfo selectById(int roleid){
        System.out.println(roleid);
        return roleInfoService.selectById(roleid);
    }

    /**
     * 新增角色
     * @param roleInfo 角色对象
     * @return 新增成功的int值
     */
    @ResponseBody
    @RequestMapping("roleInsert")
    public int insert(RoleInfo roleInfo){
        System.out.println(roleInfo.toString());
        return roleInfoService.insert(roleInfo);
    }

}
