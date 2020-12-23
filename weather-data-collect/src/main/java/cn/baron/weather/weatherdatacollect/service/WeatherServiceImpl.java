package cn.baron.weather.weatherdatacollect.service;


import cn.baron.weather.weatherdatacollect.mapper.WeatherInfoMapper;
import cn.baron.weather.weatherdatacollect.vo.WeatherInfo;
import cn.baron.weather.weatherdatacollect.weather.WeatherUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


/**
 * @author Baron
 * @date 2020/9/2 0:15
 */
@Service
@Slf4j
public class WeatherServiceImpl implements WeatherService{

    @Resource
    private WeatherInfoMapper weatherInfoMapper;

    /**
     * 启动项目的时候，会把这个属性加载到spring 容器里
     */
    @Value("${server.port}")
    private  String arr;

    @Override
    public Integer insertList(String cityName) {
        if(StringUtils.isEmpty(cityName)){
            log.info("参数 cityName非法，cityName={}",cityName);
            return 0;
        }
        String info = WeatherUtils.getWeatherData(cityName);
        if (null == info){
            log.error("无效的城市 key={}",cityName);
            return 0;
        }
        List<WeatherInfo> weatherInfos = WeatherUtils.getWeather(info);
        if (null == weatherInfos){
            log.error("无效的城市 key={}",cityName);
            return 0;
        }
        List<WeatherInfo> weatherInfoList = new ArrayList<>();
        for (WeatherInfo weatherInfo : weatherInfos) {
            WeatherInfo weatherInfo1 = selectOne(weatherInfo.getDateId());
            if(null == weatherInfo1){
                weatherInfoList.add(weatherInfo);
            }
        }
        if (weatherInfoList.size() > 0){
            return weatherInfoMapper.insertList(weatherInfoList);
        }
        return 0;
    }

    @Override
    public Integer insertOne(String cityName) {
        if(StringUtils.isEmpty(cityName)){
            log.info("参数 cityName非法，cityName={}",cityName);
            return 0;
        }
        String info = WeatherUtils.getWeatherData(cityName);
        if (null == info){
            log.error("无效的城市 key={}",cityName);
            return 0;
        }
        List<WeatherInfo> weatherInfos = WeatherUtils.getWeather(info);
        if (null == weatherInfos){
            log.error("无效的城市 key={}",cityName);
            return 0;
        }
        Integer a = 0;
        for (WeatherInfo weatherInfo : weatherInfos) {
            WeatherInfo weatherInfo1 = selectOne(weatherInfo.getDateId());
            if (null != weatherInfo1 ){
                a =  update(weatherInfo);
            }else {
                a =  weatherInfoMapper.insertOne(weatherInfo);
            }
        }
        return a ;
    }


    @Override
    public WeatherInfo selectOne(String dateId) {
        if(!StringUtils.isEmpty(dateId)){
            WeatherInfo weatherInfo =  weatherInfoMapper.selectOneOrderByDateId(dateId);
            if (null != weatherInfo){
                return weatherInfo;
            }
            log.info("通过参数 dateId 未在数据库中查询到 com.baron.vo.weather.WeatherInfo 实体记录，dateId={}",dateId);
            return null;
        }
        log.info("参数 dateId 非法，dateId={}",dateId);
        return null;
    }

    @Override
    public Integer update(WeatherInfo weatherInfo) {
        if(null != weatherInfo){
            return weatherInfoMapper.updateOne(weatherInfo);
        }
        log.info("参数 weatherInfo 非法，weatherInfo={}",weatherInfo);
        return 0;
    }

}
