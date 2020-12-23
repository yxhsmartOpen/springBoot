package cn.baron.weather.weatherdatacollect.weather;


import cn.baron.weather.weatherdatacollect.vo.WeatherInfo;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @author Baron
 * @date 2020/9/1 17:47
 */
@Slf4j
public class Test {

    public static void main(String[] args) {
        WeatherUtils weatherUtils = new WeatherUtils();

        String info = WeatherUtils.getWeatherData("凯里");
        System.out.println(info);
        List<WeatherInfo> weatherInfos = WeatherUtils.getWeather(info);

//        try {
//            Map<String, List> listMap = weatherUtils.getCityList();
//            for (Map.Entry<String, List> entry : listMap.entrySet()) {
//                List<String> list = entry.getValue();
//                System.out.println(list);
//                for (String cityName : list) {
//                    // weatherService.insertOne(cityName);
//                    System.out.println(cityName);
//                }
//            }
//        } catch (IOException e) {
//            // 打印日志，但是不抛出异常
//            log.error(e.getMessage());
//        }


    }
}