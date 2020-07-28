package com.bmft.dao;

import com.bmft.pojo.Student;

import java.util.List;

public interface StudentMapper {
    //子查询 关联2个表
    List<Student> getStudentTeacher01();
    //链表查询关联 2个表
    List <Student> getStudentTeacher02();
}
