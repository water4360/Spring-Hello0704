package hello.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAroundAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {

		// 부가업무1(시간측정)
		long start = System.currentTimeMillis();

		// 주업무 부르기
		Object result = invocation.proceed();

		// 부가업무2(시간측정)
		long end = System.currentTimeMillis();
		
		
		long duration = end - start;
		
		String methodName = invocation.getMethod().getName();
		System.out.printf("메소드 %s의 총 소요시간 : %d ms 걸렸음\n", methodName, duration);

		return result;
		
		
		
	}

}
