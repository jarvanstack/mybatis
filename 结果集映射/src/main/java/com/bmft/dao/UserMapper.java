package com.bmft.dao;

import com.bmft.pojo.User;

import java.util.List;

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
}
