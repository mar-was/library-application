package marwas.libraryapplication.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class MethodExecutionTimeCalculatorAspect {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Around("marwas.libraryapplication.aop.CommonJoinPointConfig.logExecutionTimeAnnotation()")
	public void logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
	   
		long startTime = System.currentTimeMillis();
	 
	    joinPoint.proceed();
	 
	    long timeTaken = System.currentTimeMillis() - startTime;
	    
	    logger.info(joinPoint.getSignature() + " executed in " + timeTaken + "ms");
	}
}
