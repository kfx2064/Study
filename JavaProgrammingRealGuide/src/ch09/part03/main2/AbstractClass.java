package ch09.part03.main2;

public abstract class AbstractClass {

    public abstract void method1();

    public void method2() {
        System.out.println("AbstractClass 클래스 method2() 로직");
        method1();
    }

    public AbstractClass() {
        System.out.println("AbstractClass 생성자함수");
    }

}
