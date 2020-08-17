package ver2_lect05.generics02.exe01;

public class ExeB {

    /**
     * 제네릭 타입을 활용한 함수 정의 첫 번째입니다.
     * 이것들을 정의하고 실제 활용하는 곳에서
     * 주의깊게 살펴보겠습니다.
     */
    public <T> T method1(T t) {
        return t;
    }

    /**
     * 제네릭 타입을 이용한 static 함수 정의 두 번째입니다.
     * 이것 역시 메인 메소드에서 활용하면서 잘 살펴보도록 하겠습니다.
     * 아래에 이어지는 것들도 메인 메소드에서 활용할 때 주의깊게 살펴 주시길 바랍니다.
     */
    public static <T> T method2(T t) {
        return t;
    }

    public <T> T method3(ExeA<T> exeA) {
        return exeA.getT();
    }

    public static <T> T method4(ExeA<T> exeA) {
        return exeA.getT();
    }

}
