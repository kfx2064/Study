package lec01.variables03.fifth;

public class StringExample01 {

    public static void main(String[] args) {
        /**
         * 스트링으로 몇 가지 샘플을 만들어 보겠습니다.
         */
        String companyName = "한국";
        System.out.println("companyName : " + companyName);
        /**
         * 한국이라는 한글이 출력됩니다.
         * 다른 것도 해볼까요?
         */

        String cctCompanyName = companyName + "전력";
        System.out.println("cctCompanyName : " + cctCompanyName);

        /**
         * 한국전력이라는 문자열이 출력되지요?
         * 저렇게 붙여서 쓸 수도 있습니다.
         *
         * 다른 것도 실습해 보겠습니다.
         */

        String country1 = "한국";
        String country2 = "한국";
        boolean boolean1 = country1 == country2;
        System.out.println("boolean1 : " + boolean1);

        /**
         * 같다는 결과가 나오죠?
         * 앞서 이론 설명에서의 내용을 상기하시면 좋을 것 같습니다.
         */

        String strCountry1 = new String("한국");
        String strCountry2 = new String("한국");
        boolean boolean2 = strCountry1 == strCountry2;
        System.out.println("boolean2 : " + boolean2);

        /**
         * false가 뜨네요.
         * 이유는 new 연산자를 통해 객체를 생성했기 때문입니다.
         * 다른 식으로 비교하면 됩니다.
         * 따라와 주세요.
         */

        boolean boolEquals1 = strCountry1.equals(strCountry2);
        System.out.println("boolEquals1 : " + boolEquals1);

        /**
         * 이번엔 true가 뜨지요?
         * 원래는 문자열 비교는 equals를 쓰는 것이 좋습니다.
         * 참조형 변수기 때문이지요.
         * equals 메서드를 통해서 내부의 값을 정확히 비교하는 것이 좋기 때문입니다.
         *
         * 몇가지 실습을 더 해볼까요?
         */

        StringBuilder sbVar = new StringBuilder("한국");
        sbVar.append("전력");

        /**
         * 스트링빌더를 사용한 것입니다.
         * 출력해 볼까요?
         */

        System.out.println("sbVar.toString : " + sbVar.toString());

        /**
         * 스트링빌더를 실습해 보았습니다.
         * 이번엔 스트링버퍼를 실습해 볼까요?
         * 잘 따라와 주세요.
         */

        StringBuffer strBufferVar = new StringBuffer("수자원");
        strBufferVar.append("공사");

        System.out.println("strBufferVar : " + strBufferVar.toString());

        /**
         * 이런 식으로 출력을 해볼 수 있습니다.
         *
         * 이 정도로 실습해 보면 될 것 같네요.
         *
         * 그럼 다음 강의에서 뵙겠습니다.
         */

    }

}
