package com.algo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @projectName:IntelliJ IDEA
 * @see:com.algo.controller
 * @author:zhou xing
 * @createTime:2021/1/24 19:21
 * @version:1.0
 */
@RestController
@RequestMapping("/native")
public class NativeConfigClientHandler {

    @Value("${server.port}")
    private String port;

    @Value("${foo}")
    private String foo;

    @RequestMapping("/index")
    public String index(){
        return this.foo+"---"+this.port;
    }
}
