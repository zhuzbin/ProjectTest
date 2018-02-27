package aop;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/2/26
 * Time：18:09
 */
public class TimeHander {

    public void printTime(){
        System.out.println("CurrentTime = "+System.currentTimeMillis());
    }

    public void operation(String name){
        System.out.println("操作人："+ name);
    }
}
