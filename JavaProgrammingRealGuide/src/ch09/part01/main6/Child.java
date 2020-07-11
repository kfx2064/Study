package ch09.part01.main6;

public class Child extends Parent {

    public String field2 = "field2-Child";
    public String field3 = "field3-Child";

    public void method1(String msg) {
        System.out.println(msg + "\t자식함수 method1()");
    }

    public void method3() {
        System.out.println(super.field1);
        System.out.println(super.field2);
        super.method1("method1");
        super.method2("method2");
    }
}
