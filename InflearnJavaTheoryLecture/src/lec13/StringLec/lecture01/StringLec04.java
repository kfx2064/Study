package lec13.StringLec.lecture01;

public class StringLec04 {

    public static void main(String[] args) {

        /**
         * 이번엔 substring을 사용해 보겠습니다.
         * substring은 문자열을 잘라내는 역할을 합니다.
         * 은근히 자주 쓰이는 메서드입니다.
         */
        
        String strSubstring01 = "Hello, world!";

        String returnSubs01 = strSubstring01.substring(7);
        String returnSubs02 = strSubstring01.substring(0, 5);
        System.out.println("returnSubs01 : " + returnSubs01);
        System.out.println("returnSubs02 : " + returnSubs02);

        /**
         * 7은 7부터 자른 것을 확인하실 수 있습니다.
         * 인덱스의 시작은 0부터라고 보시면 됩니다.
         * 그리고 파라미터가 두 개인 것은 ~부터 ~이전까지입니다.
         * 0부터 5 이전까지만 잘라내는 것이지요.
         * 그래서 Hello가 추출됩니다.
         * o는 인덱스 숫자로는 4이고 5는 쉼표이지요.
         * 쉼표는 포함되지 않습니다.
         *
         * 그럼 이번에는 trim을 확인해 보겠습니다.
         */
        
        String strTrim01 = "  Hello, world!  ";
        String trimResult01 = strTrim01.trim();
        System.out.println("trimResult01 : " + trimResult01);

        /**
         * 양쪽 공백이 잘리지요?
         * 다른 걸로 더 확인해 보겠습니다.
         */

        strTrim01 = " Hello, world! ";
        System.out.println("길이 : " + strTrim01.length());
        String trimResult02 = strTrim01.trim();
        System.out.println("길이(trim이후) : " + trimResult02.length());

        /**
         * length로 확인하면 더 확실하지요?
         * 숫자로 길이를 확인하실 수 있습니다.
         * trim도 은근히 자주 쓰이는 메서드인데
         * 이를 통해서 공배를 제거하고 정확한 데이터가 입력되도록 돕는 역할입니다.
         * 하지만 엄격한 시스템일 경우엔 trim까지 오지 않고
         * 이미 프론트에서 자바스크립트 등을 통해서
         * 유효성 검사를 통해 걸러냅니다.
         */

        String lowerCase = "Hello, World!";
        System.out.println("lower 전 : " + lowerCase);
        System.out.println("lower 후 : " + lowerCase.toLowerCase());

        /**
         * 이번엔 lowerCase를 통해 확인하였습니다.
         * 정확한 메서드는 toLowerCase입니다.
         * 이를 통해서 대문자를 소문자로 일괄적으로 바꾸죠.
         *
         * 이것도 종종 쓰입니다.
         * 그 중에서는 조건문에서 toLowerCase를 통해서 값을 변환하여
         * 대소문자 구분없이 비교할 때 쓰곤 합니다.
         * 그것이 아니라면 사용자가 잘못된 값을 입력하더라도
         * 소문자만 입력되도록 할 때도 종종 쓰긴 합니다.
         *
         * 하지만 보통은 이것도 프론트에서 걸러냅니다.
         * 유효성 검사에서 가장 좋은 것은 프론트에서 데이터를 정확하게 걸러내는 것을
         * 주로 추천하는 편입니다.
         * 백에서 데이터를 변환하고 걸러내는 것은
         * 데이터베이스에서 조회한 값을 다듬어서 프론트로 보낼 때 사용하곤 하며
         * 그럴 때 toLowerCase를 활용하는 것이 좋은 편입니다.
         *
         * 하지만 더 좋은 것은 본인의 상사가 지시하는 로직의 순서상에
         * 구현하는 것이 좋습니다.
         *
         * 다음은 lowercase의 반대인 uppercase입니다.
         * 실습해 볼까요?
         */

        String strUpperCase = "hello, world!";
        String resultUpper = strUpperCase.toUpperCase();
        System.out.println("resultUpper : " + resultUpper);

        /**
         * 이렇게 뜨지요?
         * 다 대문자로 변경됩니다.
         * 이것도 lowercase와 유사한 사용 예에서 이용되는데,
         * 차이점은 대문자로 할 것이냐, 소문자로 할 것이냐에서 있습니다.
         *
         * 그럼 String에 대한 컨트롤은 이 정도까지 하겠습니다.
         *
         * 감사합니다.
         */

    }

}
