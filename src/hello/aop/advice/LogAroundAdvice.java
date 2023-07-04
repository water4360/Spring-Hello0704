package hello.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAroundAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {

		// �ΰ�����1(�ð�����)
		long start = System.currentTimeMillis();

		// �־��� �θ���
		Object result = invocation.proceed();

		// �ΰ�����2(�ð�����)
		long end = System.currentTimeMillis();
		
		
		long duration = end - start;
		
		String methodName = invocation.getMethod().getName();
		System.out.printf("�޼ҵ� %s�� �� �ҿ�ð� : %d ms �ɷ���\n", methodName, duration);

		return result;
		
		
		
	}

}
