package com.itheima.dao4;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class AnnoAdvice {
    @Pointcut("execution( * com.itheima.dao3.UserDaoImpl.*(..))")
    public void poincut(){

    }
    @Before("poincut()")
    public void before(JoinPoint joinPoint){
        System.out.println("前置通知");
        System.out.println("目标类："+joinPoint.getTarget());
        System.out.println(",被植入增强处理的目标方法："+joinPoint.getSignature().getName());
    }
    @AfterReturning("poincut()")
    public void afterReturning(JoinPoint joinPoint){
        System.out.println("返回通知");
        System.out.println(",被植入增强处理的目标方法："+joinPoint.getSignature().getName());
    }
    @Around("poincut()")
    public Object around(ProceedingJoinPoint point) throws Throwable{
        System.out.println("环绕之前通知部分");
        Object object=point.proceed();
        System.out.println("环绕之后通知部分");
        return object;
    }
    @AfterThrowing("poincut()")
    public void afterThrowing(){
        System.out.println("异常通知");
    }
    @After("poincut()")
    public void after(){
        System.out.println("后置通知");
    }
}
