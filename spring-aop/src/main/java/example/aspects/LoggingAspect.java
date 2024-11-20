package example.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

// https://docs.spring.io/spring-framework/reference/core/aop/ataspectj/pointcuts.html
@Aspect
@Component
public class LoggingAspect {

    @Pointcut("execution(* example.resources.*.*(..))")
    public void loggingPointCut() {
        // Pointcut definition
    }

    @Around("loggingPointCut()")
    public Object logBeforeMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Before method: " + joinPoint.getSignature().getName());
        return joinPoint.proceed();
    }

}
