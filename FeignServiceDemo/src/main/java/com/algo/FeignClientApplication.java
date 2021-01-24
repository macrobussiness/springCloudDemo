package com.algo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description:
 * @projectName:IntelliJ IDEA
 * @see:com.algo
 * @author:zhou xing
 * @createTime:2021/1/24 15:23
 * @version:1.0
 */
@SpringBootApplication
@EnableFeignClients
public class FeignClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignClientApplication.class,args);
    }

}
