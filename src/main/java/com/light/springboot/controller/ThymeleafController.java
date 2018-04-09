/**
 * 
 */
package com.light.springboot.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author leihuating
 * @time 2018年4月4日 下午12:09:14
 */
@Controller
@RequestMapping("thymeleaf")
public class ThymeleafController {
	@RequestMapping("hello")
	public String hello(Map<String, Object> map) {
		map.put("msg", "Hello Thymeleaf");
		return "hello";
	}
}
