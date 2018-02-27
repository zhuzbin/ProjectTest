import aop.Calculation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/2/27
 * Time：11:15
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring-aop.xml"})
public class Test111 {

    @Autowired
    private Calculation calculation;

    @Test
    public void aaa(){
        calculation.doPrint("aaaaa");
/*        System.out.println();
        calculation.add();*/
    }
}
