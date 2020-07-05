package ch07.part06.main4.sub2;

import java.lang.reflect.Constructor;

public class TestMain {

    public static void main(String[] args) {

        Class clazz = TypeA.class;

        try {
            Object obj1 = clazz.newInstance();
            TypeA test1 = (TypeA) obj1;
            System.out.println("class 객체를 이용한 객체 생성 : " + test1);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        try {
            Constructor constructor = clazz.getConstructor(String.class, int.class);
            Object obj2 = constructor.newInstance("테스트", 1);
            TypeA test2 = (TypeA) obj2;
            System.out.println("Constructor 객체를 이용한 객체생성 : " + test2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
