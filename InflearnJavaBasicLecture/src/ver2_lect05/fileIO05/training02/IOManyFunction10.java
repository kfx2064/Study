package ver2_lect05.fileIO05.training02;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class IOManyFunction10 {

    /**
     * 이젠 BufferedInputStream입니다.
     * 이걸 활용해서 파일 입출력을 하는 것이죠.
     * buffering이라고 많이들 들어보셨죠?
     * 데이터를 일정량 담아두는 것입니다.
     * buffer에 쌓아두는 것이죠.
     *
     * buffer에 일정량의 데이터를 쌓아두고
     * 하나씩 뭉텅이로 보내는 것입니다.
     * 그만큼 전송횟수는 줄어들게 되는 거에요.
     * 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
     * 이렇게 10번 보낼 것을
     * [1, 2, 3, 4, 5], [6, 7, 8, 9, 19]
     * 이렇게 두 번만 뭉텅이로 보내는 것입니다.
     * 이렇게 해서 보내는 것을 BufferedStream이라고 합니다.
     */

    public static void main(String[] args) {

        String path = String.valueOf("C:\\dev\\FileIO\\file2.txt");

        BufferedInputStream bis = null;

        try {

            bis = new BufferedInputStream(new FileInputStream(path));
            byte[] byteBowl = new byte[10];
            while (true) {
                int read = bis.read(byteBowl);
                if (read == -1) {
                    break;
                }

                String message = new String(byteBowl, 0, read);
                System.out.println(message);
            }

            /**
             * 이게 BufferedInputStream이예요.
             * 사실 사용하는 입장에서는 별 차리를 못 느끼실 수 있어요.
             * 간단히 실습하는 것으로는 데이터가 적으니까요.
             * 하지만 대규모 데이터가 필요한 현업에서는 차이를 느끼실 때도 있어요.
             * 일반적인 웹 시스템을 구축하시면 BufferedInputStream을 쓰실 경우는
             * 별로 없어요.
             * 하지만 사용할 경우가 적다는 것 뿐이지 아예 안 쓴다는 것은 아닙니다.
             * 개발자 인생을 살아가다 보면 마주칠 경우가 생기실 거예요.
             * 기획자나 개발자와 대화를 하다 보면 나올 경우도 생기구요.
             *
             * 그럼 BufferedInputStream 실습과 설명은 이 정도로 하겠습니다.
             *
             * 감사합니다, 다음 강의에서 뵙겠습니다.
             */

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (bis != null) {
                    bis.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

}
