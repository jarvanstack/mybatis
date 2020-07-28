package com.bmft.dao;

import com.bmft.pojo.User;
import com.bmft.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.List;

/**
 * 这里展示log4j 日志的在类中自定义简单使用
 */
public class Logging {
    //1.导入正确的包 创建全局longer对象
    static Logger logger = Logger.getLogger(Logging.class);
    @Test
    public void test(){
        logger.info("info:信息一般用于替换 进入 Servlet，进入Service，进入Dao");
        logger.debug("debug:一般在debug模式中使用");
        logger.error("error:出现异常，一般放在catch 语句里，捕获异常");
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }
}
