package com.yidu.ssmdemo002.service;

import com.yidu.ssmdemo002.dao.MenuInfoDao;
import com.yidu.ssmdemo002.dao.ProductDao;
import com.yidu.ssmdemo002.entity.MenuInfo;
import com.yidu.ssmdemo002.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 罗彩霞
 * @version 1.0
 * @description
 * @date 2021-04-14 10:02
 */
@Service
public class MenuInfoService {

    @Autowired
    MenuInfoDao menuInfoDao;

    public MenuInfo selectById(String menuid){
        return menuInfoDao.selectById(menuid);
    }

    public List<MenuInfo> selectAll(){
        return menuInfoDao.selectAll();
    }

    public int insert(MenuInfo menuInfo){
        return menuInfoDao.insert(menuInfo);
    }

    public int delete(String menuid){
        return menuInfoDao.delete(menuid);
    }

}
