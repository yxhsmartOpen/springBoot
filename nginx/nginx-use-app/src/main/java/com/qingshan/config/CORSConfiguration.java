package com.qingshan.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class CORSConfiguration  {
/*    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                //registry.addMapping("/time/**");
                registry.addMapping("/**")
                        //.allowedOrigins("*")
                        .allowedOrigins("http://192.168.44.1:9096")
                        .allowedMethods("GET", "POST", "DELETE", "PUT", "OPTIONS")
                        .allowCredentials(false).maxAge(3600);
            }
        };
    }*/
}
