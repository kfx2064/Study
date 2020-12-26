package lec07.collectionstack05;

import java.util.Stack;

/**
 * stack을 실습하겠습니다.
 */
public class StackMain {

    public static void main(String[] args) {

        /**
         * 스택을 만듭니다.
         */

        Stack<Integer> stack = new Stack<>();
        Integer push = stack.push(1);
        System.out.println("push return 값 : " + push);
        Integer push1 = stack.push(2);
        System.out.println("push1 return 값 : " + push1);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        /**
         * 만들어진 스택 데이터를 확인합니다.
         */
        System.out.println(stack);

        /**
         * 스택을 하나 뽑아볼까요?
         */
        Integer pop = stack.pop();
        System.out.println("pop 값 : " + pop);
        System.out.println(stack);

        /**
         * 스택에서 뽑혀진 값이 삭제된 것을 확인할 수 있습니다.
         *
         * peek을 해볼까요?
         */

        Integer peek = stack.peek();
        System.out.println("stack : " + stack);
        System.out.println("peek : " + peek);

        /**
         * peek은 마지막 값이 무엇인지 알려주지만 값을 제거하진 않습니다.
         * pop과 peek의 차이입니다.
         * 순차적으로 Last In First Out을 지켜가며 값을 추출할 때는
         * pop을 사용하세요.
         *
         * 그럼 스택 강의는 여기서 마치겠습니다.
         */

    }

}
