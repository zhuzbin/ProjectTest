package generic.repository;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/2/27
 * Time：16:36
 */
public class BaseDao<T> {

    public void save(T entity){
        System.out.println("Save:"+entity);
    }
}
