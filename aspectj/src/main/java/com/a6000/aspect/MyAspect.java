package com.a6000.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor {

    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("before");
        Object obj = methodInvocation.proceed();
        System.out.println("after");

        return obj;

    }
}
