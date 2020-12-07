package lec05.generics.third;

import java.util.ArrayList;
import java.util.List;

/**
 * 여기서는 제네릭스 타입 클래스를 활용한 코딩을 할 수 있습니다.
 * 진행해 보도록 하겠습니다.
 */
public class TypeMain02 {

    public static void main(String[] args) {
        /**
         * 메인 메소드를 만들어 주세요.
         *
         * 그 후 객체 생성을 하겠습니다.
         */
        TypeGenerics01<Integer> typeGenerics01 = new TypeGenerics01<>(1);
        System.out.println(typeGenerics01.t);
        TypeGenerics01<String> typeGenerics011 = new TypeGenerics01<>("사과");
        System.out.println(typeGenerics011.t);

        /**
         * 잘 되지요?
         * 분명 같은 클래스인데 다른 타입이 동적으로 셋팅되지요?
         * 처음 배우는 입장에서는 그게 뭐가 신기하지? 싶을 수 있습니다.
         *
         * 아래에 다른 예시를 들어보겠습니다.
         */

        List<String> aList = new ArrayList<>();
        aList.add("사과");
        aList.add("포도");
        //aList.add(1);

        /**
         * String으로 제네릭스를 셋팅한 List에 숫자 1을 넣으려고 하면 에러가 납니다.
         * 이렇게 제네릭스는 타입을 강제해 주는 역할을 합니다.
         * 문자열을 넣을 때는 아무런 에러가 나지 않지요?
         * 그럼 다른 것도 실습해 볼까요?
         */

        List<Integer> bList = new ArrayList<>();
        bList.add(1);
        bList.add(2);
        //bList.add("사과");

        /**
         * 여기서는 문자열을 넣으려고 하면 에러가 납니다.
         * 숫자는 잘 들어가지요.
         * 이런 것을 실습해 볼 수 있습니다.
         *
         * 그럼 다음 강의에서는 다른 것을 실습해 보겠습니다.
         */

    }

}
