package com.algo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @projectName:IntelliJ IDEA
 * @see:PACKAGE_NAME
 * @author:zhou xing
 * @createTime:2021/1/24 13:32
 * @version:1.0
 */

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

    @Bean

    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
