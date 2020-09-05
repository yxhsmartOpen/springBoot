package com.baron.service;

import com.baron.vo.weather.WeatherInfo;

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
