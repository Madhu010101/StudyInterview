package za.co.fnb.cish.fid.topic.processor.util;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    public static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    @Around("@annotation(za.co.fnb.cish.fid.topic.processor.util.LogExecutionTime)")
    public Object methodTimeLogger(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
        String className = methodSignature.getDeclaringType().getSimpleName();
        String methodName = methodSignature.getName();
        Object result= null;
        long startTime = System.currentTimeMillis();
        result = proceedingJoinPoint.proceed();
        long endTime = System.currentTimeMillis();
        if (LOGGER.isInfoEnabled()) {
            LOGGER.info("{}:{} ExecutionTime:{} ms", className,methodName,(endTime-startTime));
        }
        return result;
    }

}