package com.algo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @projectName:IntelliJ IDEA
 * @see:entity
 * @author:zhou xing
 * @createTime:2021/1/20 7:54
 * @version:1.0
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private Long id;
    private String name;
    private Integer age;
}
