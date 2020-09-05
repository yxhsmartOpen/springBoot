package com.baron.vo.weather;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.io.Serializable;
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

    /** 主键ID*/
    private String id;
    /** 日期_城市拼音_省份拼音 */
    private String dateId;
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
    /**
     *  是否是预测数据,0：否，1：是 :简单的记录一下，MySQL里没有boolean类型，tinyint(1) 类型就是 boolean 类型。当我们在写sql脚本的时候，
     * 要在返回的字段里这样写 forcast*1 as forecast2，该字段才会返回正常
     */
    private Boolean forecast;
    /** 省份名 */
    private String provinceName;
    /** 创建时间 */
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private LocalDateTime createTime;
    /** 更新时间 */
    private LocalDateTime updateTime;

}
