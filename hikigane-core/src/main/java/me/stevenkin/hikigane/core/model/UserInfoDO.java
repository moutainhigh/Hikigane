package me.stevenkin.hikigane.core.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserInfoDO {

    private Long id;
    //用户名（全局唯一）
    private String username;
    private String password;

    // 手机号
    private String phone;
    // 邮箱地址
    private String email;

    private LocalDateTime createTime;
    private LocalDateTime modifiedTime;
}
