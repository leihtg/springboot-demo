/**
 * 
 */
package com.light.springboot.dao;

import com.light.springboot.model.User;

/**
 * @author leihuating
 * @time 2018年4月13日 上午11:58:12
 */
public interface UserDao {
	public int insert(User user);

	public int deleteById(Integer id);

	public int update(User user);

	public User getById(Integer id);
}
