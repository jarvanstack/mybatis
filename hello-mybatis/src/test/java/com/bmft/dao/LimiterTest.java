package com.bmft.dao;

import com.bmft.pojo.User;
import com.bmft.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class LimiterTest {
    @Test
    public void getUserLimit(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("startIndex", 1);
        map.put("pageSize", 2);
        List<User> userLimit = mapper.getUserLimit(map);
        for (User user : userLimit) {
            System.out.println(user);
        }

        sqlSession.commit();
        sqlSession.close();
    }
}
