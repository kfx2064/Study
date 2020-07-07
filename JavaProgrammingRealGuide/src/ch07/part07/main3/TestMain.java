package ch07.part07.main3;

import com.sun.security.jgss.GSSUtil;

import java.lang.reflect.Field;

public class TestMain {

    public static void main(String[] args) {

        try {
            Class clazz = ProductVo.class;
            Field field = clazz.getDeclaredField("productNo");

            Grid anno = field.getAnnotation(Grid.class);

            String name = anno.name();
            int width = anno.width();
            int order = anno.order();
            System.out.println("name 속성값 = " + name);
            System.out.println("width 속성값 = " + width);
            System.out.println("order 속성값 = " + order);
        } catch (NoSuchFieldException ne) {
            ne.printStackTrace();
        } catch (SecurityException se) {
            se.printStackTrace();
        }

    }

}
