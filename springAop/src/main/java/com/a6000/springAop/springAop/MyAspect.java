package com.a6000.springAop.springAop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
    public void myBefore(JoinPoint joinPoint){
        System.out.println("before:" + joinPoint.getSignature().getName() );
    }

    public void myAfterReturing(JoinPoint joinPoint,Object ret){
        System.out.println("after"+ joinPoint.getSignature().getName() + ",->" + ret);
    }
    public Object MyAround(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("before");
        Object obj = joinPoint.proceed();
        System.out.println("after");
        return obj;
    }

    public void myAfterThrowing(JoinPoint joinPoint, Throwable e){
        System.out.println("throwable" + e.getMessage());
    }
}
