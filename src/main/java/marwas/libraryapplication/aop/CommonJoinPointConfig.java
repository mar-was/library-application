package marwas.libraryapplication.aop;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
	@Pointcut("@annotation(marwas.libraryapplication.aop.ExecutionTimeLogging)")
	public void logExecutionTimeAnnotation() {}
}
