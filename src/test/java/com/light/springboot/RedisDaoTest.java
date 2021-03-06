/**
 * 
 */
package com.light.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.light.springboot.dao.RedisDao;

/**
 * @author leihuating
 * @time 2018年4月13日 下午4:37:26
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisDaoTest {

	@Autowired
	private RedisDao redisDao;

	@Test
	public void testSet() {
		String key = "name";
		String value = "zhangsan"+this;

		this.redisDao.set(key, value);
	}

	@Test
	public void testGet() {
		String key = "name";
		String value = this.redisDao.get(key);
		System.out.println(value);
	}

	@Test
	public void testDelete() {
		String key = "name";
		this.redisDao.delete(key);
	}
}
