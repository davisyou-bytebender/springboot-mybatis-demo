package com.aliyun.springbootmybatisdemo.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Author davis you
 * @Date 2022/9/15 3:14 PM
 * @Version 1.0
 */
@Data
public class UserEntity {
    private String name;
    private Long age;
    private Date birth;
}
