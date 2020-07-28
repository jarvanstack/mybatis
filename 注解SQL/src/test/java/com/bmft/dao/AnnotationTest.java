package com.bmft.dao;

import com.bmft.pojo.User;
import com.bmft.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;


public class AnnotationTest {
    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userById = mapper.getUserById(1);
        System.out.println(userById);
        sqlSession.commit();
        sqlSession.close();
    }


    @Test
    public void insertUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);


        Integer integer = mapper.insertUser(new User(6, "fsdaf", "发发呆"));
        System.out.println(integer);


        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);


        Integer integer = mapper.deleteUser(6);
        System.out.println(integer);


        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void UpdateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);


        Integer integer = mapper.updateUser(new User(3, "发顺丰", "sdffda"));
        System.out.println(integer);


        sqlSession.commit();
        sqlSession.close();
    }

}
