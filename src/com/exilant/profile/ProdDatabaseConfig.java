package com.exilant.profile;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
//@Profile("Production")
@Configuration("Production")
public class ProdDatabaseConfig implements DatabaseConfig{

	@Override
	@Bean
	public DataSource createDataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		System.out.println("creating production base database");
		return ds;
	}

}
