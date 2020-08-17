package ver2_lect05.exception01;

public class ThrowArithmeticExceptionMain06 {

    public static void main(String[] args) throws GetArithmeticException05 {

        /**
         * 메인 메서드도 아까와 같습니다.
         * 메서드에 throw GetArithmeticException05를 붙여줌으로써
         * 예외가 발생하였을 때 해당 클래스로 던져주라는 표시를 해줍니다.
         * 그리고 그것을 통해 발생한 예외를 거기서 처리해 줍니다.
         *
         * 메시지를 생성자에 입력하는 방식으로 사용함으로써
         * 어떤 에러가 발생했는지 컨트롤이 가능해 집니다.
         *
         * 그럼 throws에 대한 설명은 여기까지 하겠습니다.
         *
         * 감사합니다.
         */

        throw new GetArithmeticException05("숫자 계산에서 예외가 발생하였습니다.");

    }

}
