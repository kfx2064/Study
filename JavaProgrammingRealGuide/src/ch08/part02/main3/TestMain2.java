package ch08.part02.main3;

public class TestMain2 {

    public static void method(TypeA a) {
        a.setCount(a.getCount() + 1);
    }

    public static void main(String[] args) {

        TypeA a = new TypeA();
        a.setCount(1);
        System.out.println(a.getCount());

        method(a);

        System.out.println(a.getCount());

    }

}
