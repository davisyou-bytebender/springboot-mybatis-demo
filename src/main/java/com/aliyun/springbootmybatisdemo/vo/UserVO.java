package com.aliyun.springbootmybatisdemo.vo;

import lombok.Data;

import java.util.Date;

/**
 * @Author davis you
 * @Date 2022/9/15 3:14 PM
 * @Version 1.0
 */
@Data
public class UserVO {
    private String name;
    private Integer age;
    private Date birthday;
}
