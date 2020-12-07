package lec05.generics.second;

import lec05.generics.first.Alpha02;

/**
 * 메소드에 지정할 수 있는 여러 타입 파라미터를 실행해 보겠습니다.
 */
public class MethodTypeT02 {

    /**
     * 리턴 타입도 T이고 매개변수, 즉 파라미터로 받는 것도 타입 T인 메서드를 선언하겠습니다.
     * @param t
     * @param <T>
     * @return
     */
    public <T> T aMethod(T t) {
        return null;
    }

    /**
     * 리턴 타입이 T이고 파라미터는 이전에 실습해 본 T 형태의 타입을 받는 클래스를 사용하는 메서드를 만들겠습니다.
     * @param a
     * @param <T>
     * @return
     */
    public <T> T bMethod(Alpha02<T> a) {
        return null;
    }

    /**
     * 이런 식으로 타입 T를 활용하여 메서드를 선언할 수 있습니다.
     * 이와 똑같은 메서드를 static 타입으로도 선언이 가능합니다.
     */
    public static <T> T cMethod(T t) {
        return null;
    }

    public static <T> T dMethod(Alpha02<T> alpha02) {
        return null;
    }

    /**
     * 이런 식으로 선언이 가능하다는 것을 알 수 있습니다.
     * 그러면 이번에는 실제 활용하는 코드를 실습해 보도록 하겠습니다.
     */

}
