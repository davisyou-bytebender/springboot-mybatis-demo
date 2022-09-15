package com.aliyun.springbootmybatisdemo.convert;

import com.aliyun.springbootmybatisdemo.entity.UserEntity;
import com.aliyun.springbootmybatisdemo.vo.UserVO;

/**
 * @Author davis you
 * @Date 2022/9/15 3:15 PM
 * @Version 1.0
 */
public class UserConverter {
    public static void main(String[] args) {
        UserVO userVO = new UserVO();
        UserEntity userEntity = new UserEntity();
        userEntity.setName(userVO.getName());
        userEntity.setAge((long) userVO.getAge().intValue());
        userEntity.setBirth(userVO.getBirthday());
    }
}
