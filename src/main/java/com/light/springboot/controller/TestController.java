/**
 * 
 */
package com.light.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author leihuating
 * @time 2018年4月4日 上午8:42:48
 */
@RestController
public class TestController {
	@RequestMapping("/helloworld")
	public String helloworld() {
		return "==hello-world!==";
	}

	@RequestMapping("/helloworld2")
	public String helloworld2() {
		return "==hello-world!==2";
	}
}
