package me.stevenkin.hikigane.core.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ServerInfoDO {

    private Long id;
    /**
     * 服务器IP地址
     */
    private String ip;
    /**
     * 服务器端口
     */
    private Integer port;

    private LocalDateTime createTime;
    private LocalDateTime modifiedTime;

}
