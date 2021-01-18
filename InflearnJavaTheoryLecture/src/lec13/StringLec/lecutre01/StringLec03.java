package lec13.StringLec.lecutre01;

import java.util.Arrays;

public class StringLec03 {

    public static void main(String[] args) {

        /**
         * 이번엔 문자열의 길이를 확인하는 방법에 대해 알아보겠습니다.
         * length는 문자열이 길이를 확인하는 방법인데,
         * 이전에 람다와 옵셔널에서도 사용했던 걸로 기억합니다.
         * 이 강의에서 다시 한 번 더 사용해 보겠습니다.
         */

        String strLength01 = "abcd";
        String strLength02 = "abc";
        int intLength01 = strLength01.length();
        int intLength02 = strLength02.length();
        System.out.println("intLength01 : " + intLength01);
        System.out.println("intLength02 : " + intLength02);

        /**
         * 4와 3이 뜨지요?
         * 결과값을 잘 확인할 수 있습니다.
         * 여태까지 사용한 값을 확인해 볼까요?
         */
        strLength01 = "Hello, world!";
        int intLength03 = strLength01.length();
        System.out.println("intLength03 : " + intLength03);

        /**
         * 13자리를 확인하실 수 있습니다.
         * Hello, world!를 통해서 길이를 확인할 수 있지요.
         *
         * 이번엔 split 메서드를 확인해 보겠습니다.
         */

        String strSplit01 = "가-나-다-라-마";
        String strSplit02 = "Alpha-Beta-Charlie";
        String[] arrSplit01 = strSplit01.split("-");
        String[] arrSplit02 = strSplit02.split("-");
        System.out.println(Arrays.toString(arrSplit01));
        System.out.println(Arrays.toString(arrSplit02));

        /**
         * 특정 구분자를 통해서 문자열을 쪼갠 다음 배열로 리턴하지요?
         * 다른 것도 확인해 볼가요?
         */

        String strSplit03 = "가,나,다,라,마,바";
        String[] arrSplit03 = strSplit03.split(",");
        System.out.println(Arrays.toString(arrSplit03));

        /**
         * 확인하실 수 있지요?
         * 특정 구분자를 통해서 문자열을 쪼갠 다음 배열로 리턴합니다.
         *
         * 이번엔 replace와 replaceAll을 확인해 보겠습니다.
         */

        String strReplace01 = "Hello, world!";
        String replaceStr01 = strReplace01.replace("world", "earth");
        System.out.println("replaceStr01 : " + replaceStr01);

        String replaceStr02 = strReplace01.replace("Hello", "Good");
        System.out.println("replaceStr02 : " + replaceStr02);

        /**
         * 잘 변환되지요?
         * 이번엔 replaceAll을 실습해 볼까요?
         */
        
        String strReplaceAll01 = "Hello world! Hello world!";
        String ra01 = strReplaceAll01.replaceAll("Hello", "Good");
        System.out.println("replaceAll : " + ra01);
        /**
         * 일괄적으로 바꾸지요?
         * 근데 보통 replaceAll보다는 replace를 보다 더 많이 사용하는 편입니다.
         */

        String strReplaceFirst = "Hello, world! Hello, world!";
        String strRF = strReplaceFirst.replaceFirst("Hello", "Good");
        System.out.println("replace first : " + strRF);

        /**
         * 이번엔 repclaeFirst를 사용해 보았습니다.
         * replcaeFirst는 처음 만난 문자만 변경하는 것입니다.
         * 잘 동작하지요?
         * replaceFirst도 즐겨 사용되는 기능은 아니지만,
         * 알아두시면 좋습니다.
         *
         * 그럼 이번 강의도 여기서 마치겠습니다.
         * 감사합니다.
         */

    }

}
