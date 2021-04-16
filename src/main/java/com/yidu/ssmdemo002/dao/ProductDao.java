package com.yidu.ssmdemo002.dao;

import com.yidu.ssmdemo002.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author 罗彩霞
 * @version 1.0
 * @description
 * @date 2021-04-14 15:59
 */
@Mapper
@Repository
public interface ProductDao {

    /**
     *
     * @param product
     * @return
     */
    public int insert(Product product);

}
