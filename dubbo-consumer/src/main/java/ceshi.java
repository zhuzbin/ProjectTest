import cal.Calcustion;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/2/28
 * Time：15:47
 */
public class ceshi {

    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("classpath:spring-consumer.xml");
        Calcustion c = (Calcustion)app.getBean("cals");
        System.out.println(c.add(1,2));
    }

}
