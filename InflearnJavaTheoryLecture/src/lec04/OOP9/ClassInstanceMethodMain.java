package lec04.OOP9;

/**
 * 이번 강의에서는 앞서 만든 클래스를 활용하여 실제 실습하도록 하겠습니다.
 */
public class ClassInstanceMethodMain {

    public static void main(String[] args) {

        /**
         * 우선 정적 메서드를 사용해 보겠습니다.
         */

        int stSum = ClassInstanceMethod.staticSum(1, 2);
        int stAv = ClassInstanceMethod.staticAverage(4, 8);
        System.out.println("stSum : " + stSum);
        System.out.println("stAv : " + stAv);

        /**
         * 바로 사용이 가능한 것을 확인할 수 있지요?
         * 그럼 일반 메서드, 인스턴스 메서드라고도 부르기도 하는
         * 메서드를 호출해 볼까요?
         */

        ClassInstanceMethod cim = new ClassInstanceMethod();
        int etSum = cim.entitySum(2, 3);
        int etAv = cim.entityAverage(6, 10);
        System.out.println("etSum : " + etSum);
        System.out.println("etAv : " + etAv);

        /**
         * 일반적인 메서드는 객체를 생성해서 호출해야 하지요?
         * 이런 차이가 존재합니다.
         *
         * static을 붙이면 단점이 존재하게 됩니다.
         * 객체를 생성하여 사용해야 하는 일반적인 전역변수나 메서드를 사용할 수 없게 됩니다.
         * 하지만 클래스 . 방식으로 바로바로 사용한다는 장점도 물론 존재하지요.
         * 그리고 static 메서드는 static 전역 변수를 쓴다는 점이 있습니다.
         * 이것은 static 전역변수는 해당 클래스로 만들어진 것들은 모두 값을 공유한다는 점이 있습니다.
         * 그렇기 때문에 공통적으로 써야 하는 것들은 static을 붙여서 쓴다고
         * 생각하시면 좋습니다.
         *
         * 이에 대한 실습을 이어서 진행해 보겠습니다.
         * 다음 OOP10 패키지와 그에 따른 클래스를 만들어 주세요.
         */

    }

}
