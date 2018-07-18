package com.exilant.profile;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

//@Profile("Development")

@Configuration("Development")
public class DevDatabaseConfigh implements DatabaseConfig {

	@Override
	@Bean
	public DataSource createDataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		System.out.println("creating development database");
		
		return ds;
	}

}
