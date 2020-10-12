package lec04.OOP9;

/**
 * 이번엔 일반적인 메서드와 스태틱 메서드,
 * 즉 정적 메서드의 사용법에 대해 학습하도록 하겠습니다.
 *
 * 그전에 정적 메서드와 메서드를 선언한 클래스를 만들겠습니다.
 */
public class ClassInstanceMethod {

    /**
     * 각각 정적 메서드와 일반 메서드를 만들도록 하겠습니다.
     *
     * 정적 메서드는 특징이 있습니다.
     * 객체 생성 없이 사용이 가능합니다.
     * static 메서드, 즉 정적 메서드는
     * 객체 생성 없이 사용한 것은
     * 클래스 생성 시 바로 메모리에
     * 로딩되는 것도 영향이 있습니다.
     * 클래스 생성 후 바로 사용 가능한
     * 정적 메서드는 클래스 명을 명시하고 .을 찍고
     * 바로 사용이 가능합니다.
     *
     * 실습을 통해 정적 메서드와 일반 메서드의 차이를
     * 자세히 알아보도록 하겠습니다.
     *
     * 그럼 정적 메서드와 일반 메서드를 만들도록 하겠습니다.
     *
     */

    static int staticSum(int paramOne, int paramTwo) {
        return paramOne + paramTwo;
    }

    static int staticAverage(int paramOne, int paramTwo) {
        return (paramOne + paramTwo) / 2;
    }

    int entitySum(int paramOne, int paramTwo) {
        return paramOne + paramTwo;
    }

    int entityAverage(int paramOne, int paramTwo) {
        return (paramOne + paramTwo) / 2;
    }

}
