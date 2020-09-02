package com.baron.Controller;

import com.baron.service.WeatherService;
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
        return weatherService.insertWeathers(cityName);
    }
}
