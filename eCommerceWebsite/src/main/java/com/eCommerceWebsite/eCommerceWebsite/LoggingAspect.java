
package com.eCommerceWebsite.eCommerceWebsite;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // Pointcut to match methods in the service package
    @Pointcut("execution(* com.eCommerceWebsite.eCommerceWebsite.*.*(..))")
    public void serviceMethods() {}

    // Advice that runs before each method matched by the pointcut
    @Before("serviceMethods()")
    public void logBefore() {
        System.out.println("LoggingAspect: Before executing method");
    }

    // Advice that runs after a matched method returns successfully
    @AfterReturning("serviceMethods()")
    public void logAfterReturning() {
        System.out.println("LoggingAspect: After method returned successfully");
    }

    // Advice around a matched method to log execution time
    @Around("serviceMethods()")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object proceed = joinPoint.proceed(); // Proceed with the method execution
        long executionTime = System.currentTimeMillis() - start;
        System.out.println(joinPoint.getSignature() + " executed in " + executionTime + "ms");
        return proceed;
    }
}