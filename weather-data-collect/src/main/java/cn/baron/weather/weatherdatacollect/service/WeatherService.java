package cn.baron.weather.weatherdatacollect.service;


import cn.baron.weather.weatherdatacollect.vo.WeatherInfo;

/**
 * @author Baron
 * @date 2020/9/2 0:12
 */
public interface WeatherService {

    Integer insertList(String cityName);
    Integer insertOne(String cityName);
    WeatherInfo selectOne(String dateId);
    Integer update(WeatherInfo weatherInfo);
}
