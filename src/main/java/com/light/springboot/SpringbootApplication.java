package com.light.springboot;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author leihuating
 * @time 2018年4月4日 上午8:42:05
 */
//开启缓存
@EnableCaching
@SpringBootApplication
public class SpringbootApplication implements ServletContextInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
	
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		/*
		 * 针对自定义 Servlet、Filter 和 Listener 的配置，还有另一种方式：
		 */

		// // 配置 Servlet
		// servletContext.addServlet("servletTest", new
		// ServletTest()).addMapping("/servletTest");
		// // 配置过滤器
		// servletContext.addFilter("timeFilter", new TimerFilter())
		// .addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST), true, "/*");
		// // 配置监听器
		// servletContext.addListener(new ListenerTest());
	}

}
