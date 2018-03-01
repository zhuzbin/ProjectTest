package com.zhuzb.conf;

import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/3/1
 * Time：10:40
 */
@Component
@Aspect
public class DataSourceAspect {

    @Pointcut("execution(* com.zhuzb.service.*.*(..))")
    public void pointcut(){
    }

    @Before("pointcut()")
    public void before(JoinPoint point){
        String methodName = point.getSignature().getName();
        if(isSlave(methodName)){
            DynamicDataSourceHolder.markSlave();
        }else{
            DynamicDataSourceHolder.markMaster();
        }
    }

    private Boolean isSlave(String methodName){
        return StringUtils.startsWithAny(methodName,"query","find","get");
    }
}
