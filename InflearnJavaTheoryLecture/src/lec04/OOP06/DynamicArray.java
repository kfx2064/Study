package lec04.OOP06;

import java.util.Arrays;

public class DynamicArray {

    /**
     * 함수는 동적 처리도 가능하다.
     * 콤마를 활용하여 파라미터를 열거하거나 배열을 파라미터로 사용할 수 있다.
     * 동적 파라미터의 경우에는 메서드의 파라미터들 중 가장 마지막에 위치해야만 한다.
     * 그것이 규칙이다.
     * 또한 동적 파라미터는 두 개 이상 사용할 수 없다.
     * 동적 파라미터를 사용하려면 한 개만 사용하도록 하자.
     *
     * 제네릭스를 활용하여 함수의 타입을 동적으로 반환할 수 있다.
     *
     * 동적 파라미터를 활용하는 방법을 진행한다.
     * @param msgParameter
     */

    public void dynamicMethod(String... msgParameter) {
        String[] strArray = msgParameter;
        System.out.println(Arrays.toString(strArray));
    }
    
}
