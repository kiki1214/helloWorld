package com.yidu.ssmdemo002.entity;

import org.springframework.stereotype.Component;

/**
 * @author 罗彩霞
 * @version 1.0
 * @description
 * @date 2021-04-15 8:48
 */
@Component
public class RoleInfo {

    private int roleid;
    private String rolename;

    @Override
    public String toString() {
        return "RoleInfo{" +
                "roleid=" + roleid +
                ", rolename='" + rolename + '\'' +
                '}';
    }

    public RoleInfo() {
    }

    public RoleInfo(int roleid, String rolename) {
        this.roleid = roleid;
        this.rolename = rolename;
    }

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }
}
