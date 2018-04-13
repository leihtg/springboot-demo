/**
 * 
 */
package com.light.springboot.config;

import java.util.Arrays;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.filter.Filter;
import com.alibaba.druid.filter.stat.StatFilter;
import com.alibaba.druid.pool.DruidDataSource;

/**
 * @author leihuating
 * @time 2018年4月13日 上午8:56:20
 */
@Configuration
public class DruidConfiguration {

	@Bean(initMethod = "init", destroyMethod = "close")
	@ConfigurationProperties(prefix = "spring.datasource.druid")
	public DruidDataSource dataSource() {
		DruidDataSource ds = new DruidDataSource();
		ds.setProxyFilters(Arrays.asList(statFilter()));
		return ds;
	}

	@Bean
	public Filter statFilter() {
		StatFilter filter = new StatFilter();
		filter.setSlowSqlMillis(5000);
		filter.setLogSlowSql(true);
		filter.setMergeSql(true);
		return filter;
	}
}
