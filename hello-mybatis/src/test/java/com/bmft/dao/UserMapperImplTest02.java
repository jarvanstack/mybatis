package com.bmft.dao;

import com.bmft.pojo.User;
import com.bmft.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 *   第二节课
 * 1. 条件查询
 * 2. 增 insert
 * 2. 删除 delete
 * 4. 改 update
 */
public class UserMapperImplTest02 {
    @Test
    public void getUserById(){
        User user = new User();
        user.setId(1);
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userById = mapper.getUserById(user);
        System.out.println(userById);

        sqlSession.commit();
        sqlSession.close();//记得要关闭
    }

    @Test
    public void insertUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.insertUser(new User(5, "dfsaf", "1231230"));
        if (i > 0) {
            sqlSession.commit();
            System.out.println("success");
        }else {
            sqlSession.rollback();
            System.out.println("faith");
        }
        sqlSession.close();//记得要关闭

    }
    @Test
    public void updateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.updateUser(new User(5, "话费单", "dsfaffaf"));
        if (i > 0) {
            sqlSession.commit();
            System.out.println("commit");
        }else {
            sqlSession.rollback();
            System.out.println("rollback");
        }
        sqlSession.close();//记得要关闭
    }
    @Test
    public void deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.deleteUser(new User(3, "话费单", "dsfaffaf"));
        if (i > 0) {
            sqlSession.commit();
            System.out.println("commit");
        }else {
            sqlSession.rollback();
            System.out.println("rollback");
        }
        sqlSession.close();//记得要关闭
    }

}
