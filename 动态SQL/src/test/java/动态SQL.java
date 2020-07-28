import com.bmft.dao.BlogMapper;
import com.bmft.pojo.Blog;
import com.bmft.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class 动态SQL {
    @Test
    public void envouriment(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        List<Blog> blogList = mapper.getBlogList();
        for (Blog blog : blogList) {
            System.out.println(blog);
        }
    }

    @Test
    public void getBlogListIf(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap<String, Object> map = new HashMap<>();
        map.put("title","%j%");
        //map.put("author","%半亩%");
        List<Blog> blogList = mapper.getBlogListIf(map);
        for (Blog blog : blogList) {
            System.out.println(blog);
        }

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void getBlogListChoose(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap<String, Object> map = new HashMap<>();
        map.put("title","%j%");
        //map.put("author","%半亩%");

        List<Blog> blogList = mapper.getBlogListChoose(map);
        for (Blog blog : blogList) {
            System.out.println(blog);
        }

        sqlSession.commit();
        sqlSession.close();
    }


    @Test
    public void updateBlogSet(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap<String, Object> map = new HashMap<>();
        map.put("title","撒旦法福");
        //map.put("author","%半亩%");
        map.put("id",1);

        int i = mapper.updateBlogSet(map);
        if (i > 0) {
            System.out.println("success");
        }


        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void getBlogForEach(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap<String, Object> map = new HashMap<>();
        ArrayList<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(2);
        map.put("ids",ids);

        List<Blog> blogForEach = mapper.getBlogForEach(map);
        for (Blog b : blogForEach) {
            System.out.println(b);
        }


        sqlSession.commit();
        sqlSession.close();
    }
}
