package com.yidu.ssmdemo002.controller;

import com.yidu.ssmdemo002.entity.Product;
import com.yidu.ssmdemo002.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 罗彩霞
 * @version 1.0
 * @description
 * @date 2021-04-14 16:05
 */
@Controller
public class ProductController {

    @Autowired
    ProductService productService;

    @ResponseBody
    @RequestMapping("product_insert")
    public int insert(Product product){
        System.out.println(product.toString());
        return productService.insert(product);
    }

}
