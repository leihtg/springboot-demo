/**
 * 
 */
package com.light.springboot.model;

/**
 * @author leihuating
 * @time 2018年4月13日 上午8:41:19
 */
public class Department {
	private Integer id;

	private String name;

	private String descr;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

}
