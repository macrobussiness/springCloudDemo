package com.algo.controller;

import com.algo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * @description:
 * @projectName:IntelliJ IDEA
 * @see:com.algo.controller
 * @author:zhou xing
 * @createTime:2021/1/24 13:53
 * @version:1.0
 */
@RestController
@RequestMapping("/consumer")
public class RestHandler {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return restTemplate.getForEntity("http://localhost:8010/student/findAll",Collection.class).getBody();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable Long id){
        return restTemplate.getForEntity("http://localhost:8010/student/findById",Student.class,id).getBody();
    }

    @GetMapping("/findById1")
    public Student findById1(Long id){
        return restTemplate.getForObject("http://localhost:8010/student/findById",Student.class,id);
    }

    @PostMapping("/saveOrUpdate")
    public void saveOrUpdate(@RequestBody Student student){
        restTemplate.postForEntity("http://localhost:8010/student/saveOrUpdate",student,Student.class).getBody();
    }

    @DeleteMapping("deleteById")
    public void deleteById(Long id){
        restTemplate.delete("http://localhost:8010/student/deleteById",id);
    }

    @DeleteMapping("deleteById1/{id}")
    public void deleteById1(@PathVariable Long id){
        restTemplate.delete("http://localhost:8010/student/deleteById1",id);
    }

}
