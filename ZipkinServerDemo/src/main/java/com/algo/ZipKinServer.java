package com.algo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.internal.EnableZipkinServer;

/**
 * @description:
 * @projectName:IntelliJ IDEA
 * @see:com.algo
 * @author:zhou xing
 * @createTime:2021/1/24 22:30
 * @version:1.0
 */
@SpringBootApplication
@EnableZipkinServer
public class ZipKinServer {

    public static void main(String[] args) {
        SpringApplication.run(ZipKinServer.class,args);
    }
}
