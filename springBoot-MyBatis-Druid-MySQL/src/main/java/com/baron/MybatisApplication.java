package com.baron;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import java.util.ArrayList;
import java.util.List;

/**
 * 实现 ApplicationRunner 的目的是，要在启动SpringBoot容器后，执行run方法，生成Coffee类的model和mapper对象，以及*Mapper.xml文件
 *
 * @author Baron
 * @date 2020/7/24 9:57
 */
@SpringBootApplication
@MapperScan("com.baron.mapper")
@EnableCaching
public class MybatisApplication  implements ApplicationRunner {

    @Value("${file.local.path}")
    private  String fileLocalPath;

    public static void main(String[] args) {SpringApplication.run(MybatisApplication.class, args);}

    @Override
    public void run(ApplicationArguments args) throws Exception {
        //generateArtifacts();
        System.out.println(fileLocalPath);
    }

    private void generateArtifacts() throws Exception{
        List<String> warnings = new ArrayList<>();
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(
                this.getClass().getResourceAsStream("/generatorConfig.xml"));
        DefaultShellCallback callback = new DefaultShellCallback(true);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }
}
