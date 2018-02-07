package single;


/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/2/6
 * Time：17:15
 */
public class Main {
    public static void main(String[] args) {
        StaticClass staticClass = StaticClass.getInstance();
        StaticClass staticClass1 = StaticClass.getInstance();
        if(staticClass == staticClass1){
            System.out.println("只有一个实例");
        }
    }
}
