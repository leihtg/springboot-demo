/**
 * 
 */
package com.light.springboot.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author leihuating
 * @time 2018年4月4日 上午11:59:33
 */
@Controller
@RequestMapping("freemarker")
public class FreemarkerController {
	@RequestMapping("hello")
	public String hello(Map<String, Object> map) {
		map.put("msg", "hello freemarker!");
		return "hello";
	}
}
