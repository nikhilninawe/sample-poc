package com.turvo.main.aspect;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Aspect
@Configuration
public class ReconciliationAspect {

    private static final Logger logger = LogManager.getLogger(ReconciliationAspect.class);

    @Pointcut("within(com.turvo.connect.service..*)")
    public void reconciliationMethods() {}

    @Around("within(com.turvo.connect.service.IReconciliator+)")
    public Object measureMethodExecutionTime(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.nanoTime();
        Object retval = pjp.proceed();
        long end = System.nanoTime();
        String methodName = pjp.getSignature().getName();
        logger.info("Execution of " + methodName + " took " +
                TimeUnit.NANOSECONDS.toMillis(end - start) + " ms");
        return retval;
    }
}
