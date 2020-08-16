package ver2_lect05.exception01;

public class GetArithmeticException05 extends ArithmeticException {

    /**
     * 이번엔 숫자 계산 예외입니다.
     * ArithmeticException은 숫자 계산에 주로 사용되는 예외입니다.
     * 대표적으로 0으로 나눈다는지의 경우의 수입니다.
     *
     * 앞서와 같이 생성자로 에러 메시지를 표현하겠습니다.
     *
     * 이제 메인 메소드를 만드는 부분으로 갈까요?
     */

    public GetArithmeticException05(String message) {
        super("메시지 ::: " + message);
    }

}
