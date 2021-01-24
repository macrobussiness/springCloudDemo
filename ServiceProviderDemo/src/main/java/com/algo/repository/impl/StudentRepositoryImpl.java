package com.algo.repository.impl;

import com.algo.entity.Student;
import com.algo.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @projectName:IntelliJ IDEA
 * @see:com.algo.repository.impl
 * @author:zhou xing
 * @createTime:2021/1/24 12:59
 * @version:1.0
 */
@Repository
public class StudentRepositoryImpl implements StudentRepository {
    private static Map<Long,Student> stuInfos;
    static{
        stuInfos = new HashMap<>();
        stuInfos.put(1L,new Student(1L,"leo1",24));
        stuInfos.put(2L,new Student(2L,"leo2",24));
        stuInfos.put(3L,new Student(3L,"leo3",24));
        stuInfos.put(4L,new Student(4L,"leo4",24));
        stuInfos.put(5L,new Student(5L,"leo5",25));
    }

    @Override
    public Collection<Student> findAll() {
        return  stuInfos.values();
    }

    @Override
    public Student findById(Long id) {
        return stuInfos.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        stuInfos.put(student.getId(),student);
    }

    @Override
    public void deleteById(Long id) {
        stuInfos.remove(id);
    }

}
