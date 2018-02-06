import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhuzb.dao.CountryDao;
import com.zhuzb.model.Country;
import com.zhuzb.proxy.MyMapperProxy;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.Reader;
import java.lang.reflect.Proxy;
import java.util.List;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/1/15
 * Time：14:56
 */
public class Test1 {
    private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader;

    @Test
    public void getById() throws Exception{
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CountryDao countryDao =  sqlSession.getMapper(CountryDao.class);
        //Country country = countryDao.getById("1","中国");
        PageHelper.startPage(1,2);
        List<Country> country = countryDao.getAll();
        PageInfo<Country> p = new PageInfo<Country>(country);
        //System.out.println(p.getList());
        System.out.println("country"+"============"+country.get(0));
        sqlSession.close();
    }

    //@Test
    public void testAdd() throws Exception{
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CountryDao countryDao =  sqlSession.getMapper(CountryDao.class);
        Country country = new Country("xxxx","CCCCC");
        countryDao.saveCountry(country);
        sqlSession.commit();
        sqlSession.close();
        System.out.println(country.getId());
    }

    @Test
    public void proxy(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        MyMapperProxy userMapperProxy = new MyMapperProxy(CountryDao.class,sqlSession);

        CountryDao countryDao = (CountryDao) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                new Class[]{CountryDao.class},userMapperProxy);

        List<Country> country = countryDao.getAll();
        //Country country = countryDao.getById("1","中国");
        System.out.println(country.toString());
    }

    @BeforeClass
    public static void sqlSession() throws Exception{
        try {
            reader = Resources.getResourceAsReader("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    }
}
