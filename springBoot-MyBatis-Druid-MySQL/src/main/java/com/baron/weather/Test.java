package com.baron.weather;

import com.baron.vo.WeatherInfo;

import java.util.List;

/**
 * @author Baron
 * @date 2020/9/1 17:47
 */
public class Test {
    public static void main(String[] args) {
        String info = WeatherUtils.GetWeatherData("深圳");
        List<WeatherInfo> weatherInfos = WeatherUtils.GetWeather(info);
        for (int i = 0; i < weatherInfos.size(); i++) {
            System.out.println(weatherInfos.get(i).toString());
        }
    }
}