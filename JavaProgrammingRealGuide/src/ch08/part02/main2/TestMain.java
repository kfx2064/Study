package ch08.part02.main2;

public class TestMain {

    public static void main(String[] args) {

        int a = 3;
        int b = a;

        int c = method(a);
        System.out.println("동일변수 비교 = " + (a == b));

        TypeA typeA1 = new TypeA();
        TypeA typeA2 = typeA1;

        System.out.println("동일변수 비교 = " + (typeA1 == typeA2));

        TypeA typeA3 = method(typeA1);
        System.out.println("동일변수 비교 = " + (typeA1 == typeA2));
    }

    public static class TypeA {

    }

    public static int method(int a) {
        a = a + 1;
        return a;
    }

    public static TypeA method(TypeA typeA) {
        typeA = new TypeA();
        return typeA;
    }

}
