package im.zishen.study.bookstore.bookstore_springmvc.controller;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Aop {
    @Pointcut("execution(* im.zishen.study.bookstore.bookstore_springmvc.service..*.*(..))")
    public void pointCut(){}
    @Before("pointCut()")
    public void begin(){
        System.out.println("方法执行前");
    }

    @After("pointCut()")
    public void end(){
        System.out.println("方法执行后");
    }
}
