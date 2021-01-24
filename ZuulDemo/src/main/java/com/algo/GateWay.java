package com.algo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @description:
 * @projectName:IntelliJ IDEA
 * @see:com.algo
 * @author:zhou xing
 * @createTime:2021/1/24 14:26
 * @version:1.0
 */
@EnableZuulProxy
@EnableAutoConfiguration
public class GateWay {

    public static void main(String[] args) {
        SpringApplication.run(GateWay.class,args);
    }


}
