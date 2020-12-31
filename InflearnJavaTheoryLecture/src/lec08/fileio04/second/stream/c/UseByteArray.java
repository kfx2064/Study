package lec08.fileio04.second.stream.c;

import java.io.FileInputStream;

public class UseByteArray {

    public static void main(String[] args) {

        FileInputStream fileInputStream = null;

        try {

            fileInputStream = new FileInputStream("C:\\dev\\test.txt");

            byte[] bytes = new byte[10];

            while (true) {
                int read = fileInputStream.read(bytes);

                if (read == -1) {
                    break;
                }

                String getData = new String(bytes, 0, read);
                System.out.println(getData);

                /**
                 * 배열의 길이만큼 잘라서 출력하는 것을 보실 수 있습니다.
                 *
                 * 다음 강의에서 뵙겠습니다.
                 */
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
