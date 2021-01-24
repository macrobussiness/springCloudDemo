package com.algo.controller;

import com.algo.entity.Student;
import com.algo.repository.StudentRepository;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @description:
 * @projectName:IntelliJ IDEA
 * @see:com.algo.controller
 * @author:zhou xing
 * @createTime:2021/1/24 13:09
 * @version:1.0
 */
@RestController
@RequestMapping("/student")
public class StudentHandler {

    @Autowired
    private StudentRepository repository;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/index")
    public String index(){
        return "当前端口："+port;
    }

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return repository.findAll();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable Long id){
        return repository.findById(id);
    }

    @GetMapping("/findById1")
    public Student findById1(Long id){
        return repository.findById(id);
    }

    @PostMapping("/saveOrUpdate")
    public void saveOrUpdate(@RequestBody Student student){
        repository.saveOrUpdate(student);
    }

    @DeleteMapping("/deleteById")
    public void deleteById(Long id){
        repository.deleteById(id);
    }

    @DeleteMapping("/deleteById1/{id}")
    public void deleteById1(@PathVariable Long id){
        repository.deleteById(id);
    }

}
