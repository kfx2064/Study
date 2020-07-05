package ch07.part06.main4.sub1;

import java.lang.reflect.Constructor;

public class TestMain {

    public static void main(String[] args) {

        Class clazz = TypeA.class;

        Constructor[] constructors = clazz.getDeclaredConstructors();
        for (Constructor c : constructors) {
            System.out.println("생성자함수 목록 - " + c);
        }

        try {
            Constructor constructor2 = clazz.getDeclaredConstructor();
            System.out.println(constructor2);

            Constructor constructor3 = clazz.getDeclaredConstructor(String.class, Integer.TYPE);
            System.out.println(constructor3);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
