package com.itmuch.contentcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import tk.mybatis.spring.annotation.MapperScan;

//扫描mybatis哪些包里面的接口
@MapperScan("com.itmuch")
@SpringBootApplication
public class ContentCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContentCenterApplication.class, args);
    }

    //在Spring容器中创建一个对象
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
