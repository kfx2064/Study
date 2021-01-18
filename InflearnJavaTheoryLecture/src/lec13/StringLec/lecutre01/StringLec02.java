package lec13.StringLec.lecutre01;

public class StringLec02 {

    public static void main(String[] args) {

        /**
         * contains에 대해 알아보겠습니다.
         * 문자열에 해당 문자가 존재하는지 여부를 확인하는 메서드입니다.
         */
        String strContains01 = "Hello, world!";
        boolean boolCon01 = strContains01.contains("Hello");
        boolean boolCon02 = strContains01.contains("He");
        boolean boolCon03 = strContains01.contains("good");
        System.out.println("boolCon01 : " + boolCon01);
        System.out.println("boolCon02 : " + boolCon02);
        System.out.println("boolCon03 : " + boolCon03);

        /**
         * Hello와 He는 존재하지만 good은 존재하지 않죠.
         * good은 없는 문자이기 때문에 false가 뜨는 것입니다.
         * contains를 통해 실제 그 문자가 존재하는지 확인하고
         * 존재할 경우 특정 로직을 실행하거나
         * 존재하지 않을 경우 특정 로직을 실행하는 식의
         * 로직을 짤 수 있습니다.
         *
         * 다음 메서드는 특정 문자로 시작하는지 여부를 확인하는 것입니다.
         * 이 메서드도 람다와 스트림을 공부할 때 써 본 기억이 있군요.
         * 그럼 진행하겠습니다.
         */

        String strStarts01 = "Hello, world!";
        boolean boolStarts01 = strStarts01.startsWith("H");
        boolean boolStarts02 = strStarts01.startsWith("e");
        System.out.println("boolStarts01 : " + boolStarts01);
        System.out.println("boolStarts02 : " + boolStarts02);

        /**
         * 결과값을 확인할 수 있지요?
         */

        boolean boolStarts03 = strStarts01.startsWith("H", 1);
        boolean boolStarts04 = strStarts01.startsWith("e", 1);
        System.out.println("boolStarts03 : " + boolStarts03);
        System.out.println("boolStarts04 : " + boolStarts04);

        /**
         * 이렇게 인덱스를 넣어줘서 하는 방법도 있습니다.
         * 인덱스의 시작은 0부터입니다.
         * 그렇기 때문에 1을 넣으면 두 번째 자리부터 탐색을 합니다.
         * e는 두 번째 자리에 있으므로 true가 리턴되고
         * H는 첫 번째 자리에 있으므로 false가 리턴이 됩니다.
         *
         * 이것 역시 boolean을 리턴하므로 조건를 판단할 때
         * 사용하실 수 있습니다.
         */

        String strLastIndex01 = "Hello, world!";
        int intLast01 = strLastIndex01.lastIndexOf("!");
        int intLast02 = strLastIndex01.lastIndexOf("d");
        System.out.println("intLast01 : " + intLast01);
        System.out.println("intLast02 : " + intLast02);

        /**
         * lastIndexOf는 해당 문자열이 마지막에 등장하는 위치를 확인합니다.
         * 이렇게 하면 12와 11이 뜨는군요.
         * 다르게도 해볼까요?
         */

        strLastIndex01 = "!dlrow, olleH";
        int intLast03 = strLastIndex01.lastIndexOf("!");
        int intLast04 = strLastIndex01.lastIndexOf("d");
        System.out.println("intLast03 : " + intLast03);
        System.out.println("intLast04 : " + intLast04);

        /**
         * 0과 1이 뜨지요?
         * 다른 것도 해볼까요?
         */

        strLastIndex01 = "!dlrow, olleH. Hello, world!";
        int intLast05 = strLastIndex01.lastIndexOf("!");
        int intLast06 = strLastIndex01.lastIndexOf("d");
        System.out.println("intLast05 : " + intLast05);
        System.out.println("intLast06 : " + intLast06);

        /**
         * 같은 문자가 존재하더라도 마지막 문자를 찾지요?
         * 이렇게 lastIndexOf를 사용할 수 있습니다.
         * 잘 확인한 것 같군요.
         * 그럼 이번 강의도 여기서 끊고 다음 강의에서 찾아뵙겠습니다.
         */

    }

}
