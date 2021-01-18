package lec13.StringLec.lecutre01;

public class StringLec01 {

    public static void main(String[] args) {

        /**
         * String에서 사용할 수 있는 메서드들을 알아보겠습니다.
         * 우선 charAt을 살펴보겠습니다.
         * charAt은 문자열을 탐색하고 그 중 일치하는 문자를 리턴합니다.
         * 일단 실습을 해보고 결과값을 확인하도록 합시다.
         */

        String strCharAt = "Hello, world!";
        char charFirst = strCharAt.charAt(0);
        System.out.println("charFirst : " + charFirst);

        /**
         * H가 뜹니다.
         * 첫 번째 인덱스는 0부터 시작하지요.
         * 0부터 시작하는 인덱스를 계산해서 찾으니 제일 첫번째의 H가 뜹니다.
         * 그렇다면 e라는 결과값을 확인하려면 1을 입력하면 되겠지요?
         */
        char charSecond = strCharAt.charAt(1);
        System.out.println("charSecond : " + charSecond);

        /**
         * e라는 결과값을 확인할 수 있습니다.
         * charAt은 단독으로 쓰기도 하고 다른 함수와 복합적으로 사용하기도 합니다.
         * charAt의 기능에 대해 기억해 두셨다가
         * 복합적인 기능에서 필요할 때 사용하시길 바랍니다.
         *
         * 다음은 concat입니다.
         * 몇 차례 강의에서 나온 걸로 기억합니다.
         * 그래도 실습을 진행하면서 확인하시죠.
         */

        String concatStr01 = "Hello, ";
        String concatStr02 = "world!";
        String resultString01 = concatStr01.concat(concatStr02);
        System.out.println("resultString01 : " + resultString01);

        /**
         * 두 개의 문자열이 합쳐지는 것을 확인할 수 있지요?
         * 다른 예제를 살펴보겠습니다.
         */
        
        String concatString03 = "Material";
        String concatString04 = " purchase.";
        String resultString02 = concatString03.concat(concatString04);
        System.out.println("resultString02 : " + resultString02);

        /**
         * 이렇게 합쳐진 문자열을 확인할 수 있습니다.
         * 이번엔 compareTo를 확인하겠습니다.
         */

        String compareStr01 = "good";
        String compareStr02 = "good";
        int resultCompare01 = compareStr01.compareTo(compareStr02);
        System.out.println("resultCompare01 : " + resultCompare01);


        String compareStr03 = "good";
        String compareStr04 = "not good";
        int resultCompare02 = compareStr03.compareTo(compareStr04);
        System.out.println("resultCompare02 : " + resultCompare02);

        /**
         * compareTo는 같은 문자이면 0을 리턴합니다.
         * 문자열이 서로 다르면 0 이상 또는 이하의 숫자를 리턴하지요.
         * 그것을 통해 문자 같은지, 다른지 판단할 수 있습니다.
         *
         * 그것 외에는 대소문자를 구분하면서 비교하는 것과
         * 대소문자를 구분하지 않으면서 비교하는 것이 있습니다.
         */

        String compareStr05 = "good";
        String compareStr06 = "Good";
        int resultCompare03 = compareStr05.compareTo(compareStr06);
        System.out.println("resultCompare03 : " + resultCompare03);

        String compareStr07 = "good";
        String compareStr08 = "Good";
        int resultCompare04 = compareStr07.compareToIgnoreCase(compareStr08);
        System.out.println("resultCompare04 : " + resultCompare04);

        /**
         * 결과값을 확인하셨지요?
         * compareTo는 대소문자를 구분하면서 비교하여 같은지 확인합니다.
         *
         * 하지만 compareToIgnoreCase는 대소문자를 구분하지 않으면서 비교하여 같은지 확인합니다.
         * ingnore, 즉 무시하느냐는 질문입니다.
         * case는 대소문자를 의미하구요.
         * ignore case, 즉 대소문자 구분을 무시한다는 의미입니다.
         * 그를 통해서 비교값을 도출하는 것이지요.
         *
         * 그럼 다음 기능으로 넘어가겠습니다.
         */

    }

}
