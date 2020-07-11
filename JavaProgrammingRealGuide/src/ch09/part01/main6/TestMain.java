package ch09.part01.main6;

public class TestMain {

    public static void main(String[] args) {

        System.out.println("[1] Child 객체 생성");
        Child c1 = new Child();
        System.out.println(c1.field1);
        System.out.println(c1.field2);
        System.out.println(c1.field3);
        c1.method1("1");
        c1.method2("2");
        c1.method3();
        System.out.println();

        System.out.println("[2] Child 객체를 -> Parent 타입으로 형 변환 : 업캐스팅");
        Parent c21 = c1;
        System.out.println(c21.field1);
        System.out.println(c21.field2);
        c21.method1("1");
        c21.method2("2");
        System.out.println();

        System.out.println("[3] Child 객체 -> Parent 타입 객체 -> Child 타입 형변환 : 다운캐스팅");
        Child c22 = (Child) c21;
        System.out.println(c22.field1);
        System.out.println(c22.field2);
        System.out.println(c22.field3);
        c22.method1("1");
        c22.method2("2");
        c22.method3();

    }

}
