package com.projects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.stream.Collectors;

@Aspect
@Component
public class LogginAspect {

    @Before("execution(* com.projects.ShoppingCart.checkout(..))")
    public void logger(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature());
        System.out.println(Arrays.stream(joinPoint.getArgs()).map(arg -> arg.toString()).collect(Collectors.toList()));
        System.out.println("Loggers");
    }

    @After("execution(* com.projects.ShoppingCart.checkout(..))")
    public void afterLogger() {
        System.out.println("After logger");
    }

    @Pointcut("execution(com.projects.ShoppingCart.quantity(..))")
    public void afterReturningPointCut() {

    }

    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "retVal")
    public void afterReturning(String retVal) {
        System.out.println("After Returning : ".concat(retVal));
    }
}
