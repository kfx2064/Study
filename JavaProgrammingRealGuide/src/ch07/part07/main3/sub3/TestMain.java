package ch07.part07.main3.sub3;

import java.lang.reflect.Field;

public class TestMain {

    public static void main(String[] args) throws Exception {

        Class<ProductVo> clazz = ProductVo.class;

        Field field1 = clazz.getDeclaredField("productNo");
        Anno1 anno1 = field1.getAnnotation(Anno1.class);
        int value = anno1.value();
        String name = anno1.name();
        DataType dataType = anno1.dataType();
        Child child = anno1.child();
        int childValue = child.value();

        System.out.println("---일반타입---");
        System.out.println("value = " + value);
        System.out.println("name = " + name);
        System.out.println("dataType = " + dataType);
        System.out.println("child = " + child);
        System.out.println("\t childValue = " + childValue);

    }

}
