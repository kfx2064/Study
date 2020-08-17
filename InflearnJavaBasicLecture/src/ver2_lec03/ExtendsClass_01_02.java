package ver2_lec03;

/**
 * 상속받은 자식 클래스
 */
public class ExtendsClass_01_02 extends AbstractClass_01_01 {

    /**
     * 구체화되지 않은 추상 메소드를 구현합니다.
     *
     * 해당 추상 메소드는 구체화된 부분을 가지고
     * 있지 않기 때문에 무조건 구현해 줘야 합니다.
     * 추상 클래스에서 몸통을 가지지 않은 추상 메소드는
     * 인터페이스와 같이
     * 기능 목록을 강제해 주는 역할을 수행합니다.
     */
    @Override
    public void methodFirst() {
        System.out.println("상속받은 클래스의 오버라이드된 methodFirst.");
    }

    /**
     * 아래의 메소드는 추상 클래스의 공통된 기능을 사용하면서도
     * 좀 더 추가된 기능을 사용하는 메소드입니다.
     * 이를 통해서 추상 클래스의 공통된 기능을 사용하고,
     * 그것을 상속받은 클래스에서 구체화된 로직을 구현해 냅니다.
     * 이것을 실습해 보겠습니다.
     */
    @Override
    public void methodSecond() {
        System.out.println("상속받은 클래스에서 약간의 로직이 더 들어갑니다.");
        super.methodSecond();
    }

    /**
     * 공통 기능을 활용한 다른 코딩도 해볼까요?
     * 따라서 해보세요.
     * @return
     */

    @Override
    public int methodThird() {
        int getData = super.methodThird();
        int addMoreValue = 12;
        return getData + addMoreValue;
    }

    /**
     * 이렇게 구현된 클래스를 가지고 메인 메소드에서
     * 해당 기능들을 실습하면서 프로그램을 학습해 보겠습니다.
     */

}
