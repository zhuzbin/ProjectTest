package test;

import com.zhuzb.dao.CountryDao;
import com.zhuzb.model.Country;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/1/16
 * Time：16:21
 */
public class MybatisTest {

    @Test
    public void tests(){
        ApplicationContext app = new ClassPathXmlApplicationContext("classpath:spring/spring-mybatis.xml");
        SqlSessionFactory sqlSessionFactory =  (SqlSessionFactory)app.getBean("sqlSessionFactory");
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CountryDao countryDao = sqlSession.getMapper(CountryDao.class);
        List<Country> list = countryDao.getAll();
        System.out.println(list);
    }
}
