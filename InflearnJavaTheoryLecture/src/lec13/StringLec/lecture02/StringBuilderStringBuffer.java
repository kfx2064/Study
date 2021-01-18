package lec13.StringLec.lecture02;

public class StringBuilderStringBuffer {

    public static void main(String[] args) {

        /**
         * StringBuilder와 StringBuffer는 비슷한 기능을 합니다.
         * 하지만 한 가지 큰 차이가 있죠.
         * StringBuilder는 멀티 쓰레드에서 동기화를 지원하지 않습니다.
         * StringBuffer는 멀티 쓰레드에서 동기화를 지원하지요.
         * StringBuffer는 멀티 쓰레드에서 동기화를 지원하기 때문에
         * 멀티 쓰레드 환경 하에서는 속도 면에서 뒤쳐질 수 있습니다.
         * 하지만 쓰레드가 여러 개 돌아가더라도 데이터의 오염을 일어날 것을
         * 막을 수 있습니다.
         * 그래서 멀티 쓰레드 환경이 아닐 경우엔 StringBuilder를 사용하기도 하고
         * 멀티 쓰레드 환경일 경우엔 경우에 따라서만 StringBuilder를 쓰고
         * 쓰레드 세이프하게 짜기 위해서는 StringBuffer를 사용합니다.
         *
         * 그럼 실습을 진행해 볼까요?
         */

        StringBuilder sbd01 = new StringBuilder("Hello, world.");
        StringBuffer sbf01 = new StringBuffer("Nice day.");

        System.out.println(sbd01);
        System.out.println(sbf01);

        /**
         * 잘 동작하지요?
         * 다른 것도 해볼까요?
         */

        System.out.println("=========================================");
        System.out.println(sbd01.toString());
        System.out.println(sbf01.toString());

        /**
         * 마찬가지로 콘솔에 데이터가 잘 찍힙니다.
         * 한 가지 큰 차이는 있습니다.
         * toString 메서드를 사용하면 String 문자열로 리턴합니다.
         * 다시 확인해 볼까요?
         */
        String strBD01 = sbd01.toString();
        String strBF01 = sbf01.toString();
        System.out.println("=========================================");
        System.out.println(strBD01);
        System.out.println(strBF01);

        /**
         * toString 메서드를 통해서 StringBuilder와 Buffer를 활용하여 문자열 데이터의
         * 원천 데이터를 만든 다음에 toString을 통해서 String 데이터를 추출합니다.
         *
         * 다른 것을 확인해 볼까요?
         */

        System.out.println("=========================================");
        StringBuilder sbEasy = new StringBuilder("Easy ").append("day ")
                                                        .append("is ")
                                                        .append("yesterday.");
        System.out.println(sbEasy.toString());
        StringBuffer sfEasy = new StringBuffer("There ").append("is ")
                                                        .append("no ")
                                                        .append("easy ")
                                                        .append("day.");
        System.out.println(sfEasy.toString());

        /**
         * 잘 되지요?
         * append를 통해 문자열을 붙여 줄 수 있습니다.
         * StringBuilder와 StringBuffer는 String을 그냥 사용할 때보다
         * 메모리에서 이득이 있다고 이론적으로 알려져 있습니다.
         * 실제로 저 역시 프로젝트를 할 때면
         * 가이드 문서에서 StringBuilder나 StringBuffer를 사용하여
         * 문자열을 컨트롤하길 권고하곤 했습니다.
         * 또는 valueOf를 통해서 문자열을 컨트롤 하길 권고합니다.
         * 주로 메모리 사용량을 절약하거나 보안적인 요소 때문이었습니다.
         * 보안적인 요소는 제가 설명드리기에는 부족한 감이 있습니다.
         * 여러분도 나중에 경력이 쌓이신다면
         * java secure coding 가이드 문서가 있습니다.
         * 정부 기관에서 발간하는 것으로 알고 있으며
         * 해당 secure coding 기법은 프로젝트에서 권고되는 기법입니다.
         * 알아두시면 유용합니다.
         *
         * 다른 것을 실습해 볼까요?
         */

        System.out.println("=========================================");
        StringBuilder sbCapacity = new StringBuilder("Hello");
        StringBuffer sfCapacity = new StringBuffer("Hello");
        int resultSbCapacity = sbCapacity.capacity();
        int resultSfCapacity = sfCapacity.capacity();
        System.out.println("builder capacity : " + resultSbCapacity);
        System.out.println("buffer capacity : " + resultSfCapacity);

        /**
         * 크기가 반환되죠?
         * 데이터의 크기를 확인하는 메서드입니다.
         * 좀 더 간단한 것을 확인해 볼까요?
         */

        System.out.println("=========================================");
        StringBuilder sba = new StringBuilder("a");
        StringBuffer sfa = new StringBuffer("a");
        System.out.println(sba.capacity());
        System.out.println(sfa.capacity());
        StringBuilder sbb = new StringBuilder("b");
        StringBuffer sfb = new StringBuffer("b");
        System.out.println(sbb.capacity());
        System.out.println(sfb.capacity());

        /**
         * 잘 되죠?
         * 하지만 캐퍼시티는 쓰는 경우가 드뭅니다.
         *
         * 다음은 insert를 실습해 보겠습니다.
         */

        System.out.println("=========================================");
        StringBuilder sbInsert = new StringBuilder("가나다라");
        StringBuffer sfInsert = new StringBuffer("가나다라");
        sbInsert.insert(1, "a");
        sfInsert.insert(1, "a");
        System.out.println(sbInsert.toString());
        System.out.println(sfInsert.toString());
        /**
         * 인덱스가 1이면 두번째 자리부터 삽입되는 것입니다.
         * 둘 다 동일하게 동작하는 것을 확인할 수 있습니다.
         * 하지만 이것도 매우 드물게 사용되는 메서드입니다.
         * append를 통해 문자열을 완성하지 insert를 사용하는 경우는 거의 없습니다.
         */

        System.out.println("=========================================");
        StringBuilder sbDelete = new StringBuilder("Hello");
        StringBuffer sfDelete = new StringBuffer("Hello");
        StringBuilder sbResultDelete = sbDelete.delete(0, 1);
        StringBuffer sfResultDelete = sfDelete.delete(0, 1);
        System.out.println(sbResultDelete.toString());
        System.out.println(sfResultDelete.toString());

        /**
         * 첫번째부터 두번째까지의 인덱스에 해당하는 문자만 딱 잘라내지요?
         * 마찬가지로 delete는 잘 안 쓰입니다.
         * 하지만 기능은 알아두시면 좋습니다.
         * 이번엔 다른 기능입니다.
         * 역순으로 재배열하는 기능입니다.
         */

        System.out.println("=========================================");
        StringBuilder sbReverse = new StringBuilder("Alpha");
        StringBuffer sfReverse = new StringBuffer("Alpha");
        System.out.println(sbReverse.reverse().toString());
        System.out.println(sfReverse.reverse().toString());

        /**
         * 역순으로 재정렬되는 것을 확인하실 수 있습니다.
         * 이번엔 replace를 사용해 보겠습니다.
         */

        System.out.println("=========================================");
        StringBuilder sbReplace = new StringBuilder("Hello, world!");
        StringBuffer sfReplace = new StringBuffer("Hello, world!");
        StringBuilder sbResultReplace = sbReplace.replace(0, 5, "Good");
        StringBuffer sfResultReplace = sfReplace.replace(0, 5, "Good");
        System.out.println(sbResultReplace.toString());
        System.out.println(sfResultReplace.toString());

        /**
         * 시작 인덱스와 끝 인덱스 사이의 문자를 바꾸는 것을 확인하실 수 있습니다.
         * Hello, 0부터 5미만 사이의 문자를 바꾸는 것을 확인하셨죠?
         * 그럼 다음 메서드로 넘어가겠습니다.
         *
         * 이번엔 length입니다.
         */

        System.out.println("=========================================");
        StringBuilder sbLength = new StringBuilder("Hello");
        StringBuffer sfLength = new StringBuffer("Hello");
        System.out.println("Length입니다.");
        System.out.println(sbLength.length());
        System.out.println(sfLength.length());

        /**
         * 빌드와 버퍼의 길이를 확인하실 수 있죠?
         * capacity와는 값이 다른 것을 확인하실 수 있습니다.
         * 사실 StringBuffer와 StringBuilder를 사용할 때는
         * StringBuffer와 Builder의 length를 사용하는 경우는 드뭅니다.
         * 주로 String으로 치환하여 length를 사용하여 뭔가 작업을 합니다.
         * 그럼 여기까지 하도록 하고 다음 메서드로 넘어가겠습니다.
         */

        System.out.println("=========================================");
        StringBuilder sbSubstring = new StringBuilder("Hello");
        StringBuffer sfSubstring = new StringBuffer("Hello");

        String sbSubsResult = sbSubstring.substring(2);
        String sfSubsResult = sfSubstring.substring(2, 5);
        System.out.println(sbSubsResult);
        System.out.println(sfSubsResult);

        /**
         * 잘 잘려서 나오는 것을 확인하실 수 있습니다.
         * 마찬가지로 시작 인덱스와 끝 인덱스이며
         * 끝 인덱스는 포함하지 않습니다.
         * 미만의 의미로 사용되지요.
         *
         * 사실상 이 정도면 Buffer와 Builder에서 알아야 될,
         * 정확히는 이런 것도 있구나, 하는 기능들을 알아둘 만한 것들은
         * 설명이 끝난 것 같습니다.
         *
         * StringBuffer와 StringBuilder에서 알아두시면 좋은 것은
         * String에 비해 효율이 좋은 기능들이며
         * StringBuffer는 쓰레드 세이프하다, 라는 것을 알아두시면 좋습니다.
         *
         * 감사합니다.
         */

    }

}
