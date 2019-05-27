package com.lsheng.boo.entity;

import lombok.Data;

import java.util.Date;

/**
 * 用户表
 */
@Data
public class User {


    /**
     * 名称
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 这里故意演示注解可无
     */
    private Integer testType;

    private Date testDate;

    private Long role;
    private String phone;


}
