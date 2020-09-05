package com.baron.weather;

import com.baron.service.WeatherService;
import com.baron.vo.weather.WeatherInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Baron
 * @date 2020/9/1 17:47
 */
public class Test {

    @Autowired
    private WeatherService weatherService;

    public static void main(String[] args) {
        String info = WeatherUtils.GetWeatherData("佛山");
        List<WeatherInfo> weatherInfos = WeatherUtils.GetWeather(info);
        for (int i = 0; i < weatherInfos.size(); i++) {
            System.out.println(weatherInfos.get(i).toString());
        }


    }
}