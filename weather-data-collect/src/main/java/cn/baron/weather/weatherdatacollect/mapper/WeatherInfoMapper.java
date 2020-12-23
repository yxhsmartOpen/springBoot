package cn.baron.weather.weatherdatacollect.mapper;


import cn.baron.weather.weatherdatacollect.vo.WeatherInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Baron
 * @date 2020/7/24 9:32
 */
@Mapper
public interface WeatherInfoMapper {
    Integer insertList(@Param("weatherInfos") List<WeatherInfo> weatherInfos);

    Integer insertOne(WeatherInfo weatherInfo);

    WeatherInfo selectOneOrderByDateId(@Param("dateId") String dateId);

    Integer updateOne(WeatherInfo weatherInfo);

}
