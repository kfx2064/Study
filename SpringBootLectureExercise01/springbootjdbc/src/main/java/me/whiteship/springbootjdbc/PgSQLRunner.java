package me.whiteship.springbootjdbc;

import java.sql.Connection;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class PgSQLRunner implements ApplicationRunner {
	
	@Autowired
	DataSource dataSource;
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		try (Connection connection = dataSource.getConnection()) {
			
			System.out.println(dataSource.getClass());
			
			System.out.println(connection.getMetaData().getDriverName());
			System.out.println(connection.getMetaData().getURL());
			System.out.println(connection.getMetaData().getUserName());
			
			Statement statement = connection.createStatement();
			String sql = "CREATE TABLE springboot.ACCOUNT(ID INTEGER NOT NULL, name VARCHAR(255), PRIMARY KEY (id))";
			int result = statement.executeUpdate(sql);
			System.out.println("result : " + result);
			
			//connection.close();
		}
		
		jdbcTemplate.execute("INSERT INTO springboot.ACCOUNT VALUES (2, 'whiteship')");
	}

}
