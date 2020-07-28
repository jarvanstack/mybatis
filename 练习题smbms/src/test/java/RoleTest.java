import com.bmft.dao.RoleMapper;
import com.bmft.pojo.Role;
import com.bmft.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.List;

public class RoleTest {
    static org.apache.log4j.Logger logger = Logger.getLogger(UserTest.class);

    @Test
    public void getRoleList() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        RoleMapper mapper = sqlSession.getMapper(RoleMapper.class);
        List<Role> roleList = mapper.getRoleList();
        for (Role role : roleList) {
            System.out.println(role);
        }

        sqlSession.commit();
        sqlSession.close();
    }
}
