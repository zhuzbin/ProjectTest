/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/2/24
 * Time：18:13
 */
public class HelloWorld {
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public HelloWorld(String userName) {
        this.userName = userName;
    }

    public void say(){
        System.out.println("name:"+userName);
    }
}
