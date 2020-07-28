package com.bmft.dao;

import com.bmft.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    /**
     * 所有
     * @return
     */
    List<User> getUserList();

    /**
     * 1.
     * @param user
     * @return
     */
    User getUserById(User user);

    /**
     *  2.
     * @param user
     * @return
     */
    int insertUser(User user);

    /**
     * 3， 修改
     * @param user
     * @return
     */
    int updateUser(User user);

    int deleteUser(User user);

    /**
     * 分页的实现，使用map传递参数
     * @param map
     * @return
     */
    List<User> getUserLimit(Map<String,Integer> map);

    void getUserLimit();
}
