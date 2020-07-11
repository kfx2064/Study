package ch09.part01.main5;

public class Child extends Parent {

    public void method1(String msg) {
        System.out.println(msg + "\t재정의 된 자식함수 method1()");
    }

    public void method4(String msg) {
        System.out.println(msg + "\t자식함수 method4() 호출 시작 ----");

        method1(msg + "-1");;
        super.method1(msg + "-2");
        super.method2(msg + "-3");
        super.method3(msg + "-4");
        System.out.println(msg + "\t자식함수 method4() 호출 종료---");
    }

}
