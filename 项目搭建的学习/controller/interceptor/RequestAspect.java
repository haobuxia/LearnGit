package edu.thss.platform.controller.interceptor;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 请求的配置要请求的aop日志记录
 */
@Aspect
@Component
public class RequestAspect {

    static Logger logger = LoggerFactory.getLogger(RequestAspect.class);

    @Value("${debug}")
    boolean debug;

    @Pointcut("execution(* edu.thss.platform.controller.*.*Controller.*(..))")
    public void log(){}

    @Before("log()")
    public void doBefore(JoinPoint joinPoint){
        if(!debug) return;
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            ServletRequestAttributes attributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
            HttpServletRequest request = attributes.getRequest();
            logger.info("HTTP Request URL = {} ", request.getRequestURL());
            logger.info("HTTP Request Method = {}", request.getMethod());
            logger.info("Class Method Signature = {}", joinPoint.getSignature());
            List<?> args = Arrays.asList(joinPoint.getArgs()).stream().filter(arg -> !(arg instanceof HttpServletResponse)).collect(Collectors.toList());
            logger.info("HTTP Request Params = {} ", objectMapper.writeValueAsString(args));
        } catch (JsonProcessingException e) {
            logger.error("", e);
        }
    }

    @AfterReturning(returning = "o", pointcut = "log()")
    public void methodAfterReturing(Object o ) {
        if(!debug) return;
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            logger.info("HTTP Response:"+ objectMapper.writeValueAsString(o));
        } catch (JsonProcessingException e) {
            logger.error("", e);
        }
    }


}
