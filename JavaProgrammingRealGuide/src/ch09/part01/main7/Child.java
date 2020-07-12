package ch09.part01.main7;

public class Child extends Parent {

    static {
        System.out.println("\tChild클래스 - 정적(static) 초기화 블록 구간");
    }

    {
        System.out.println("\tChild클래스 - 초기화 블록 구간");
    }

    public Child() {
        System.out.println("\tChild 클래스 - 생성자함수 구간");
    }

    public Child(int a) {
        super(a);
        System.out.println("\tChild클래스 - 생성자 함수 구간");
    }

}
