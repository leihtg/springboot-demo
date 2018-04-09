/**
 * 
 */
package com.light.springboot.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author leihuating
 * @time 2018年4月9日 上午10:41:19
 */
@Aspect
@Component
public class TimeAspect {

	@Around("execution(* com.light.springboot.controller.FastjsonController..*(..))")
	public Object method(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("=========Aspect处理=========");
		Object[] args = pjp.getArgs();
		for (Object o : args) {
			System.out.println("参数：" + o);
		}
		long start = System.currentTimeMillis();
		Object object = pjp.proceed();
		System.out.println("Aspect 耗时:" + (System.currentTimeMillis() - start));
		return object;

	}
}
