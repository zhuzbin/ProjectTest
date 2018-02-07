package single;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/2/6
 * Time：17:12
 */
public class StaticClass {

    private static class LazyHolder{
        private static final StaticClass INSTANCE = new StaticClass();
    }

    private StaticClass(){

    }

    public static final StaticClass getInstance(){
        return LazyHolder.INSTANCE;
    }
}
