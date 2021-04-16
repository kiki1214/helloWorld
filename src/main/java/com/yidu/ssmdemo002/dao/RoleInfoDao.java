package com.yidu.ssmdemo002.dao;

import com.yidu.ssmdemo002.entity.RoleInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author 罗彩霞
 * @version 1.0
 * @description
 * @date 2021-05-15 8:50
 */
@Mapper
@Repository
public interface RoleInfoDao {

    /**
     * 根据角色id查出角色
     * @param roleid 角色id
     * @return 角色对象
     */
    RoleInfo selectById(int roleid);

    /**
     * 新增角色
     * @param roleInfo 角色对象
     * @return 新增成功的int值
     */
    int insert(RoleInfo roleInfo);

}
