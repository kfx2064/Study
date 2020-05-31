package com.jth.spring.bookshop.config;

import com.jth.spring.bookshop.BookShop;
import com.jth.spring.bookshop.JdbcBookShop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class BookstoreConfiguration {

    @Bean
    public DriverManagerDataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(org.postgresql.Driver.class.getName());
        dataSource.setUrl("jdbc:postgresql://localhost:5432/bookstore");
        dataSource.setUsername("postgres");
        dataSource.setPassword("1234");
        return dataSource;
    }

    @Bean
    public BookShop bookShop(DataSource dataSource) {
        JdbcBookShop bookShop = new JdbcBookShop();
        bookShop.setDataSource(dataSource);
        return bookShop;
    }

}
