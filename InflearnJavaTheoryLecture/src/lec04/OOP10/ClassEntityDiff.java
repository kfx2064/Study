package lec04.OOP10;

/**
 * 클래스와 일반 메서드 등의 사용에는 차이가 있습니다.
 * 그것을 실습을 통해 다시 한 번 더 알아보겠습니다.
 */
public class ClassEntityDiff {

    int normalValue = 10;
    static int staticValue = 20;

    int normalValue2 = staticValue;
    static staticValue2 = normalValue;
    /**
     * 보시다시피 전역변수에는 static 전역변수를 담을 수 있습니다.
     * 하지만 static 전역변수에는 일반적인 전역변수를 담을 수 없습니다.
     */

    static void callStaticMethod() {
        System.out.println(staticValue);
        System.out.println(normalValue);
        /**
         * static 메서드 내에서도 마찬가지입니다.
         * static 메서드 내에서도 일반적인 전역변수는 호출할 수 없습니다.
         * 오로지 static 변수만 호출이 가능합니다.
         */
    }

    void callNormalMethod() {
        System.out.println(staticValue);
        System.out.println(normalValue);
        /**
         * 일반적인 메서드에서는 잘 동작하는 것을 확인할 수 있습니다.
         * 일반적인 메서드에서는 스태틱 전역변수와 일반 전역변수를 모두 호출 가능합니다.
         * 하지만 하나 알아두시면 좋은 것은 스태틱 전역변수는 모두 값을 공유하면서 사용한다는 점입니다.
         *
         * 이런 특징은 메서드에서도 해당됩니다.
         * 코드로 실습해 보겠습니다.
         */
    }

    static void sampleStaticMethod() {
        System.out.println("스태틱 메서드");
    }
    
    void sampleNormalMethod() {
        System.out.println("일반 메서드");
    }

    void static doStaticMethod() {
        sampleStaticMethod();
        sampleNormalMethod();
        /**
         * 전역변수와 스태틱 전역변수를 쓸 때와 같죠?
         * 스태틱 메서드 내에서는 일반 메서드를 사용할 수 없습니다.
         * 그럼 일반적인 메서드는 어떨까요?
         */
    }

    void doNormalMethod() {
        sampleStaticMethod();
        sampleNormalMethod();
        /**
         * 두 개 다 잘 사용이 가능하지요?
         * 이것으로 스태틱 전역 변수와 스태틱 메서드,
         * 전역 변수와 일반 메서드의 사용법에 대해 학습이 되셨으면 좋겠습니다.
         */
    }

}
