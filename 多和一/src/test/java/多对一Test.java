import com.bmft.dao.StudentMapper;
import com.bmft.dao.TeacherMapper;
import com.bmft.pojo.Student;
import com.bmft.pojo.Teacher;
import com.bmft.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class 多对一Test {
    @Test
    public void testEnvouriment(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);

        List<Teacher> teacherList = mapper.getTeacherList();
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }

        sqlSession.close();
    }

    @Test
    public void getStudentTeacher01(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        StudentMapper mapper1 = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = mapper1.getStudentTeacher01();
        for (Student student : studentList) {
            System.out.println(student);
        }


        sqlSession.close();
    }

    @Test
    public void getStudentTeacher02(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        StudentMapper mapper1 = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = mapper1.getStudentTeacher02();
        for (Student student : studentList) {
            System.out.println(student);
        }


        sqlSession.close();
    }
}
