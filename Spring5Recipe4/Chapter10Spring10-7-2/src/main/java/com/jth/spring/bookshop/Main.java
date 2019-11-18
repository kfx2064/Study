package com.jth.spring.bookshop;

import com.jth.spring.bookshop.config.BookstoreConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(BookstoreConfiguration.class);

        final BookShop bookShop = context.getBean(BookShop.class);

        Thread thread1 = new Thread(() -> {
            try {
                bookShop.increaseStock("0001", 5);
            } catch (RuntimeException e) {

            }
        }, "Thread 1");

        Thread thread2 = new Thread(() -> bookShop.checkStock("0001"), "Thread 2");

        thread1.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

        }
        thread2.start();
    }

}
