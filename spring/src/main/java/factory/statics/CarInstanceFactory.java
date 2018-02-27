package factory.statics;

import factory.Car;

import java.util.HashMap;
import java.util.Map;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/2/26
 * Time：14:05
 */
public class CarInstanceFactory {
    private Map<Integer, Car> map = new HashMap<Integer, Car>();

    public void setMap(Map<Integer,Car> map){
        this.map = map;
    }

    public CarInstanceFactory(){

    }

    public Car getCar(int id){
        return map.get(id);
    }
}
