package lec04.OOP3;

/**
 * 다양한 메서드 접근제한자를 실습해 보겠습니다.
 */
public class VariousAccessLimitMark {


    /**
     * 메서드란
     *
     * 기능, 또는 함수라고도 한다.
     * 메서드는 중복되는 기능을 따로 메서드로 분리하여 작성하여 사용한다.
     * 중복되는 기능을 하나의 메서드로 만들어서 여러 곳에서 해당 메서드의 이름만 호출하면
     * 중복되는 기능을 사용할 수 있도록 만들어 놓을 수 있기 때문이다.
     * 이것은 객체지향적인 요소이기도 하다.
     *
     * 메서드는 4가지 제한자를 가질 수 있다.
     * Private, protected, default, public.
     * 제한자는 제한자 강의에서 자세히 배우도록 하자.
     */

    public void method1() {
        System.out.println("Hello, world.");
    }

    void method2() {
        System.out.println("Good day, commander.");
    }

    protected void method3() {
        System.out.println("Nice to meet you.");
    }

    private void method4() {
        System.out.println("Have a nice day.");
    }

    /**
     * 이렇게 다양한 접근제한자를 붙일 수 있습니다.
     * 이런 다양한 접근제한자를 사용할 수 있다는 것만 확인하고 넘어가겠습니다.
     * 제한자에 대한 자세한 내용은 이후의 강의에서 확인하도록 하겠습니다.
     * 메서드에 이런 다양한 제한자를 붙일 수 있다는 내용만 확인하고 넘어가겠습니다.
     */

}
