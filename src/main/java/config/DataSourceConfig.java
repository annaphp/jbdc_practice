package config;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {
	
	@Bean // javaconfig: bean name is 'dataSource', from method name
	public BasicDataSource dataSource() {  
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/test");
		ds.setUsername("root");
	    ds.setPassword("root");	 
	    ds.setInitialSize(5);
	    ds.setMaxActive(20);
		return ds;  
	}

}
