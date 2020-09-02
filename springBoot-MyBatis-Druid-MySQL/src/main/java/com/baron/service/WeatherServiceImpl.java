package com.baron.service;

import com.baron.dao.Dao;
import com.baron.vo.WeatherInfo;
import com.baron.weather.WeatherUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Baron
 * @date 2020/9/2 0:15
 */
@Service
public class WeatherServiceImpl implements WeatherService{

    @Resource
    private Dao dao;

    @Override
    public Integer insertWeathers(String cityName) {
        String info = WeatherUtils.GetWeatherData(cityName);
        List<WeatherInfo> weatherInfos = WeatherUtils.GetWeather(info);
        return dao.insertWeathers(weatherInfos);
    }

}
