/**
 * 
 */
package com.light.springboot.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.light.springboot.model.User;

/**
 * @author leihuating
 * @time 2018年4月4日 下午12:17:49
 */
@Controller
@RequestMapping("fastJson")
public class FastjsonController {
	@RequestMapping("/test")
	@ResponseBody
	public User test() {
		User user = new User();

		user.setId(1);
		user.setUsername("jack");
		user.setPassword("jack123");
		user.setBirthday(new Date());
int i=1/0;
		return user;
	}
}
