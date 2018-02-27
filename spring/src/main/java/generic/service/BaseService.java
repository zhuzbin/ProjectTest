package generic.service;

import generic.repository.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/2/27
 * Time：16:39
 */
public class BaseService<T> {
    @Autowired
    private BaseDao<T> dao;

    public void save(T entity){
        System.out.println("addNew by"+dao);
        dao.save(entity);
    }
}
