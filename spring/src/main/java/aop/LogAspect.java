package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/2/27
 * Time：10:54
 */
@Component
@Aspect
public class LogAspect {

    @Pointcut("(execution(* aop.Calculation.doPrint(..)) || execution(* aop.Calculation.add())) && args(name)")
    public void pointcutName(String name){

    }

    @Before("pointcutName(name)")
    public void performance(String name) {
        try{
            System.out.println("前置通知:"+name);
        }catch (Throwable e){

        }

    }

/*    @AfterReturning("pointcutName()")
    public void doAfterReturning(){
        System.out.println("后置通知");
    }

    @After("pointcutName()")
    public void doAfter(){
        System.out.println("最终通知");
    }

    @AfterThrowing("pointcutName()")
    public void doAfterThrowing(){
        System.out.println("异常通知");
    }*/
}
