package com.jth.spring.bookshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

@Configurable
public class Book {

    private String isbn;
    private String name;
    private int price;
    private JdbcTemplate jdbcTemplate;

    public Book() {

    }

    public Book(String isbn, String name, int price) {
        this.isbn = isbn;
        this.name = name;
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Transactional
    public void purchase(String username) {
        jdbcTemplate.update("UPDATE BOOK_STOCK SET STOCK = STOCK - 1 " + "WHERE ISBN = ?", isbn);
        jdbcTemplate.update("UPDATE ACCOUNT SET BALANCE = BALANCE - ? " + "WHERE USERNAME = ?", price, username);
    }
}
