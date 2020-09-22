package lec01.variables03.thrid;

import java.util.Date;

/**
 * 메인메서드가 위치한 곳입니다.
 */
public class Variables02 {

    /**
     * 메인메서드를 만들어 줍시다.
     * @param args
     */
    public static void main(String[] args) {

        /**
         * 객체를 생성합니다.
         */
        SampleVO01 sample1 = new SampleVO01();

        sample1.sampleBoolean = true;
        sample1.sampleChar = '가';
        sample1.sampleString = "한글";
        sample1.sampleByte = 1;
        sample1.sampleShort = 10;
        sample1.sampleInt = 100;
        sample1.sampleLong = 1000;
        sample1.sampleFloat = 1.1f;
        sample1.sampleDouble = 1.2345;

        /**
         * 여러 데이터 타입이 들어갑니다.
         * 그럼 데이터를 출력해 볼까요?
         */
        System.out.println("boolean : " + sample1.sampleBoolean);
        System.out.println("char : " + sample1.sampleChar);
        System.out.println("String : " + sample1.sampleString);
        System.out.println("byte : " + sample1.sampleByte);
        System.out.println("short : " + sample1.sampleShort);
        System.out.println("int : " + sample1.sampleInt);
        System.out.println("long : " + sample1.sampleLong);
        System.out.println("float : " + sample1.sampleFloat);
        System.out.println("double : " + sample1.sampleDouble);

        /**
         * 데이터들이 잘 출력되는 것을 확인할 수 있습니다.
         *
         * 이렇게 참조형은 다양한 데이터를 다루는데 매우 좋습니다.
         * 실무에서도 다양한 데이터를 참조형을 통해서 다루고 통제할 수 있겠지요?
         *
         * 참조형을 사용하는 이유에 대해 이해가 되셨기를 바랍니다.
         *
         * 참조형에는 다른 유형도 있습니다.
         */

        Date date = new Date();
        System.out.println("date : " + date);

        /**
         * Date 함수는 util 패키지에 이미 존재하는 클래스입니다.
         * 해당 클래스로 객체를 생성하여 사용할 수 있는 것이지요.
         * 참조형 변수에는 사용자 정의 클래스 이외에
         * 이미 정의된 클래스를 사용하는 방법도 존재합니다.
         *
         * 그러면 이번 강의는 여기서 마치겠습니다.
         */

    }

}
