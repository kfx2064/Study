package ch07.part06.main5.sub1;

import java.lang.reflect.Field;

public class TestMain {

    public static void main(String[] args) {
        Class clazz = TypeA.class;

        System.out.println("----전체속성정보----");
        Field[] fields = clazz.getDeclaredFields();
        for (Field f : fields) {
            System.out.println(f.getName() + "\t" + f.isAccessible() + "\t" + f);
        }
        System.out.println();

        System.out.println("----public 전체속성정보----");
        Field[] fields2 = clazz.getFields();
        for (Field f : fields2) {
            System.out.println(f.getName() + "\t" + f.isEnumConstant() + "\t" + f);
        }
        System.out.println();

        System.out.println("----value 속성정보----");
        try {
            Field f = clazz.getDeclaredField("value");
            System.out.println(f.getName() + "\t" + f.isAccessible() + "\t" + f);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
