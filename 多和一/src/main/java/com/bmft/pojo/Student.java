package com.bmft.pojo;

import lombok.Data;

@Data
public class Student {
    private Integer id;
    private String name;
    private String password;
    private Teacher teacher;
}
