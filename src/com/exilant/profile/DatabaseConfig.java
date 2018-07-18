package com.exilant.profile;

import javax.sql.DataSource;

public interface DatabaseConfig {

	
	DataSource createDataSource();

}
