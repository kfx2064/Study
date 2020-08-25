package ver2_lect05.fileIO05.training02;

import java.io.FileInputStream;

public class IOManyFunction05 {

    public static void main(String[] args) {

        FileInputStream fis = null;

        try {

            fis = new FileInputStream("C:\\dev\\FileIOTextFile.txt");

            /**
             * 길이가 10인 바이트 배열을 만듭니다.
             */
            byte[] by = new byte[10];
            while (true) {
                /**
                 * 위에서 읽어들인 파일에서 10 바이트 배열 길이만큼 잘라서 읽어 들입니다.
                 * 반복문 안이죠?
                 * 반복문이 계속 돌아가면서 10바이트씩 잘라서 읽습니다.
                 */
                int read = fis.read(by);
                if (read == -1) {
                    break;
                }
                /**
                 * String 타입의 메시지로 변환합니다.
                 * 읽어들인 byte[]의 by를 read의 길이만큼 잘라서
                 * String 문자열로 만듭니다.
                 */
                String msg = new String(by, 0, read);
                System.out.println(msg);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
