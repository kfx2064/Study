package ch09.part03.main3;

public class ChildClass extends AbstractClass {

    private static String var3 = "static 전역변수";

    static {
        System.out.println("\t 구현클래스 - var3 [" + var3 + "]");
    }

    private String var4 = "전역변수";

    {
        System.out.println("\t 구현클래스 - 생성자함수");
    }

    @Override
    public void method1() {
        System.out.println("\t 구현클래스 - method1() - var4 [" + var4 + "]");
    }
}
