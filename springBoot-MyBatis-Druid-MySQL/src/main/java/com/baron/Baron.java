package com.baron;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 使用 @PropertySource 注解 加载类路径下的 baron.properties 配置文件，为 com.baron.Baron POJO 对象的属性赋值。
 * @ConfigurationProperties 表示 告诉 SpringBoot 将本类中的所有属性和配置文件中相关的配置进行绑定；
 *   prefix = "baron" 表示 将配置文件中 key 为 baron 的下面所有的属性与本类属性进行一一映射注入值，如果配置文件中
 *   不存在 "baron" 的 key，则不会为 POJO 注入值，属性值仍然为默认值
 *    @Component 将本来标识为一个 Spring 组件，因为只有是容器中的组件，容器才会为 @ConfigurationProperties 提供此注入功能
 *  * @PropertySource (value = { " classpath : baron.properties " }) 指明加载类路径下的哪个配置文件来注入值
 * @author Baron
 * @date 2020/11/12 11:36
 */
@Data
@PropertySource(value = {"classpath:baron.properties"})
@Component
@ConfigurationProperties(prefix = "baron")
public class Baron {
    private String id;
    private String name;
}
