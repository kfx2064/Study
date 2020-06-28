package ch03.part08.main3;

public class TestMain {

    private String name1 = "name1";

    private static String name2 = "name2";

    public static void method1() {
        System.out.println(name2);
    }

    public void method2() {
        System.out.println(name1);
    }

    public static void main(String[] args) {
        TestMain.method1();
        method1();
    }

}
