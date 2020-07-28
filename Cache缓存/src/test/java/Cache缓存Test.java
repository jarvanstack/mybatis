import com.bmft.dao.UserMapper;
import com.bmft.pojo.User;
import com.bmft.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Cache缓存Test {
    @Test
    public void test() {

        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        HashMap<String, Object> map = new HashMap<>();
        map.put("id", 1);
        User user = mapper.getUserById(map);
        System.out.println(user);
        sqlSession.clearCache();
        //第二次
        HashMap<String, Object> map2 = new HashMap<>();
        map2.put("id", 1);
        User user2 = mapper.getUserById(map2);
        System.out.println(user2);


        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void test02() {
        //测试二级缓存
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SqlSession sqlSession2 = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id", 1);
        User user1 = mapper.getUserById(map);
        System.out.println(user1);
        sqlSession.commit();
        sqlSession.close();

        UserMapper mapper1 = sqlSession2.getMapper(UserMapper.class);
        User user2 = mapper1.getUserById(map);
        System.out.println(user2);
        System.out.println("== ============"+(user1==user2));



    }
}
