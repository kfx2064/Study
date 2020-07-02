package ch07.part05.main1;

public class TypeB {

    public <T> T method1(T t) {
        return t;
    }
    
    public static <T> T method2(T t) {
        return t;
    }

    public <T> T method3(TypeA<T> a) {
        return a.getT();
    }

    public static <T> T method4(TypeA<T> a) {
        return a.getT();
    }

}
