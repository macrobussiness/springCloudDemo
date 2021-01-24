package com.algo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @description:
 * @projectName:IntelliJ IDEA
 * @see:com.algo
 * @author:zhou xing
 * @createTime:2021/1/24 18:05
 * @version:1.0
 */
@SpringBootApplication
@EnableConfigServer
public class NativeConfigServer {

    public static void main(String[] args) {
        SpringApplication.run(NativeConfigServer.class,args);
    }

}
