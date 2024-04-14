package org.example.qdunavigation.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // 设置允许跨域的路径
                .allowedOrigins("http://localhost:8081") // 设置允许跨域请求的域名
                .allowCredentials(true) // 是否允许证书，默认为false
                .allowedMethods("*") // 设置允许的方法，默认为GET、POST、HEAD、PUT、PATCH、DELETE、OPTIONS、TRACE
                .maxAge(3600); // 跨域允许时间，单位为秒
    }
}
