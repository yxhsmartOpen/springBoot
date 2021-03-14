package com.baron.io;



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
}
