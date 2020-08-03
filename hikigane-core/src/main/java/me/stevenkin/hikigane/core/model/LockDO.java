package me.stevenkin.hikigane.core.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * 数据库锁
 */
@Data
public class LockDO {

    private Long id;

    private String lockName;
    private String ownerIP;

    // 最长持有锁的时间
    private Long maxLockTime;

    private LocalDateTime createTime;
    private LocalDateTime modifiedTime;
}
