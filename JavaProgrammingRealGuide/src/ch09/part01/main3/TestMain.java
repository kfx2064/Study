package ch09.part01.main3;

import java.io.FileDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestMain {

    public static void main(String[] args) {

        Class clz = TestMain.class;

        Class superClass = clz.getSuperclass();
        System.out.println("부모클래스 = " + superClass);

        Field[] fields = superClass.getDeclaredFields();
        for (Field f : fields) {
            System.out.println("전역변수 = " + f.getName());
        }

        Method[] methods = superClass.getDeclaredMethods();
        for (Method m : methods) {
            String name = m.getName();
            String parameterTypes = Arrays.toString(m.getParameterTypes());
            System.out.println("함수 = " + name + " : " + parameterTypes);
        }

    }

}
