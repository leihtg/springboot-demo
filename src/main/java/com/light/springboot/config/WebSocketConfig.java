/**
 * 
 */
package com.light.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

import com.light.springboot.websocket.WebSocketServer;

/**
 * @author leihuating
 * @time 2018年4月9日 下午12:24:04
 */
@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {

	@Override
	public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
		registry.addHandler(webSocketServer(), "/webSocketServer/*");
	}

	@Bean
	public WebSocketHandler webSocketServer() {
		return new WebSocketServer();
	}
	/**
	 * 这种打包war运行会报错
	 * 
	 * @return
	 */
	// @Bean
	// public ServerEndpointExporter serverEndpointExporter() {
	// return new ServerEndpointExporter();
	// }
}
