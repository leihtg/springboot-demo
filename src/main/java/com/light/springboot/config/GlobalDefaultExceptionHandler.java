/**
 * 
 */
package com.light.springboot.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author leihuating
 * @time 2018年4月9日 上午11:00:24
 * 
 *       全局异常捕获
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {

	/**
	 * 处理 Exception 类型的异常
	 * 
	 * 其中，方法名为任意名，入参一般使用 Exception 异常类，方法返回值可自定义。
	 * 
	 * @param e
	 * @return
	 */
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public Map<String, Object> defaultExceptionhanlder(Exception e) {
		Map<String, Object> map = new HashMap<>();
		map.put("code", 500);
		map.put("msg", e.getMessage());
		return map;
	}
}
