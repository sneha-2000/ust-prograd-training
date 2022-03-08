package com.example.demoAPOApplication;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Helper {
//     Cross-cutting concerns
//    public  static  void log(){
//        System.out.println("print-only when method is executed!");
//    }



//    @Pointcut("execution(public void show())")
//    public void pointcut() {
//    }

//   @Before("execution(public * show(int,..))")   //"pointcut()"
//    public void log() {
//        System.out.println("before function execution");
//    }
//
//    @After("pointcut()")//"execution(public void show())"
//    public void afterLog() {
//        System.out.println("after function execution");
//    }

//    @Around("pointcut()")
//    public void aroundLog(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
//        System.out.println("before");
//        proceedingJoinPoint.proceed();
//        System.out.println("after");
//    }
//
//    @AfterReturning("execution(public * show())")
//    public void afterLogReturning() {
//        System.out.println("after returning function execution");
//    }

    //output
//    inside void show
//    inside int show
//    after returning function execution
//    inside not shown
//    inside shown

    @AfterThrowing("execution(public * show())")
    public void afterLogThrowing() {
        System.out.println("after throwing function execution");
    }

    //output
//    inside void show
//    inside int show
//    inside not shown
//    inside shown


}



























