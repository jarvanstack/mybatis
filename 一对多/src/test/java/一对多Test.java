import com.bmft.dao.TeacherMapper;
import com.bmft.pojo.Teacher;
import com.bmft.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * 查询老师下的学生用list集合
 */
public class 一对多Test {
    @Test
    public void testEnvouriment(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teacherList = mapper.getTeacherList();
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
        sqlSession.commit();
        sqlSession.close();
    }
    /*
    Teacher
    (id=1,
    name=托尼老师,
    students=[Student(id=1, name=admin, tid=null),
        Student(id=2, name=张三, tid=null),
        Student(id=3, name=李四, tid=null),
        Student(id=4, name=王二, tid=null)])
     */
    @Test
    public void getTeacherStudent(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teacherList = mapper.getTeacherStudent();
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
        sqlSession.commit();
        sqlSession.close();
    }

}
