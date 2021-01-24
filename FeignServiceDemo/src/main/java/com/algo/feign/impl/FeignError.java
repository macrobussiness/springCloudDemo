package com.algo.feign.impl;

import com.algo.entity.Student;
import com.algo.feign.FeignClientProvider;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @description:
 * @projectName:IntelliJ IDEA
 * @see:com.algo.feign.impl
 * @author:zhou xing
 * @createTime:2021/1/24 15:51
 * @version:1.0
 */
@Component
public class FeignError implements FeignClientProvider {
    @Override
    public String index() {
        return "服务器维护中......";
    }

    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public Student findById(Long id) {
        return null;
    }

    @Override
    public Student findById1(Long id) {
        return null;
    }

    @Override
    public void saveOrUpdate(Student student) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void deleteById1(Long id) {

    }
}
