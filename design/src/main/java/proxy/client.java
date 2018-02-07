package proxy;

import java.lang.reflect.Proxy;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/2/6
 * Time：17:46
 */
public class client {

    public static void main(String[] args) {
        StarInterface star = new Star();
        StarHandler handler = new StarHandler(star);


        StarInterface proxy = (StarInterface) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{StarInterface.class},handler);

        proxy.sing();
        proxy.ding();
    }
}
