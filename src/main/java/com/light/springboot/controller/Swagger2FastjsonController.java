/**
 * 
 */
package com.light.springboot.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.light.springboot.model.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

/**
 * @author leihuating
 * @time 2018年4月4日 下午12:17:49
 * 
 *       为了能更好的说明接口信息，我们还可以在 Controller 类上使用 Swagger2 相关注解说明信息。
 *       
 *       测试：启动项目打开 http://localhost:8080/swagger-ui.html
 */
@Api(value = "FastJson测试", tags = { "测试接口" })
@RestController
@RequestMapping("fastjson")
public class Swagger2FastjsonController {

	@ApiOperation("获取用户信息")
	@ApiImplicitParam(name = "name", value = "用户名", dataType = "string", paramType = "query")
	@GetMapping("/test/{name}")
	public User test() {
		User user = new User();

		user.setId(1);
		user.setUsername("jack");
		user.setPassword("jack123");
		user.setBirthday(new Date());
		return user;
	}
}
