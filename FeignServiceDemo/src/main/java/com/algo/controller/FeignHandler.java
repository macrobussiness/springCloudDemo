package com.algo.controller;

import com.algo.entity.Student;
import com.algo.feign.FeignClientProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @description:
 * @projectName:IntelliJ IDEA
 * @see:com.algo.controller
 * @author:zhou xing
 * @createTime:2021/1/24 15:29
 * @version:1.0
 */
@RestController
@RequestMapping("/feign")
public class FeignHandler {
    @Autowired
    private FeignClientProvider feignClientProvider;

    @RequestMapping("/index")
    public String index(){
        return feignClientProvider.index();
    }

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return feignClientProvider.findAll();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable Long id){
        return feignClientProvider.findById(id);
    }

    @GetMapping("/findById1")
    public Student findById1(Long id){
        return feignClientProvider.findById1(id);
    }

    @PostMapping("/saveOrUpdate")
    public void saveOrUpdate(@RequestBody Student student){
        feignClientProvider.saveOrUpdate(student);
    }

    @DeleteMapping("/deleteById")
    public void deleteById(Long id){
        feignClientProvider.deleteById(id);
    }

    @DeleteMapping("/deleteById1/{id}")
    public void deleteById1(@PathVariable Long id){
        feignClientProvider.deleteById1(id);
    }

}
