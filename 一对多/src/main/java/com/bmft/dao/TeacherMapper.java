package com.bmft.dao;

import com.bmft.pojo.Teacher;


import java.util.List;

public interface TeacherMapper {

    //@Select("select * from teacher ")
    List<Teacher> getTeacherList();

    List<Teacher> getTeacherStudent();

}
