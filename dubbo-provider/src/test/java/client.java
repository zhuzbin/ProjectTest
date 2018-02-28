import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/2/28
 * Time：17:16
 */
public class client {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext app =  new ClassPathXmlApplicationContext("classpath:spring-provider.xml");
        System.in.read();
    }
}
