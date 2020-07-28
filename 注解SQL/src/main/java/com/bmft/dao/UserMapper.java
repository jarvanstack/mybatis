package com.bmft.dao;

import com.bmft.pojo.User;
import org.apache.ibatis.annotations.*;

/**
 * 1.编写接口和SQL注解
 * 2. 配置mybatis核心配置
 * 3. 测试
 */
public interface UserMapper {
    @Select("select * from user where id = #{id}")//# 好是预编译，${} 反之
    User getUserById(@Param("id") Integer id);
    @Insert("insert into user values(#{id},#{name},#{password})")
    Integer insertUser(User user );
    @Delete("delete from  user where id = #{id}")
    Integer deleteUser(@Param("id") Integer id);
    @Update("update user set name = #{name},password = #{password} where id = #{id}")
    Integer updateUser(User user);

}
