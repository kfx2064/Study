package ver2_lect05.fileIO05.training02;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class IOManyFunction12 {

    /**
     * 이번엔 속도 차이에 대해 실습해 보겠습니다.
     *
     * 속도 차이를 실습해 보려면 반복문을 많이 돌려봐야 합니다.
     * 이전 강의들 중에서 속도 차이에 대해 실습해 본 적이 있는 것 같군요.
     *
     * 그것과 같은 식으로 실습하면 됩니다.
     * 일단 코드의 길이가 기니, 객체지향적으로 짜보겠습니다.
     * 메소드를 밖으로 뺴내어, 메인 메소드에서 간단하게 호출하는 방식으로
     * 코드를 진행해 보겠다는 뜻이죠.
     *
     * 그럼 따라서 작성해 주세요.
     */

    public static void readFile(String path) throws Exception {

        FileInputStream fis = new FileInputStream(path);
        byte[] byteBowl = new byte[10];
        while (true) {
            int read = fis.read(byteBowl);
            if (read == -1) {
                break;
            }
            String message = new String(byteBowl, 0, read);
        }
        fis.close();

    }

    public static void readBuffer(String path) throws Exception {

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));
        byte[] byteBowl = new byte[10];
        while (true) {
            int read = bis.read(byteBowl);
            if (read == -1) {
                break;
            }
            String message = new String(byteBowl, 0, read);
        }
        bis.close();

    }

    public static void main(String[] args) throws Exception {

        /**
         * 실습했던 파일들 중 하나를 골라서 데이터를 임의로 늘려봤어요.
         * 텍스트 파일 내부에 써져 있는 텍스트의 양을 늘리는 것이죠.
         * 텍스트의 양을 늘리고 테스트 해보겠습니다.
         */

        String path = String.valueOf("C:\\dev\\FileIO\\fileSpeed.txt");

        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 50; i++) {
            readFile(path);
        }
        long end1 = System.currentTimeMillis();
        System.out.println("일반적인 파일인풋스트림으로 걸린 시간 : " + (end1 - start1));

        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 50; i++) {
            readBuffer(path);
        }
        long end2 = System.currentTimeMillis();
        System.out.println("버퍼를 사용한 스트림으로 걸린 시간 : " + (end2 - start2));

        /**
         * 실행시켜 보시겠어요?
         * 미묘하게 빠른 것을 확인하실 수 있죠?
         *
         * 이 시간에 대한 차이는 실습하시는 분 컴퓨터 환경에 따라서 달라질 수 있어요.
         * 컴퓨터가 좋으면 더욱 빨라지죠.
         *
         * 데이터 전송에 저런 속도 차이가 있다는 것을 눈으로 확인하시니 실감이 나시죠?
         *
         * 다른 것도 한 번 테스트 해볼까요?
         */

        long startFile1 = System.currentTimeMillis();
        for (int i = 0; i < 50; i++) {
            FileInputStream fis = new FileInputStream(path);
            while (true) {
                int read = fis.read();
                if (read == -1) {
                    break;
                }
                char c = (char) read;
            }
            fis.close();
        }
        long endFile1 = System.currentTimeMillis();
        System.out.println("파일 그냥 읽어들인 것 시간 : " + (endFile1 - startFile1));

        long startFile2 = System.currentTimeMillis();
        for (int i = 0; i < 50; i++) {
            FileInputStream fis = new FileInputStream(path);
            byte[] byteBowl = new byte[1024];
            while (true) {
                int read = fis.read(byteBowl);
                if (read == -1) {
                    break;
                }
                String message = new String(byteBowl, 0, read);
            }
        }
        long endFile2 = System.currentTimeMillis();
        System.out.println("바이트 배열로 읽어들인 시간 : " + (endFile2 - startFile2));

        /**
         * 비교해 보셨죠?
         * 바이트 배열로 끊어서 읽어 들이는 것이 더 빠릅니다.
         * 한 번에 읽어들이는 양이 많거든요.
         *
         * 즉 뭉텅이로 뭉쳐서 전송 횟수를 줄이느냐,
         * 아니면 작게작게 많이 전송하느냐,
         * 그 차이라고 보시면 됩니다.
         *
         * 자주 전송하는 것보다는 전송횟수를 줄이는 것이 속도 면에서 더 유리합니다.
         *
         * 이걸로 속도 비교는 마치겠습니다.
         *
         * 그럼 다음 강의에서 뵙겠습니다.
         */

    }

}
