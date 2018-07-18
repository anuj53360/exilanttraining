package com.exilant.profile;



import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages="com.exilant.profile")
@Configuration
public class AppConfig {

	@Autowired
	 DataSource datasource;
}
