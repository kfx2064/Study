package ver2_lect05.exception01;

public class TimeoutException04 extends Exception {

    /**
     * TimeoutException04라는 예외 제어 클래스입니다.
     *
     * 해당 클래스는 모든 예외 클래스를 상속받습니다.
     * 그러므로 throw를 통해 예외를 던질 때 Exception 클래스와
     * Exception 클래스를 부모로 하는 모든 예외를 받을 수 있습니다.
     *
     * 아래에는 생성자를 통해 메시지를 받습니다.
     * Exception은 message를 super 생성자를 통해 던져 줄 수 있습니다.
     *
     * 예외는 발생되면 이곳으로 들어와서 생성자의 메서드를 실행하고 메시지를 출력할 수 있습니다.
     *
     * 예외를 발생시키기 위해 ThrowExceptionMain03으로 이동하겠습니다.
     */

    public TimeoutException04(String message) {
        super(message);
    }

}
