package com.Main.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@Configuration
public class SpringConfig {
	@Bean
	 public DriverManagerDataSource dataSource() {
        DriverManagerDataSource data = new DriverManagerDataSource();
        data.setDriverClassName("com.mysql.cj.jdbc.Driver");
        data.setUrl("jdbc:mysql://localhost:3306/springproject?useSSL=false&serverTimezone=UTC");
        data.setUsername("root");
        data.setPassword("sanket123");
        return data;
    }
	@Bean
	public JdbcTemplate myJDBCTemplate() {
		
		JdbcTemplate tem= new JdbcTemplate();
		tem.setDataSource(dataSource());
		return tem;
		
		
	}

}
