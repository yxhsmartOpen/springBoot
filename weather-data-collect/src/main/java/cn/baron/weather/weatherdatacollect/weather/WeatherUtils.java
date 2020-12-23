package cn.baron.weather.weatherdatacollect.weather;

import cn.baron.weather.weatherdatacollect.vo.WeatherInfo;
import cn.baron.weather.weatherdatacollect.weather.enums.City;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.zip.GZIPInputStream;

/**
 * 天气抓取逻辑
 * @author Baron
 * @date 2020/9/1 17:40
 */
@Slf4j
@Component
public class WeatherUtils {

    private static Logger logger = LoggerFactory.getLogger(WeatherUtils.class);

    String path = String.valueOf(this.getClass().getResourceAsStream("/"));

    public  static String getWeatherData(String cityName) {
        StringBuilder sb=new StringBuilder();;
        try {
            /** cityname = URLEncoder.encode(cityName, "UTF-8"); */
            String weather_url = "http://wthrcdn.etouch.cn/weather_mini?city="+cityName;

            URL url = new URL(weather_url);
            URLConnection conn = url.openConnection();
            InputStream is = conn.getInputStream();
            GZIPInputStream gzin = new GZIPInputStream(is);
            /** 设置读取流的编码格式，自定义编码 */
            InputStreamReader isr = new InputStreamReader(gzin, "utf-8");
            BufferedReader reader = new BufferedReader(isr);
            String line = null;
            while((line=reader.readLine())!=null){
                sb.append(line+" ");
            }
            reader.close();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();

    }

    /**
     * 将JSON格式数据进行解析 ，返回 List<WeatherInfo> 对象
     * @param
     * @return
     */
    public static  List<WeatherInfo> getWeather(String weatherInfobyJson){
        List<WeatherInfo> list = new ArrayList<>();

        JSONObject dataOfJson = JSONObject.parseObject(weatherInfobyJson);
        if(dataOfJson.getInteger("status") != 1000){
            Integer status = dataOfJson.getInteger("status");
            logger.error("无效的请求 status={}",status);
            return null;
        }

        //从json数据中提取数据
        String data = dataOfJson.getString("data");
        dataOfJson = JSONObject.parseObject(data);

        if (null == City.getCity(dataOfJson.getString("city"))){
            String key = dataOfJson.getString("city");
            log.error("无效的城市 key={}",key);
            return null;
        }

        // 获取昨日的数据
        JSONObject yesterday = dataOfJson.getJSONObject("yesterday");
        WeatherInfo weatherInfo =  WeatherInfo.builder().
                dateId(LocalDate.now().plusDays(-1).toString().substring(0,10)+"_"+City.getCity(dataOfJson.getString("city")).getCode()).
                updateTime(LocalDateTime.now()).
                week(yesterday.getString("date").substring(yesterday.getString("date").length()-3)).
                cityName(dataOfJson.getString("city")).
                provinceName(City.getCity(dataOfJson.getString("city")).getProvince().getName()).
                windDirection(yesterday.getString("fx")).
                windPower(yesterday.getString("fl").replace("<![CDATA[","").replace("]]>","")).
                description(yesterday.getString("type")).
                forecast(false).build();

        String high = yesterday.getString("high");
        String low  = yesterday.getString("low");
        weatherInfo = getTem(weatherInfo,high,low);
        list.add(weatherInfo);

        //获取预测的天气预报信息
        JSONArray forecast = dataOfJson.getJSONArray("forecast");
        for (int i = 0; i < forecast.size(); i++) {
            WeatherInfo weatherInfo1 =  WeatherInfo.builder().
                    dateId(LocalDate.now().plusDays(i).toString().substring(0,10)+"_"+City.getCity(dataOfJson.getString("city")).getCode()).
                    createTime(LocalDateTime.now()).
                    updateTime(LocalDateTime.now()).
                    week(forecast.getJSONObject(i).getString("date").substring(forecast.getJSONObject(i).getString("date").length()-3)).
                    cityName(dataOfJson.getString("city")).
                    provinceName(City.getCity(dataOfJson.getString("city")).getProvince().getName()).
                    windDirection(forecast.getJSONObject(i).getString("fengxiang")).
                    windPower(forecast.getJSONObject(i).getString("fengli").replace("<![CDATA[","").replace("]]>","")).
                    description(forecast.getJSONObject(i).getString("type")).
                    forecast(true).build();

            String high1 = forecast.getJSONObject(i).getString("high");
            String low1  = forecast.getJSONObject(i).getString("low");
            weatherInfo1 = getTem(weatherInfo1,high1,low1);
            list.add(weatherInfo1);
        }
        return list;
    }

    public static  WeatherInfo getTem(WeatherInfo weatherInfo,String high,String low){

        weatherInfo.setHigh(Integer.valueOf(high.replaceAll(" ","").
                replace("高温","").
                replace("低温","").
                replace("℃","")));
        weatherInfo.setLow(Integer.valueOf(low.replaceAll(" ","").
                replace("高温","").
                replace("低温","").
                replace("℃","")));
        weatherInfo.setAvg((weatherInfo.getLow()+weatherInfo.getHigh())/2);

        return weatherInfo;
    }

    /**
     * 先从文件加载城市名称数据，再存在缓存中
     * @return Map<String,List>
     * @throws IOException
     */
    public  Map<String,List> getCityList() throws IOException {
        Map<String,List> mapList = new HashMap<>();
        BufferedReader bufferedReader= null;
        StringBuilder stringBuilder = new StringBuilder(1024);
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\MAVEN\\springBoot-family\\weather-data-collect\\src\\main\\resources\\countyCity.json")));
            while (bufferedReader.readLine() != null ){
                stringBuilder.append(bufferedReader.readLine());
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String [] strings = stringBuilder.toString().replace("null","").trim().replaceAll("]","]=").split("=");
        for (String s : strings) {
            String key = s.split(":")[0].replaceAll("\"","");
            String listValues = s.split(":")[1].replace("\"","");
            String[] lits = listValues.substring(1,listValues.length()-1).split(",");
            mapList.put(key,Arrays.asList(lits));
        }

        return mapList;
    }

}
