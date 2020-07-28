package com.bmft.dao;

import com.bmft.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {

    List<Blog> getBlogList();

    List<Blog> getBlogListIf(Map<String,Object> map);

    List<Blog> getBlogListChoose(Map<String,Object> map);

    int updateBlogSet(Map<String,Object> map);

    List<Blog> getBlogForEach(Map<String,Object> map);


}
