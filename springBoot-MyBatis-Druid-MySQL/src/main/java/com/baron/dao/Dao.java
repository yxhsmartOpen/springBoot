package com.baron.dao;


import com.baron.vo.AliOrder;
import com.baron.vo.AliUser;
import com.baron.vo.weather.WeatherInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Baron
 * @date 2020/7/24 9:32
 */
@Mapper
public interface Dao {

    List<AliUser> selectUsers();

    /** 这里必须加上@Param("userName") ，其中userName 为*Mapper.xml文件里的参数名。不加会执行报错 */
    List<AliUser> selectUserByName(@Param("userName") String userName);

    List<AliUser> selectUserById(@Param("userId") String userId);

    Integer insertOrder(AliOrder aliOrder);

    Integer insertList(@Param("weatherInfos") List<WeatherInfo> weatherInfos);

    Integer insertOne(WeatherInfo weatherInfo);

    WeatherInfo selectOneOrderByDateId(@Param("dateId") String dateId);

    Integer updateOne(WeatherInfo weatherInfo);

    Integer deleteOne(@Param("userId") String userId);

}
