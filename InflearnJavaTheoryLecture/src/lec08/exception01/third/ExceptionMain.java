package lec08.exception01.third;

/**
 * 다른 것을 실습해 볼까요?
 */
public class ExceptionMain {

    /**
     * 메서드에 쓰로우즈를 붙여서 예외를 던집니다.
     * showMsg 메서드를 사용하는 곳에서 예외 처리를 해줄 수 있도록
     * 넘겨주는 역할을 합니다.
     * 붙이지 않더라도 try-catch 문을 쓰면 예외 처리를 해줄 수 있지만,
     * 더 정밀한 프로그래밍을 위해서 throws 처리를 해주는 것이 좋습니다.
     *
     * 실무에서도 웹 프로그래밍을 할 때 비즈니스 로직을 처리하는 부분에서 throws를 많이 활용합니다.
     */
    public void showMsg() throws Exception {
        System.out.println("안녕하세요.");
        int divide = 10 / 0;
    }

    public static void main(String[] args) {

        try {

            ExceptionMain exceptionMain = new ExceptionMain();
            exceptionMain.showMsg();

        } catch (Exception e) {
            System.out.println("예외가 발생하였습니다.");
            e.getMessage();
            e.printStackTrace();
        }

    }

}
