package com.bmft.dao;


import com.bmft.pojo.Role;

import java.util.List;

public interface RoleMapper {
    /**
     * 获取Role list集合,因为查询所有3个role，所以不需要参数
     * 但是还是记得创立connection，控制事务等，并传递给Dao层
     */
    List<Role> getRoleList();
}
