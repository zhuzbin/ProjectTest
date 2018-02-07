package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/2/6
 * Time：17:31
 */
public class StarHandler implements InvocationHandler {

    StarInterface star;

    public StarHandler(StarInterface star) {
        this.star = star;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if("sing".equals(method.getName())){
            method.invoke(star,args);
        }

        return "错误";
    }
}
