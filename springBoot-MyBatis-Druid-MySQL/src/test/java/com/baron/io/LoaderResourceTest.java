package com.baron.io;


import com.baron.weather.WeatherUtils;
import com.baron.weather.enums.CharacterPinYinConvert;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Baron
 * @date 2020/9/12 23:31
 */
@Slf4j
public class LoaderResourceTest {

    @Test
    public void test() throws IOException {
        Map<String, List> mapList = new HashMap<>();
        BufferedReader bufferedReader = null;
        StringBuilder stringBuilder = new StringBuilder(1024);
        try {

            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("src/main/resources/countyCity.json")));
            while (bufferedReader.readLine() != null) {
                stringBuilder.append(bufferedReader.readLine());
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(stringBuilder.toString());
        String[] strings = stringBuilder.toString().replace("null", "").trim().replaceAll("]", "]=").split("=");
        for (String s : strings) {
            String key = s.split(":")[0].replaceAll("\"", "");
            System.out.println(key);
            String listValues = s.split(":")[1].replace("\"", "");
            System.out.println(listValues);
            String[] lits = listValues.substring(1, listValues.length() - 1).split(",");
            System.out.println(Arrays.asList(lits));
            mapList.put(key, Arrays.asList(lits));
        }
    }

    @Test
    public void test2() {

        CharacterPinYinConvert convert = new CharacterPinYinConvert();

        WeatherUtils weatherUtils = new WeatherUtils();
        try {
            Map<String, List> listMap = weatherUtils.getCityList();
            for (Map.Entry<String, List> entry : listMap.entrySet()) {
                List<String> list = entry.getValue();
                String province2 = null;
                String province = entry.getKey().replace("省","").
                        replaceAll("自治区","").
                        replace("回族","").
                        replace("壮族","").
                        replace("维吾尔","");
                if("陕西".equals(province))
                    province2 = province + "S";


               // /** 广东省 */
                //GuangDong("GUANGDONG", "广东省", CsgProvince.City.GuangDongCity),
//                 System.out.println("/** "+entry.getKey() + " */");
//                 System.out.println(convert.toPinYin(null == province2?province:province2) + "(\"" + convert.toPinYin(null == province2?province:province2) + "\""  + ",\"" + province + "\",Province.City." +
//                       convert.toPinYin(province2 == null ?province:province2)+"City),");

//                String SSS = null;
//                if (list.size() == 1)
//                    SSS = list.toString().replace("[","").replace("]","");
//                if (list.size() > 1)
//                    SSS = list.toString().substring(1,list.toString().length() -1 ).replaceAll(", ","\", \"");
//                // public static List<String> ShenZhenCity = Arrays.asList("深圳");
                //System.out.println("public static List<String> "+ convert.toPinYin(null == province2?province:province2) +"City = Arrays.asList(\""+SSS+"\");");

                /**
                 * 海口
                 */
               // HaiKou("HaiKou", "59758", "101310101", "海口", CsgProvince.HaiNan),

                for (String cityName : list) {
                    System.out.println("/** "+entry.getKey()+"-"+cityName + " */");
                    System.out.println(convert.toPinYin(null == province2?province:province2)+"_"+ convert.toPinYin(cityName) + "(\"" +convert.toPinYin(null == province2?province:province2)+"_"+ convert.toPinYin(cityName) + "\"," + "\"\"" + ",\"\"" + ",\"" + cityName + "\",Province." +
                            convert.toPinYin(province2 == null ?province:province2)+"),");
                }
            }
        } catch (IOException e) {
            // 打印日志，但是不抛出异常
            log.error(e.getMessage());
        }
    }

    @Test
    public void test3() {
        CharacterPinYinConvert convert = new CharacterPinYinConvert();

        WeatherUtils weatherUtils = new WeatherUtils();

        String cityName = "凯里";
        /**
         * 贵阳
         */
        //GuiYang("GuiYang", "57816", "101260101", "贵阳", CsgProvince.GuiZhou),
//        System.out.println("/** "+cityName + " */");
//        System.out.println(convert.toPinYin(cityName) + "(\"" + convert.toPinYin(cityName) + "\"," + "\"\"" + ",\"\"" + ",\"" + cityName + "\",CsgProvince." +
//                convert.toPinYin(cityName)+"),");
    }
}
