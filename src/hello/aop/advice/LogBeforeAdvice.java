package hello.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class LogBeforeAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println(method.getName() + " : �տ��� �����ϴ� beforeAdvice �Դϴ� :)");
	}
	

}
