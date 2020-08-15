package ver2_lec02;

/**
 * 인터페이스를 구현한 클래스
 */
public class ProgramInterfaceImpl_01_02 implements ProgramInterface_01_01 {

    /**
     * 아래의 내용들은 인터페이스에 정의된 기능 목록들을 구현한 것입니다.
     * 실제 작성 내용이 없는 것들을 작성합니다.
     */

    @Override
    public void start() {
        System.out.println("프로그램을 시작합니다.");
    }

    @Override
    public void stop() {
        System.out.println("프로그램을 멈춥니다.");
    }

    @Override
    public void run() {
        System.out.println("프로그램을 실행합니다.");
    }

    @Override
    public void shutdown() {
        System.out.println("프로그램 실행을 멈춥니다.");
    }

    /**
     * 모든 기능들을 구현하였습니다.
     * 이에 대해서 메인 메소드에서 기능들을 실제로 동작시켜 보겠습니다.
     */

}
