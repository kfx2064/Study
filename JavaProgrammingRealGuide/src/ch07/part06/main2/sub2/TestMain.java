package ch07.part06.main2.sub2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestMain {

    public static void main(String[] args) throws Exception {

        Class clazz = Class.forName("ch07.part06.main2.sub2.ProductVo");

        Constructor constructor = clazz.getDeclaredConstructor(String.class, int.class);

        Object obj = constructor.newInstance("테스트2", 2);
        System.out.println("객체정보 ::: " + obj);

        Field field = clazz.getDeclaredField("productName");

        boolean isAccessible = field.isAccessible();

        field.setAccessible(true);

        Object nameFieldValue = field.get(obj);
        System.out.println("productName 속성의 값 ::: " + nameFieldValue);

        field.set(obj, "테스트3");
        System.out.println("productName 속성의 값 ::: " + field.get(obj));

        field.setAccessible(isAccessible);

        Method method = clazz.getDeclaredMethod("getPrice");
        Object returnVal1 = method.invoke(obj);
        System.out.println("getPrice() 함수 호출 결과 ::: " + returnVal1);

    }

}
