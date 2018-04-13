/**
 * 
 */
package com.light.springboot.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @author leihuating
 * @time 2018年4月13日 下午4:36:44
 */
@Component
public class RedisDao {
	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	public void set(String key, String value) {
		this.stringRedisTemplate.opsForValue().set(key, value);
	}

	public String get(String key) {
		return this.stringRedisTemplate.opsForValue().get(key);
	}

	public void delete(String key) {
		this.stringRedisTemplate.delete(key);
	}
}
