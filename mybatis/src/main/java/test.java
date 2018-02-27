import com.zhuzb.dao.CountryDao;
import com.zhuzb.dao.GradesMapper;
import com.zhuzb.dao.StudentMapper;
import com.zhuzb.model.Country;
import com.zhuzb.model.Grades;
import com.zhuzb.model.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;
import java.util.List;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/1/15
 * Time：11:20
 */
public class test {

    public static void main(String[] args) throws Exception {

        //List<Country> country = sqlSession.selectList("getById",1);
        //Country country = new Country("aaa","ZZZ");
        //Integer id = sqlSession.insert("saveCountry",country);
/*        SqlSession sqlSession = sqlSessionFactory.openSession();
        CountryDao mapper = sqlSession.getMapper(CountryDao.class);
        List<Country> lists = mapper.getAll();
        sqlSession.close();*/
        //List<Country> country = sqlSession.selectList("getByName","北京");
/*            lists.add(new Country());
        lists = mapper.getAll();
        System.out.println(lists.size());*/

/*        sqlSession = sqlSessionFactory.openSession();
        CountryDao mapper1 = sqlSession.getMapper(CountryDao.class);
        List<Country> list1 = mapper1.getAll();*/


        SqlSession session1 = getSqlSessionFactory().openSession(true);
/*        GradesMapper mapper = session1.getMapper(GradesMapper.class);
        Grades grades = new Grades();
        grades.setName("一年级");
        mapper.save(grades);*/
/*
        Student student = new Student();
        student.setName("好孩子");
        student.setAge(11);
        student.setGradesId(2);
        mapper.save(student);*/
        StudentMapper mapper = session1.getMapper(StudentMapper.class);
        Student student = mapper.getByIdTea(1);
        System.out.println(student);
        session1.close();
    }

    public static SqlSessionFactory getSqlSessionFactory() throws Exception {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        reader.close();
        return sqlSessionFactory;
    }
}
