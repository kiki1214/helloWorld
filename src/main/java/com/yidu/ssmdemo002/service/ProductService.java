package com.yidu.ssmdemo002.service;

import com.yidu.ssmdemo002.dao.ProductDao;
import com.yidu.ssmdemo002.dao.UserInfoDao;
import com.yidu.ssmdemo002.entity.Product;
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
public class ProductService {

    @Autowired
    ProductDao productDao;

    public int insert(Product product){
        return productDao.insert(product);
    }

}
