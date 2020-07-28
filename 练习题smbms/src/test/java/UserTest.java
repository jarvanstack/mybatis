import com.bmft.dao.UserMapper;
import com.bmft.pojo.User;
import com.bmft.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;


public class UserTest {
    static Logger logger = Logger.getLogger(UserTest.class);


    @Test
    public void login(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Object> map = new HashMap<>();
        map.put("userCode","admin");
        map.put("userPassword","1234567");
        User login = mapper.login(map);
        System.out.println(login);

        sqlSession.commit();
        sqlSession.close();
    }

    // boolean updatePassword(int id, String userNewPassword);
    @Test
    public void updatePassword(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Object> map = new HashMap<>();
        map.put("id","1");
        map.put("userName","超级超级管理员");
        boolean b = mapper.updatePassword(map);
        logger.info(b);


        sqlSession.commit();
        sqlSession.close();
    }

    //    int getUserCount(String userName, String userRole);

    @Test
    public void getUserCount(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Object> map = new HashMap<>();
        map.put("userName","%管理%");
        int userCount = mapper.getUserCount(map);
        System.out.println("==========="+ userCount);


        sqlSession.commit();
        sqlSession.close();
    }
    //    List<User> getUserList(String userName, String userRole, String currentPageNo);


    @Test
    public void getUserList(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Object> map = new HashMap<>();

        List<User> userList = mapper.getUserList(map);
        for (User user : userList) {
            System.out.println(user);
        }


        sqlSession.commit();
        sqlSession.close();
    }


    //User getUserById(String id); User getUserById(Map<String,Object> map);
    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Object> map = new HashMap<>();
        map.put("id",1);

        User userById = mapper.getUserById(map);
        System.out.println(userById);


        sqlSession.commit();
        sqlSession.close();
    }

    // boolean addUser(User user);
    @Test
    public void addUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Object> map = new HashMap<>();
        map.put("id",1);

        User userById = mapper.getUserById(map);
        userById.setId(3);
        userById.setUserName("a瘪三");
        boolean b = mapper.addUser(userById);
        System.out.println("-------------------"+b);



        sqlSession.commit();
        sqlSession.close();
    }
    //boolean userCodeExist(String userCode);
    @Test
    public void userCodeExist(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        boolean admin = mapper.userCodeExist("admin");
        logger.info(admin);


        sqlSession.commit();
        sqlSession.close();
    }

    //boolean modifyUser(User user) ;
    @Test
    public void modifyUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        HashMap<String, Object> map = new HashMap<>();
        map.put("id",1);
        map.put("userName","超级无敌管理员");

        boolean b = mapper.modifyUser(map);
        logger.info(b);


        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        HashMap<String, Object> map = new HashMap<>();
        map.put("id",26);

        boolean b = mapper.deleteUser(map);
        logger.info(b);


        sqlSession.commit();
        sqlSession.close();
    }
}







