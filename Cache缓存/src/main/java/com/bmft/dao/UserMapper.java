package com.bmft.dao;

import com.bmft.pojo.User;


import java.util.Map;

public interface UserMapper {

    User getUserById(Map<String,Object> map);
}
