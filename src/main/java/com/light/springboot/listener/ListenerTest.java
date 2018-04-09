/**
 * 
 */
package com.light.springboot.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author leihuating
 * @time 2018年4月9日 上午9:41:33
 */
public class ListenerTest implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("监听器销毁");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("监听器初始化");
	}

}
