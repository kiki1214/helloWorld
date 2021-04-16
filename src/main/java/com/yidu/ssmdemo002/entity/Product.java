package com.yidu.ssmdemo002.entity;

import org.springframework.stereotype.Component;

/**
 * @author 罗彩霞
 * @version 1.0
 * @description
 * @date 2021-04-14 15:44
 */
@Component
public class Product {

    private int pid;
    private String pname;
    private String pimg;
    /* 简介 概要 */
    private String sketch;
    private int ptype;

    public Product(int pid, String pname, String pimg, String sketch, int ptype) {
        this.pid = pid;
        this.pname = pname;
        this.pimg = pimg;
        this.sketch = sketch;
        this.ptype = ptype;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", pimg='" + pimg + '\'' +
                ", sketch='" + sketch + '\'' +
                ", ptype=" + ptype +
                '}';
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPimg() {
        return pimg;
    }

    public void setPimg(String pimg) {
        this.pimg = pimg;
    }

    public String getSketch() {
        return sketch;
    }

    public void setSketch(String sketch) {
        this.sketch = sketch;
    }

    public int getPtype() {
        return ptype;
    }

    public void setPtype(int ptype) {
        this.ptype = ptype;
    }
}
