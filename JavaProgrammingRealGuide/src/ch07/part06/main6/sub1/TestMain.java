package ch07.part06.main6.sub1;

import ch07.part06.main5.sub1.TypeA;
import ch07.part06.main6.Sub1TypeA;

import java.lang.reflect.Method;

public class TestMain {

    public static void main(String[] args) {

        Class clazz = Sub1TypeA.class;

        TypeA typeA = new TypeA();

        try {
            System.out.println("\r\n 개별 함수정보 getName() ----");
            Method method2 = clazz.getDeclaredMethod("getName");
            System.out.println(method2);

            System.out.println("\r\n 개별 함수정보 setName() ----");
            Method method3 = clazz.getDeclaredMethod("setName", String.class);
            System.out.println(method3);

            System.out.println("\r\n int.class 타입의 처리 - 개별 함수정보 setValue() ----");
            Method method4 = clazz.getDeclaredMethod("setValue", int.class);
            System.out.println(method4);

            System.out.println("\r\n Integer.TYPE 타입의 처리 - 개별 함수정보 setValue() ----");
            Method method5 = clazz.getDeclaredMethod("setValue", Integer.TYPE);
            System.out.println("함수정보 5 ::: " + method5);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
