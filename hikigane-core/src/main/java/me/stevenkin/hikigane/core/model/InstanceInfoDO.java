package me.stevenkin.hikigane.core.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InstanceInfoDO {

    private Long id;

    // 任务ID
    private Long jobId;
    // 任务所属应用
    private String appName;
    // 任务实例ID
    private Long instanceId;
    // 任务实例参数
    private String instanceParams;
    /**
     * 任务状态
     */
    private Integer status;
    // 执行结果（允许存储稍大的结果）
    private String result;
    // 预计触发时间
    private Long expectedTriggerTime;
    // 实际触发时间
    private Long actualTriggerTime;
    // 结束时间
    private Long finishedTime;
    // 最后上报时间
    private Long lastReportTime;
    // 总共执行的次数（用于重试判断）
    private Long runningTimes;

    private LocalDateTime createTime;
    private LocalDateTime modifiedTime;

}
