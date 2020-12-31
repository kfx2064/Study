package lec08.fileio04.second.stream.a;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class IncodingDecodingMain {

    public static void main(String[] args) throws Exception {

        String strData = "한국";

        /**
         * 데이터의 바이트 값을 각각의 인코딩 방식으로 추출해 보겠습니다.
         */

        byte[] defaultBytes = strData.getBytes();
        byte[] ms949Bytes = strData.getBytes("MS949");
        byte[] utf8Bytes = strData.getBytes("UTF-8");
        byte[] euckrBytes = strData.getBytes("EUC-KR");

        System.out.println("시스템설정방식 : " + Arrays.toString(defaultBytes));
        System.out.println("MS949 : " + Arrays.toString(ms949Bytes));
        System.out.println("UTF-8 : " + Arrays.toString(utf8Bytes));
        System.out.println("EUC-KR : " + Arrays.toString(euckrBytes));

        /**
         * 각각의 바이트 데이터를 가지고
         * 각각의 타입으로 디코딩해 보겠습니다.
         */
        String strDataDefault = new String(defaultBytes);
        String strDataMs949 = new String(ms949Bytes, "MS949");
        String strDataUtf8 = new String(utf8Bytes, "UTF-8");
        String strDataEucKr = new String(euckrBytes, "EUC-KR");

        System.out.println("default : " + strDataDefault);
        System.out.println("ms949 : " + strDataMs949);
        System.out.println("utf8 : " + strDataUtf8);
        System.out.println("euckr : " + strDataEucKr);

    }

}
