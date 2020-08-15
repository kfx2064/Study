package ver2_lec04;

public class InnerClassMainMethod {

    /**
     * 내부 클래스 코딩한 것을 진행해 볼까요?
     */

    public static void main(String[] args) {
        InnerClassMake innerClassMake = new InnerClassMake();
        InnerClassMake.SampleInnerClass sampleInnerClass = innerClassMake.new SampleInnerClass();

        innerClassMake.outMaintMethod1();
        sampleInnerClass.inMethod1();

        /**
         * 이렇게 내부 클래스를 코딩하여 활용해 볼 수 있습니다.
         * 저의 입문 강의 1부에서 보신 것처럼,
         * 입문 강의 2부에서도 해당 클래스들을 활용하는 샘플 코드를 짜볼 생각입니다.
         * 그렇기 때문에 지금은 조급하게 마음 먹지 마시고 천천히 코드들을 따라와 주세요.
         *
         * 내부 클래스는 이렇게 사용한다, 정도로 알아두셨으면 합니다.
         *
         * 감사합니다.
         */
    }

}
