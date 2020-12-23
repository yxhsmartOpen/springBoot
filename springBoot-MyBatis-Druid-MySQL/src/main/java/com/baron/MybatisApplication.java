package com.baron;

import com.baron.service.AliUserService;
import com.baron.vo.AliUser;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

/**
 * 实现 ApplicationRunner 的目的是，要在启动 SpringBoot 容器后，执行 run方法，生成 Coffee 类的 model和 mapper 对象，以及 *Mapper.xml 文件
 *
 * @author Baron
 * @date 2020/7/24 9:57
 */
@SpringBootApplication
@MapperScan("com.baron.mapper")
//@EnableCaching
@Slf4j
public class MybatisApplication  implements ApplicationRunner {

    @Value("${file.local.path}")
    private  String fileLocalPath;

    @Autowired
    private AliUserService aliUserService;

    public static void main(String[] args) {SpringApplication.run(MybatisApplication.class, args);}

    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<AliUser> aliUsers = new ArrayList<>();
        int a = aliUserService.insertBatch(aliUsers);
        log.info("批量插入数据 {} 条",a);

        //generateArtifacts();
       // System.out.println(fileLocalPath);
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
