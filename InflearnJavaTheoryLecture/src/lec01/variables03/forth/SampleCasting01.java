package lec01.variables03.forth;

/**
 * 캐스팅에 대한 실습입니다.
 */
public class SampleCasting01 {

    /**
     * 메인 메서드를 만들어 줍시다.
     * @param args
     */
    public static void main(String[] args) {

        // 실수를 먼저 선언해 줍시다.
        double dbValue = 3.12343234;
        // 선언된 실수를 정수로 변환하는데 int형에 담겠습니다.
        int intValue = (int) dbValue;

        // 출력해 볼까요?
        System.out.println("intValue : " + intValue);

        /**
         * 정수형으로 변환되는 대신에 값이 잘리는 것이 보이시죠?
         * 형변환은 저런 기능을 가지고 있습니다.
         * int형에는 실수값이 없기 때문에 당연히 실수 아래의 값들은 절삭되어 보이지 않는 것입니다.
         * 그러면 다른 것도 실습해 볼까요?
         */

        int intValue1 = 3;
        double dbValue1 = (double) intValue1;
        // 정수형을 double인 실수형에 담는 것을 실습해 보았습니다.
        // 출력해 볼까요?

        System.out.println("dbValue1 : " + dbValue1);
        // 실수형으로 변환되었습니다.
        // 하지만 실수형으로 변환되긴 했어도 소수점으로 표시는 되지만 정수 아래의 값들은 없죠?
        // 정수형에서 실수형으로 변환하였기 때문입니다.

        /**
         * 이번엔 char형의 특이점을 한 번 살펴보겠습니다.
         * 일단 char형을 만들어서 출력해 보겠습니다.
         */
        char sampleChar1 = 'a';
        System.out.println("sampleChar1 : " + sampleChar1);
        /**
         * 문자가 그냥 출력되는 것이 보일 것입니다.
         * 하지만 문자에는 고유의 값들이 존재합니다.
         * 한 번 출력해 볼까요?
         */

        int sampleCharsInt = (int) sampleChar1;
        System.out.println("sampleCharsInt : " + sampleCharsInt);

        /**
         * 정수가 출력되지요?
         * 다른 캐릭터로 실습해 볼까요?
         */

        char sampleChar2 = '가';
        int sampleCharsInt2 = (int) sampleChar2;
        System.out.println("sampleCharsInt2 : " + sampleCharsInt2);

        /**
         * 다른 캐릭터는 다른 값을 출력하지요?
         * 이런 식으로 정수 값들을 확인해 볼 수 있습니다.
         * 그렇다면 저 고유의 정수값을 캐릭터로 변환할 때는 어떤 값이 나올까요?
         * 실습해 보겠습니다.
         */

        int cvtInt1 = 97;
        char cvtChar1 = (char) cvtInt1;
        int cvtInt2 = 44032;
        char cvtChar2 = (char) cvtInt2;

        System.out.println("cvtChar1 : " + cvtChar1);
        System.out.println("cvtChar2 : " + cvtChar2);

        /**
         * 정수 값을 문자 값으로 변환하였습니다.
         * 이런 것들을 캐스팅이라고 하죠.
         * 한글로는 형변환이라고 합니다.
         *
         * 이번 실습은 이 정도로 하겠습니다.
         * 감사합니다.
         */

    }

}
