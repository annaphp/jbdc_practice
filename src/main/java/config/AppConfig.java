package config;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import repo.QuoteRepository;


@Configuration
@Import(DataSourceConfig.class)
public class AppConfig {
	
	
	
	@Bean
	public QuoteRepository qrepository(BasicDataSource dataSource){
		QuoteRepository qr = new QuoteRepository(dataSource); //DI through constructor
		return qr;
	}
	
}
