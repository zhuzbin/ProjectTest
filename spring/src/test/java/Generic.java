import generic.entity.Role;
import generic.service.RoleService;
import generic.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/2/27
 * Time：17:25
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring-generic.xml"})
public class Generic {
    @Autowired
    private RoleService roleService;

    @Autowired
    private UserService userService;

    @Test
    public void test1(){
        roleService.save(new Role());
    }
}
