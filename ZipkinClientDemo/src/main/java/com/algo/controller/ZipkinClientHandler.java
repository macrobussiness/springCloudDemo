package com.algo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @projectName:IntelliJ IDEA
 * @see:com.algo.controller
 * @author:zhou xing
 * @createTime:2021/1/24 22:45
 * @version:1.0
 */
@RestController
@RequestMapping("/zipkin")
public class ZipkinClientHandler {
    @Value("${server.port}")
    private String port;

    @RequestMapping("/index")
    public String index(){
        return this.port;
    }
}
