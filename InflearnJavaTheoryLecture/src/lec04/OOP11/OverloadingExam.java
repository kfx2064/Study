package lec04.OOP11;

/**
 * 오버로딩에 대해 설명 드리겠습니다.
 */
public class OverloadingExam {

    /**
     * 오버로딩은 같은 메소드 이름에 여러 개의 형태로 선언할 수 있는 것입니다.
     * 반환 타입은 별 영향을 주지 않습니다.
     * 파라미터 타입이 영향을 줍니다.
     * 같은 calculate로 여러 개를 선언하여 해보겠습니다.
     */

    public int calculate() {
        return 1 + 2;
    }

    public int calculate(int one, int two) {
        return one + two;
    }

    public long calculate(long one, long two) {
        return one + two;
    }

    public long calculate(int one, long two) {
        return one + two;
    }

    public long calculate(long one, int two) {
        return one + two;
    }

    /**
     * 같은 이름의 메소드인데도 잘 코딩이 되지요?
     * 원래는 클래스처럼 같은 이름의 메소드는 중복되서 선언할 수 없습니다.
     * 하지만 그걸 가능하게 해주는 것이 오버로딩입니다.
     *
     * 오버로딩, 영어로는 overloading이라고 하죠.
     * 과적한다는 의미이기도 합니다.
     *
     * 여러 개를 새롭게 싣는다는 의미도 되겠죠.
     *
     * 오버로딩을 통해 같은 메소드의 이름이지만 매개변수의 타입은 각각 다른 것을 받아서
     * 로직을 처리할 수 있는 메소드를 만들 수 있습니다.
     */

}
