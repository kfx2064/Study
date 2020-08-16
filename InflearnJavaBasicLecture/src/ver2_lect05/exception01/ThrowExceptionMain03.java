package ver2_lect05.exception01;

public class ThrowExceptionMain03 {

    /**
     * 우선 TimeoutException04라는 예외 핸들링 클래스를 만듭니다.
     *
     * TimeoutException04라는 클래스를 보고 오시죠.
     *
     * 아래에 메인 메소드를 만들겠습니다.
     */

    public static void main(String[] args) throws TimeoutException04 {

        /**
         * 메인 메서드에 throw new TimeoutException04를 실행합니다.
         */

        //throw new TimeoutException04("에러를 발생시켰습니다.");

        /**
         * 결과를 확인하셨나요?
         *
         * 콘솔에 어떤 에러인지 확인을 했습니다.
         *
         * 다른 방식으로 볼까요?
         */

        throw new TimeoutException04("이것은 파일 입출력 도중 발생한 에러입니다.");

        /**
         * 보셨나요?
         * 에러 메시지를 변경할 수 있습니다.
         * 이런 방식으로 에러 메시지를 표현할 수 있습니다.
         * 
         * 그리고 규모가 큰 프로젝트를 가면 이런 뒤의 구조들, 공통 부분들을 개발하는 개발자들이 있습니다.
         * 이 분들이 제공하는 메소드를 통해서 
         * 화면에 예외 메시지를 보여주는 식으로 개발이 가능합니다.
         * EX001 이런 식으로 예외 메시지를 저 메시지를 입력하는 공간에 넣어주고
         * 예외를 발생시키면 해당 예외 시에 화면에서 보여지는 예외 메시지까지
         * 자동으로 화면으로 연결되어 표현이 됩니다.
         * 그래서 각 예외 상황의 경우,
         * 특히 화면에서 발생한 예외가 아니라
         * 자바에서 발생한 예외의 경우에는
         * 어떤 예외인지 확인시켜 줄 수 있게 됩니다.
         *
         * 그럼 Throw Exception 첫 번째 예제는 이 정도로 하겠습니다.
         *
         * 이제 다른 예제를 보겠습니다.
         *
         * 감사합니다.
         */

    }

}