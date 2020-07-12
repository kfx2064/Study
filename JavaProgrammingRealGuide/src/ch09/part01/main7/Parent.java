package ch09.part01.main7;

public class Parent {

    static {
        System.out.println("\tParent 클래스 - 정적(static) 초기화 블록 구간");
    }

    {
        System.out.println("\tParent 클래스 - 초기화 블록 구간");
    }

    public Parent() {
        System.out.println("\tParent 클래스 - 생성자함수 구간[1]");
    }

    public Parent(int a) {
        System.out.println("\tParent 클래스 - 생성자함수 구간[2]");
    }

}
