package ver2_lect05.networking06.network01;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class network01 {

    /**
     * URL과 URI가 있습니다.
     * URL은 Uniform Resource Locator,
     * URI는 Uniform Resource Identifier.
     *
     * URL은 위치 정보 중심,
     * URI는 식별 정보 중심입니다.
     *
     * 이렇게만 설명하면 잘 모르시겠죠?
     * 우리가 흔하게 이야기하는 것들을 URL이라고 합니다.
     *
     * 보통은 URL로 다 처리한다고 보시면 좋아요.
     *
     * 그럼 실습을 하나 해볼까요?
     */

    public static void main(String[] args) throws Exception {

        URL url = new URL("https://www.naver.com");

        URLConnection urlConnection = url.openConnection();
        InputStream inputStream = urlConnection.getInputStream();

        BufferedReader bufferedReader
                = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));

        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            System.out.println(readLine);
        }

        bufferedReader.close();

        /**
         * 사이트의 내용을 다 긁어서 볼 수 있습니다.
         * 해당 내용은 태그들과 채워진 내용들로 구성되어 있죠.
         *
         * 보시면 개발자가 아니시라면 신기한 내용일 수 있습니다.
         * 나중에 HTML이란 것을 배우시면 저것들이 HTML 태그들로 구성된 것이란 것을
         * 아실 수 있어요.
         *
         * 이렇게 값을 받아와서 확인하는 방법이 있습니다.
         */
    }

}
