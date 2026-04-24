package com.stu.helloserver.vo;

import lombok.Data;

@Data  // 自动生成 getter/setter
public class UserDetailVO {
    private Long userId;
    private String username;
    private String realName;
    private String phone;
    private String address;
}