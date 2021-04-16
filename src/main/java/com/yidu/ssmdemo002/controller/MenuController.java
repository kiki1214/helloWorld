package com.yidu.ssmdemo002.controller;

import com.yidu.ssmdemo002.entity.MenuInfo;
import com.yidu.ssmdemo002.entity.UserInfo;
import com.yidu.ssmdemo002.service.MenuInfoService;
import com.yidu.ssmdemo002.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author 罗彩霞
 * @version 1.0
 * @description 用户控制层, 处理登录与注册(增删改查)
 * @date 2021-4-12 星期一 10:24
 */
@Controller // 控制层注解
public class MenuController {

    @Autowired
    MenuInfoService menuInfoService;

    /**
     * 根据菜单id查询菜单信息
     * @param menuid 菜单id
     * @return
     */
    @ResponseBody
    @RequestMapping("menu_selectById")
    public MenuInfo selectById(String menuid){
        System.out.println(menuid);
        return menuInfoService.selectById(menuid);
    }

    /**
     * 查询所有信息
     * @return 菜单信息
     */
    /*@ResponseBody
    @RequestMapping("menu_selectAll")
    public ModelAndView selectAll(){
        ModelAndView mv = new ModelAndView();
        // 调用查询所有的方法
        List<MenuInfo> menuList = menuInfoService.selectAll();
        // 将数据装进mv中
        mv.addObject("menuList", menuList);
        mv.setViewName("showMenu.jsp");
        return mv;
    }*/

    /**
     * 查询菜单表所有信息
     * @param request 请求对象
     * @return
     */
    @RequestMapping("menu_selectAll")
    public String selectAll(HttpServletRequest request){
        // 调用查询所有的方法
        List<MenuInfo> menuList = menuInfoService.selectAll();
        // 将数据存入作用域
        request.setAttribute("menuList", menuList);
        // 跳转到指定页面, 显示数据
        return "showMenu";
    }

    /**
     * 新增菜单
     * @param menuInfo 菜单信息
     * @return
     */
    @ResponseBody
    @RequestMapping("menu_insert")
    public String insert(MenuInfo menuInfo){
        System.out.println(menuInfo.toString());
        int insert = menuInfoService.insert(menuInfo);
        return insert>0?"新增成功":"新增失败";
    }

    /**
     * 根据id删除菜单信息
     * @param menuid 菜单id
     * @return
     */
    @ResponseBody
    @RequestMapping("menu_delete")
    public String delete(String menuid){
        System.out.println(menuid);
        int delete = menuInfoService.delete(menuid);
        return delete>0?"删除成功":"删除失败";
    }

}
