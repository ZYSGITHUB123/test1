package com.nowcoder.toutiAo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
    private static final Logger logger= LoggerFactory.getLogger(LogAspect.class);
    @Before("execution(* com.nowcoder.toutiAo.controller.IndexController.*(..))") //这里指的是需要打印的规范*指通配符
    public void beforeMethod(JoinPoint joinPoint){
        StringBuilder sb =new StringBuilder();
        for(Object arg: joinPoint.getArgs()){
            sb.append("args:"+arg.toString()+"|");
        }
       logger.info("before method:  "+sb.toString());
    }             //开始前
    @After("execution(* com.nowcoder.toutiAo.controller.IndexController.*(..))")
    public void afterMethod(JoinPoint joinPoint){
        logger.info("after method:  ");
    }
}
