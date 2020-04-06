package com.thiagomuller.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopExpressions {
    @Pointcut("execution(* com.thiagomuller.aopdemo.dao.*.*(..))")
    public void forDaoPackage(){}

    @Pointcut("execution(* com.thiagomuller.aopdemo.dao.*.get*(..))")
    public void getter(){}

    @Pointcut("execution(* com.thiagomuller.aopdemo.dao.*.set*(..))")
    public void setter(){}

    @Pointcut("forDaoPackage() && !(getter() || setter())")
    public void forDaoPackageNoGetterSetter(){}
}
