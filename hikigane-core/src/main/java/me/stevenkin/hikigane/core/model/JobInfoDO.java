package me.stevenkin.hikigane.core.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class JobInfoDO {

    private Long id;

    /* ************************** 任务基本信息 ************************** */
    // 任务名称
    private String jobName;
    // 任务描述
    private String jobDescription;
    // 任务所属的应用
    private String appName;
    // 任务自带的参数
    private String jobParams;
    //DAG,json格式
    private String jsonDAG;

    /* ************************** 定时参数 ************************** */
    // 触发类型（CRON/API/RATE/DELAY）
    Integer triggerType;
    //定时任务第一次执行时间
    private LocalDateTime first;
    //延时
    private Long delay;// unit is second
    //频率
    private Long rate;
    //执行次数
    private Integer count;// -1 forever
    // CRON表达式
    private String cron;

    /* ************************** 运行时配置 ************************** */
    // 最大同时运行任务数，默认 1
    private Integer maxInstanceNum;
    // 并发度，同时执行某个任务的最大线程数量
    private Integer concurrency;
    // 任务整体超时时间
    private Long instanceTimeLimit;

    /* ************************** 重试配置 ************************** */
    private Integer instanceRetryNum;
    private Integer taskRetryNum;

    // 1 正常运行，2 停止（不再调度）
    private Integer status;
    // 下一次调度时间
    private Long nextTriggerTime;

    /* ************************** 繁忙机器配置 ************************** */
    // 最低CPU核心数量，0代表不限
    private double minCpuCores;
    // 最低内存空间，单位 GB，0代表不限
    private double minMemorySpace;
    // 最低磁盘空间，单位 GB，0代表不限
    private double minDiskSpace;

    /* ************************** 集群配置 ************************** */
    // 指定机器运行，空代表不限，非空则只会使用其中的机器运行（多值逗号分割）
    private String designatedWorkers;
    // 最大机器数量
    private Integer maxWorkerCount;

    // 报警用户ID列表，多值逗号分隔
    private String notifyUserIds;

    private LocalDateTime createTime;
    private LocalDateTime modifiedTime;

}
