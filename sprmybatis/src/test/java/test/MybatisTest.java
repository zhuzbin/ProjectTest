package test;

import com.zhuzb.dao.CountryDao;
import com.zhuzb.model.Country;
import com.zhuzb.service.CountryService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/1/16
 * Time：16:21
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/spring-mybatis.xml"})
public class MybatisTest {

    @Autowired
    private CountryService countryService;

    @Test
    public void tests(){
        List<Country> list = countryService.getAll();
        System.out.println(list.size());
    }

    @Test
    public void save(){
        Country country = new Country();
        country.setCountry_name("我不知道");
        country.setCountry_code("11111");
        countryService.saveCountry(country);
    }
}
