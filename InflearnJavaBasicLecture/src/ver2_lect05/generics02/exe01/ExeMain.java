package ver2_lect05.generics02.exe01;

public class ExeMain {

    public static void main(String[] args) {

        /**
         * ExeB 객체 생성
         * method1(), method2() 함수 사용.
         */
        ExeB b = new ExeB();
        String method1 = b.method1("테스트1");
        String method2 = ExeB.method2("테스트2");
        System.out.println("method1 : " + method1);
        System.out.println("method2 : " + method2);

        /**
         * 위의 ExeB의 두 가지 메소드는 T의 형태로 선언되었습니다.
         * 파라미터, 리턴 타입 모두 T로 선언되어 있죠.
         * 그렇기 때문에 String이 들어와도 자연스럽게 메소드가 성립됩니다.
         *
         * 이제 계속 진행해 볼까요?
         */

        ExeA<String> exeA1 = new ExeA<String>("1");
        String t1 = exeA1.getT();
        String method3 = b.method3(exeA1);
        String method4 = ExeB.method4(exeA1);

        /**
         * 위에서는 객체 생성 시 String이라는 타입을 지정해 줍니다.
         * String이라는 타입을 지정해 주기 때문에
         * 해당 메소드를 사용해서 파라미터를 넣어주고
         * 어떤 동작을 수행할 때 리턴 값이 문자열로 나옵니다.
         */

        System.out.println("t1 : " + t1);
        System.out.println("method3 : " + method3);
        System.out.println("method4 : " + method4);

        /**
         * 해당 값들을 찍어 보았습니다.
         */

        ExeA exeA2 = new ExeA("2");
        Object t2 = exeA2.getT();
        Object method6 = b.method3(exeA2);
        Object method5 = ExeB.method4(exeA2);

        System.out.println("t2 : " + t2);
        System.out.println("method6 : " + method6);
        System.out.println("method5 : " + method5);

        /**
         * 위에서는 Object의 값으로 리턴을 해 줍니다.
         * Object의 값으로 리턴하는 것은 특정 제네릭을 지정해 주지 않았기 때문입니다.
         *
         * 이런 식으로 제네릭을 사용하실 수 있습니다.
         * 제네릭을 사용함으로써 타입을 지정해 주고 해당 타입으로 값들을 변경해 줄 수 있습니다.
         * 애초에 String으로 지정해 주는 방법도 있습니다.
         * 하지만 그것이 아니라 T의 형태로 지정함으로써
         * 여러가지 타입을 활용하는 방안도 가능합니다.
         */

        ExeA<Integer> exeAInt = new ExeA<Integer>(100);
        Integer getIntT = exeAInt.getT();
        System.out.println("getIntT : " + getIntT);
        Integer intExeAInt1 = b.method3(exeAInt);
        Integer intExeAInt2 = ExeB.method4(exeAInt);

        System.out.println("intExeAInt1 : " + intExeAInt1);
        System.out.println("intExeAInt2 : " + intExeAInt2);

        /**
         * 위의 경우는 Integer를 활용하여 봤습니다.
         * Integer를 활용한 이유는 String이 아니라 다른 타입도
         * 가능한지 예시를 보여 드리기 위함입니다.
         * 보통 제네릭은 타입을 지정하는 용도입니다.
         * T를 사용하게 되면 타입을 무조건 지정하지 않습니다.
         * 어떤 타입이든 받아들일 수 있다는 뜻이죠.
         *
         * 이런 식으로 제네릭을 활용하면 됩니다.
         * 제네릭에 대한 강의는 이 정도로 해두겠습니다.
         *
         * 나중에 컬렉션 프레임워크를 만들면서 제네릭에 대해 더욱 잘 설명해 드리겠습니다.
         */

    }

}
