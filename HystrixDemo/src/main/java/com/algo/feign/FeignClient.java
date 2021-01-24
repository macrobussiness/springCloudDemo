package com.algo.feign;

import com.algo.entity.Student;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @description:
 * @projectName:IntelliJ IDEA
 * @see:com.algo.feign
 * @author:zhou xing
 * @createTime:2021/1/24 15:25
 * @version:1.0
 */
@org.springframework.cloud.openfeign.FeignClient(value = "provider",fallback = FeignError.class)
public interface FeignClient {

    @RequestMapping("/student/index")
    public String index();

    @GetMapping("/student/findAll")
    public Collection<Student> findAll();

    @GetMapping("/student/findById/{id}")
    public Student findById(@PathVariable Long id);

    @GetMapping("/student/findById1")
    public Student findById1(Long id);

    @PostMapping("/student/saveOrUpdate")
    public void saveOrUpdate(@RequestBody Student student);

    @DeleteMapping("/student/deleteById")
    public void deleteById(Long id);

    @DeleteMapping("/student/deleteById1/{id}")
    public void deleteById1(@PathVariable Long id);

}
