package com.thiagomuller.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {


    @Pointcut("execution(* com.thiagomuller.aopdemo.dao.*.*(..))")
    private void forDaoPackage(){}

    @Pointcut("execution(* com.thiagomuller.aopdemo.dao.*.get*(..))")
    private void getter(){}

    @Pointcut("execution(* com.thiagomuller.aopdemo.dao.*.set*(..))")
    private void setter(){}

    @Before("forDaoPackage()")
    public void beforeAddAccountAdvice(){
        System.out.println("\n==========>>>>>>> Executing @Before advice on " +
                "method addAccount()");
    }

    @Before("forDaoPackage()")
    public void performApiAnalytics(){
        System.out.println("\n==========>>>>>>> Performing API analytics");
    }


}
