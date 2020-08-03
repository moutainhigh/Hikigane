package me.stevenkin.hikigane.core.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AppInfoDO {

    private Long id;
    //应用名（用户空间唯一）
    private String appName;
    //用户名
    private String username;

    private String token;
    //当前调度这个应用的机器
    private String currentServer;
    //版本（用于调度集群使用乐观锁抢占这个应用）
    private Long version;
    //这个应用的集群机器数
    private Integer clusterNum;
    //失去联系的机器数
    private Integer lostNum;

    private LocalDateTime createTime;
    private LocalDateTime modifiedTime;
}
