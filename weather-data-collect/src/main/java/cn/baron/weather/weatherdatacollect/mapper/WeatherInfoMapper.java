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
    /**
     * 批量插入
     * @param weatherInfos 数据集合
     * @return Integer 插入成功数
     */
    Integer insertList(@Param("weatherInfos") List<WeatherInfo> weatherInfos);

    /**
     * 单条插入
     * @param weatherInfo 天气实体
     * @return Integer 插入成功数
     */
    Integer insertOne(WeatherInfo weatherInfo);

    /**
     * 根据主键查找
     * @param dateId 主键
     * @return WeatherInfo 实体
     */
    WeatherInfo selectOneOrderByDateId(@Param("dateId") String dateId);

    /**
     * 更新
     * @param weatherInfo 实体
     * @return 更新状态
     */
    Integer updateOne(WeatherInfo weatherInfo);

}
