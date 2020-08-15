package ver2_lec03;

/**
 * 추상클래스
 */
public abstract class AbstractClass_01_01 {

    /**
     * 구체적인 기능이 정의되지 않은 추상 메소드를 만들겠습니다.
     * 구체적은 기능이 정의되지 않은 추상 메소드는
     * 인터페이스에서의 메소드처럼
     * 기능 목록을 제공해 주고 사용하라고 강제하는 역할을 수행합니다.
     */
    public abstract void methodFirst();

    /**
     * 이 메소드는 기본적인 기능을 가지고 있습니다.
     * 추상 클래스의 어떤 메소드인지 설명을 제공하고
     * 그 아래에서 추상적인 메소드를 불러오는 기능을 제공합니다.
     *
     * 보통 추상 클래스는 복잡한 기능을 제공하지 않습니다.
     * 추상 클래스에서는 간단한 로직,
     * 아니면 추상 클래스를 상속받을 클래스들에서
     * 사용할 공통된 로직을 구현합니다.
     * 그리고 해당 클래스를 상속받은 클래스에서
     * 실질적으로 필요한 기능들을 구현합니다.
     * 이제 공통된 기능을 가진 메소드를 구현해 보겠습니다.
     */
    public void methodSecond() {
        System.out.println("추상 클래스 methodSecond");
        methodFirst();
    }

    public int methodThird() {
        return 10 + 2;
    }

}
