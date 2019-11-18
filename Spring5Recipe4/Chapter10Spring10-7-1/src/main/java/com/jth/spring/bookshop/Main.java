package com.jth.spring.bookshop;

import com.jth.spring.bookshop.config.BookstoreConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(BookstoreConfiguration.class);

        Cashier cashier = context.getBean(Cashier.class);
        List<String> isbnList = Arrays.asList("0001", "0002");
        cashier.checkout(isbnList, "user1");
    }

}
