package com.baron.vo;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author Baron
 * @date 2020/9/1 17:41
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class WeatherInfo implements Serializable {
    /** 主键 */
    private String id;
    /** 日期 */
    private LocalDate date;
    /** 星期几 */
    private String week;
    /** 城市名 */
    private String cityName;
    /** 天气描述 */
    private String description;
    /** 风向 */
    private String windDirection;
    /** 风力等级 */
    private String windPower;
    /** 平均气温 */
    private Integer avg;
    /** 最高气温 */
    private Integer high;
    /** 最低气温 */
    private Integer low;
    /** 是否是预测数据 */
    private Boolean forecast;
    /** 省份名 */
    private String provinceName;
    /** 创建时间 */
    private LocalDateTime createTime;
    /** 更新时间 */
    private LocalDateTime updateTime;

}
