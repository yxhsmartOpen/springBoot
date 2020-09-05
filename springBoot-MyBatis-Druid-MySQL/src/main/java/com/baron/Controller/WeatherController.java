package com.baron.Controller;

import com.baron.service.WeatherService;
import com.baron.vo.weather.WeatherInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Baron
 * @date 2020/9/2 0:35
 */
@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @RequestMapping("/insertList")
    public Integer insertList(@RequestParam String cityName){
        return weatherService.insertList(cityName);
    }

    @RequestMapping("/insertOne")
    public Integer insertOne(@RequestParam String cityName){
        return weatherService.insertOne(cityName);
    }

    @RequestMapping("/selectOne")
    public WeatherInfo selectOne(@RequestParam String dateId){
        return weatherService.selectOne(dateId);
    }
}
