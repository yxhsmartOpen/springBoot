package com.baron.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author Baron
 * @date 2020/9/1 18:05
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GloabWethDayBean implements Serializable {
    /** 日期 */
    private String dateId;
    /** 格式化预报日期 */
    private String formatDate;
    /** 天气描述：如阴天，多云，雷阵雨等  */
    private String wethDesc;
    /** 风向与级别，如微风转东南风3-4级 */
    private String windDirLevel;
    /** 最低气温 */
    private String minTmp;
    /** 最高气温 */
    private String maxTmp;
    /** 历史最低气温  */
    private String hMinTmp;
    /** 历史最高气温 */
    private String hMaxTmp;
    /** 最低相对湿度 */
    private Float minHumidity;
    /** 最高相对湿度 */
    private Float maxHumidity;
    /** 图片 */
    private String icon;
    /** 农历 */
    private String nongLi;
    /** 节气，如二十四节气、春风、冬至 */
    private String solarTerms;
    /** 历史降水概率 */
    private String rainProb;
    /** 西方的节日、如植树节、万圣节 */
    private String westFestival;
    /** 空气质量指数 */
    private String aqi;
    /** 空气质量指数 所属 优 */
    private String aqiInfo;
    /** 空气质量指数 等级 */
    private String aqiLevel;
}
