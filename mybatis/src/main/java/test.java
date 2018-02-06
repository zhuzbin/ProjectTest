import com.zhuzb.model.Country;
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
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        reader.close();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //List<Country> country = sqlSession.selectList("getById",1);
        Country country = new Country("aaa","ZZZ");
        Integer id = sqlSession.insert("saveCountry",country);
        System.out.println(id);
    }
}
