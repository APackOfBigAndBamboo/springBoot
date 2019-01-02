package com.david.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
/**
 * @author  David
 */
@Aspect
@Component
public class HttpAspect {
    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    /**
     * 定义一个切点方法
     */
    @Pointcut("execution(public  * com.david.controller.GirlController.*(..))")
    public void log() {
    }

    @Before("log()")
    public void doBefore(JoinPoint joinPoint) {

        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        //url ip  method  类名、方法  参数
        logger.info("url={}", request.getRequestURL());
        logger.info("ip={}", request.getRemoteAddr());
        logger.info("method={}", request.getMethod());
        logger.info("class_method={}", joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        logger.info("args={}", joinPoint.getArgs());
    }

    @After("log()")
    public void doAfter() {
        logger.info("bbbbbb");
    }

    @AfterReturning(returning = "o",pointcut = "log()")
    public  void doAfterReturn(Object o){
        logger.info("response={}",o.toString());
    }
}
