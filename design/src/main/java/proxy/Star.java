package proxy;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/2/6
 * Time：17:30
 */
public class Star implements StarInterface {

    @Override
    public void sing(){
        System.out.println("正在唱歌！！！！");
    }

    @Override
    public void ding(){
        System.out.println("正在订票！！！");
    }
}
