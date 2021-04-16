package com.yidu.ssmdemo002.dao;

import com.yidu.ssmdemo002.entity.MenuInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 罗彩霞
 * @version 1.0
 * @description
 * @date 2021-04-15 11:30
 */
@Mapper
@Repository
public interface MenuInfoDao {

    /* 增删查 */

    /**
     * 根据菜单id查询菜单信息
     * @param menuid 菜单id
     * @return 菜单对象
     */
    MenuInfo selectById(String menuid);

    /**
     * 查询所有
     * @return 菜单对象
     */
    List<MenuInfo> selectAll();

    int insert(MenuInfo menuInfo);

    int delete(String menuid);

}
