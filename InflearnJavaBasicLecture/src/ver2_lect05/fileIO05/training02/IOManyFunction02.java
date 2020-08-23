package ver2_lect05.fileIO05.training02;

import java.util.Arrays;

public class IOManyFunction02 {

    public static void main(String[] args) throws Exception {

        String strProperty = System.getProperty("file.encoding");
        System.out.println("strProperty : " + strProperty);

        /**
         * 현재 시스템의 기본 인코딩을 확인해 봤습니다.
         * 인코딩 값이 UTF-8이네요.
         * 한글 인코딩 중에는 euc-kr도 있지만
         * 범용적으로 쓰며 세계적으로 많이 쓰는 방법은
         * utf-8입니다.
         */

        String msg1 = String.valueOf("한글");

        byte[] bytes = msg1.getBytes();
        byte[] ms949s = msg1.getBytes("MS949");
        byte[] eucKrs = msg1.getBytes("EUC-KR");
        byte[] utf8s = msg1.getBytes("UTF-8");

        System.out.println("bytes : " + Arrays.toString(bytes));
        System.out.println("ms949s : " + Arrays.toString(ms949s));
        System.out.println("eucKrs : " + Arrays.toString(eucKrs));
        System.out.println("utf8s : " + Arrays.toString(utf8s));
        System.out.println();

        /**
         * byte로 변환을 하였습니다.
         * 인코딩 과정을 거친 것이죠.
         * 인코딩된 결과값은 일반 유저들은 보면 잘 모릅니다.
         * 개발자인 저도 보면 잘 모릅니다.
         * 하지만 보통 컴퓨터들은 저런 값을 이해합니다.
         * 그리고 네트워크에서 전송되는 값들도,
         * 원론적으로 파고 들어가서 내용을 확인해 보면
         * 저런 값들로 구성되어 있는 경우가 있습니다.
         *
         * 디코딩도 해볼까요?
         */

        String strBytes = new String(bytes);
        String strMs949 = new String(ms949s, "MS949");
        String strEucKr = new String(eucKrs, "EUC-KR");
        String strUtf8 = new String(utf8s, "UTF-8");

        System.out.println("strBytes : " + strBytes);
        System.out.println("strMs949 : " + strMs949);
        System.out.println("strEucKr : " + strEucKr);
        System.out.println("strUtf8 : " + strUtf8);
        System.out.println();

        /**
         * 이런 식으로 인코딩, 디코딩을 해볼 수 있습니다.
         *
         * 그러면 다음 단계의 작업을 진행해 볼까요?
         */

    }

}
