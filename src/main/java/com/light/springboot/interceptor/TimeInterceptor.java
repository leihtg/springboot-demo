/**
 * 
 */
package com.light.springboot.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author leihuating
 * @time 2018年4月9日 上午10:03:06
 * 
 *       使用 @Component 让 Spring 管理其生命周期
 */
@Component
public class TimeInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception exception) throws Exception {
		System.out.println("================afterCompletion================");
		long start = (Long) request.getAttribute("startTime");
		System.out.println("耗时：" + (System.currentTimeMillis() - start));
		System.out.println(exception);
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modleAndView) throws Exception {
		System.out.println("================postHandle================");
		long start = (Long) request.getAttribute("startTime");
		System.out.println("耗时：" + (System.currentTimeMillis() - start));
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("================preHandle================");
		System.out.println(((HandlerMethod) handler).getBean().getClass().getName());
		System.out.println(((HandlerMethod) handler).getMethod().getName());
		request.setAttribute("startTime", System.currentTimeMillis());

		return true;
	}

}
