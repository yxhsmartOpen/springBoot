package cn.baron.weather.weatherdatacollect;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Baron
 */
@SpringBootApplication
@EnableScheduling
@MapperScan("cn.baron.weather.weatherdatacollect.mapper")
public class WeatherDataCollectApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherDataCollectApplication.class, args);
	}

}
