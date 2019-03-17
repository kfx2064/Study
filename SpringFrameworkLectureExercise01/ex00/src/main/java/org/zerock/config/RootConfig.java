package org.zerock.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = {"org.zerock.sample"})
@MapperScan(basePackages = {"org.zerock.mapper"})
public class RootConfig {
	
	@Bean
	public DataSource dataSource() {
		
		HikariConfig hikariConfig = new HikariConfig();
		hikariConfig.setDriverClassName("net.sf.log4jdbc.sql.jdbcapi.DriverSpy");
		hikariConfig.setJdbcUrl("jdbc:log4jdbc:postgresql://127.0.0.1:5432/book_ex");
		hikariConfig.setUsername("postgres");
		hikariConfig.setPassword("1234");

		HikariDataSource dataSource = new HikariDataSource(hikariConfig);
		
		//Properties props = new Properties();
		
		// props.setProperty("dataSourceClassName", "org.postgresql.ds.PGSimpleDataSource");
		/*
		 * props.setProperty("dataSourceClassName",
		 * "net.sf.log4jdbc.sql.jdbcapi.DriverSpy"); props.setProperty("dataSource.url",
		 * "jdbc:log4jdbc:postgresql://127.0.0.1:5432/book_ex");
		 * props.setProperty("dataSource.user", "postgres");
		 * props.setProperty("dataSource.password", "1234");
		 * props.setProperty("dataSource.databaseName", "book_ex");
		 * 
		 * HikariConfig config = new HikariConfig(props); DataSource ds = new
		 * HikariDataSource(config);
		 */
		
		return dataSource;
	}
	
	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		
		SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
		sqlSessionFactory.setDataSource(dataSource());
		
		return (SqlSessionFactory) sqlSessionFactory.getObject();
	}

}
