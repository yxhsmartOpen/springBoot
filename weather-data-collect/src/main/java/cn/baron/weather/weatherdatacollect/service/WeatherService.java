package cn.baron.weather.weatherdatacollect.service;


import cn.baron.weather.weatherdatacollect.vo.WeatherInfo;

/**
 * @author Baron
 * @date 2020/9/2 0:12
 */
public interface WeatherService {

    /**
     * 批量插入
     * @param cityName 城市名称
     * @return Integer 成功记录数
     */
    Integer insertList(String cityName);

    /**
     * 单条插入
     * @param cityName 城市名称
     * @return  Integer 成功记录数
     */
    Integer insertOne(String cityName);

    /**
     * 单条查找
     * @param dateId 主键ID
     * @return WeatherInfo 实体
     */
    WeatherInfo selectOne(String dateId);

    /**
     * 更新
     * @param weatherInfo 实体
     * @return 更新状态
     */
    Integer update(WeatherInfo weatherInfo);
}
