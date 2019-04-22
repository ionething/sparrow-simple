package com.github.ionething.sparrow.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
@Profile({"dev","test"})
public class LogAspect {

    @Pointcut("execution(public * com.github.ionething.sparrow.service..*.*(..))")
    public void logPointcut() {
    }

}
