import aop.Calculation;
import factory.Car;
import factory.Conllection.ConllectionInstance;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/2/24
 * Time：18:15
 */
public class Client {
    ApplicationContext app = new ClassPathXmlApplicationContext("classpath:spring-aop.xml");

    @Autowired
    private Calculation calculation;

    @Test
    public void test(){
        //HelloWorld hello =  (HelloWorld)app.getBean("hello");
        HelloWorld hello =  (HelloWorld)app.getBean("hello1");
        hello.say();
    }

    @Test
    public void testFactory(){
        Car audiCar = (Car)app.getBean("audiCar");
        System.out.println(audiCar);

        Car bmwCar = (Car)app.getBean("bmwCar");
        System.out.println(bmwCar);
    }

    @Test
    public void testInstanceFactory(){
        Car audiCar = (Car)app.getBean("car1");
        System.out.println(audiCar);

        Car bmwCar = (Car)app.getBean("car2");
        System.out.println(bmwCar);
    }

    @Test
    public void testCollectionInstance(){
        ConllectionInstance instance = (ConllectionInstance)app.getBean("collectionInstance");
        System.out.println(instance);
    }

    @Test
    public void testAop(){
        calculation.doPrint("aaa");
    }
}
