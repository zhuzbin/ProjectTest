package factory.statics;

import factory.Car;

import java.util.HashMap;
import java.util.Map;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/2/26
 * Time：11:55
 */
public class CarStaticFactory {
    private static Map<Integer,Car> map = new HashMap<Integer, Car>();

    static{
        map.put(1,new Car(1,"Honda",300000));
        map.put(2,new Car(2,"Audi",4400000));
        map.put(3,new Car(3,"BMW", 5500000));
    }

    public static Car getCar(int id){
        return map.get(id);
    }
}
