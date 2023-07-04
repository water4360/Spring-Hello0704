package hello.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAroundAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {

		long start = System.currentTimeMillis();

		Object result = invocation.proceed();

		long end = System.currentTimeMillis();
		
		
		long duration = end - start;
		
		String methodName = invocation.getMethod().getName();
		System.out.printf("실행 메소드 : %s, 소요 시간 : %d ms 걸렸음!\n", methodName, duration);

		return result;
		
		
		
	}

}
