package com.cogknit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.cogknit.dao.EmployeeDao;
import com.cogknit.dao.EmployeeDaoImpl;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.cogknit.controller", "com.cogknit.dao" })
public class WebMvcConfig {
	@Bean
	public InternalResourceViewResolver viewResolver() {

		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("/");
		vr.setSuffix(".jsp");

		return vr;
	}

	@Bean
	public DriverManagerDataSource getDataSource() {

		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/umadb");
		ds.setUsername("root");
		ds.setPassword("cogknit");

		return ds;
	}

	@Bean
	public EmployeeDao getEmployeeDao() {
		return new EmployeeDaoImpl(getDataSource());
	}
}
