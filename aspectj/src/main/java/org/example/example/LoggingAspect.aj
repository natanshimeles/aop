


public aspect LoggingAspect {

    // Define the pointcut
    pointcut loggingPointCut() : execution(* org.example.example.BankService.*(..));

    // Around advice to log before method execution
    Object around(): loggingPointCut() {
        System.out.println("Before method from aj file: " + thisJoinPoint.getSignature().getName());
        Object result = proceed();
        return result;
    }
}
