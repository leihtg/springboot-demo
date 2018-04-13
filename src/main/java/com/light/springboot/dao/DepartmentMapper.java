/**
 * 
 */
package com.light.springboot.dao;

import org.apache.ibatis.annotations.Mapper;

import com.light.springboot.model.Department;

/**
 * @author leihuating
 * @time 2018年4月13日 上午8:43:16
 */
@Mapper
public interface DepartmentMapper {

    public void insert(Department department);
    
    public Department getById(Integer id);
    
    public void update(Department department);
    
    public void deleteById(Integer id);
}
