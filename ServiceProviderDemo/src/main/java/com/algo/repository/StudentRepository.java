package com.algo.repository;

import com.algo.entity.Student;

import java.util.Collection;
import java.util.Map;

/**
 * @description:
 * @projectName:IntelliJ IDEA
 * @see:com.algo.repository
 * @author:zhou xing
 * @createTime:2021/1/24 12:59
 * @version:1.0
 */
public interface StudentRepository {

    public Collection<Student> findAll();

    public Student findById(Long id);

    public void saveOrUpdate(Student student);

    public void deleteById(Long id);
}
