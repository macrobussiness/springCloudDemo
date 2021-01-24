package com.algo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @projectName:IntelliJ IDEA
 * @see:com.algo
 * @author:zhou xing
 * @createTime:2021/1/24 13:48
 * @version:1.0
 */
@SpringBootApplication
public class ServiceConsumer2 {
    public static void main(String[] args) {
        SpringApplication.run(ServiceConsumer2.class,args);
    }

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}

