package lec08.fileio04.second.stream.b;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class FileInputStreamTest {

    public static void main(String[] args) {

        FileInputStream fileInputStream = null;
        FileReader fileReader = null;

        try {
            fileInputStream = new FileInputStream("C:\\dev\\test.txt");

            while (true) {
                int read = fileInputStream.read();
                if (read == -1) {
                    break;
                }
                char readChar = (char) read;
                System.out.print(readChar);

                /**
                 * 한글이 깨지는 것을 확인할 수 있습니다.
                 * 안 깨지게 해볼까요?
                 */

            }

            fileReader = new FileReader("C:\\dev\\test.txt");

            while (true) {
                int read = fileReader.read();
                if (read == -1) {
                    break;
                }
                char readChar = (char) read;
                System.out.print(readChar);
            }

            /**
             * FileReader를 활용하면 잘 나오지요?
             *
             * 이번 강의도 여기서 마치겠습니다.
             */

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }

                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
