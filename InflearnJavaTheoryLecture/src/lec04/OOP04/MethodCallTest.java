package lec04.OOP04;

public class MethodCallTest {

    public static void main(String[] args) {

        int sumRtn = sumLogic(1, 2);
        System.out.println("sumRtn : " + sumRtn);
        /**
         * 메서드는 이런 식으로 호출하여 사용이 가능하다.
         * 두 개의 파라미터를 넘겨주어서 더한 후 값을 리턴하는 것이다.
         * 파라미터의 개수도 일치해야 하며
         * 순서도 일치해야 한다.
         * 메서드는 메서드 명을 호출하여 사용하는 방식으로 진행한다.
         * 다른 클래스의 메서드도 호출해 보도록 하자.
         */
        AnotherClassUseInMethodCallTest.sayHello();
        /**
         * 위의 호출 방식은 static 메서드 호출 방식이다.
         * static이 붙은 정적 메서드는 클래스명.메서드명으로 호출이 가능하다.
         * 그렇다면 static이 붙지 않은 일반 메서드는 어떨까?
         */
        AnotherClassUseInMethodCallTest acmt = new AnotherClassUseInMethodCallTest();
        acmt.sayRoger();
        /**
         * 객체를 생성하여 호출이 가능하다.
         * 이를 통해 static 붙은 메서드의 호출,
         * 일반 메서드의 호출을 수행하여 봤다.
         */

    }

    public static int sumLogic(int one, int two) {
        int sum = one + two;
        return sum;
    }

}
