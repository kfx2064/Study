package lec04.OOP3;

/**
 * 다양한 메서드 접근제한자를 실습해 보겠습니다.
 */
public class VariousAccessLimitMark {

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
