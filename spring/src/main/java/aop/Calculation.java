package aop;

import org.springframework.stereotype.Service;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/2/26
 * Time：16:27
 */
@Service
public class Calculation {

    public void add(){
        System.out.println("add()方法");
    }

    public int lessen(int num1,int num2){
        return num1-num2;
    }

    public void doPrint(String name){
        System.out.println("Enter doPrint");
    }
}
