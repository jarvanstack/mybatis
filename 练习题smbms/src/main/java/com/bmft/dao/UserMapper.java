package com.bmft.dao;


import com.bmft.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * service层调用DAO层和事务实现业务逻辑
 */
public interface UserMapper {
    /**
     * 实现登录业务逻辑
     * @return User
     */
    User login(Map<String,Object> map);

    /**
     * 传入id和需要修改的密码，就给服务层级修改。
     *
     */
    boolean updatePassword(Map<String,Object> map);

    /**
     * 返回条件下用户的总数
     * 前端参数为
     * queryname=&queryUserRole=0&pageIndex=1
     *
     * @return 返回条件下用户的总数
     */
    int getUserCount(Map<String,Object> map);

    /**
     *  Service获取user List,传入参数为 username userRole currentPageNo用于分页。
     *
     * @return
     */
    List<User> getUserList(Map<String,Object> map);

    /**
     * 添加用户，
     * Servlet层完成User的初始化，
     * @param user
     * @return
     */
    boolean addUser(User user);

    /**
     * 调用数据库判断是否存在userCode 是就返回true
     * @param userCode
     * @return
     */
    boolean userCodeExist(String userCode);

    /**
     * view查询具体用户，通过你id查询
     * @return
     */
    User getUserById(Map<String,Object> map);

    /**
     * 修改用户modifyUser，增删改，都需要事务
     * 不要抛异常
     * @return
     */
    boolean modifyUser(Map<String,Object> map) ;

    /**
     * 删除用户，增删改都需要抛出异常，给service回滚的机会和commit的机会。
     * @return
     */
    boolean deleteUser(Map<String,Object> map);
}
