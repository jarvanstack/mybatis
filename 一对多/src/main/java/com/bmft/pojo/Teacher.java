package com.bmft.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Teacher {
    private Integer id;
    private String name;
    private List<Student> students;
}
