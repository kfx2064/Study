package lec08.fileio04.second.stream.f;

import java.io.FileReader;

public class FileReaderTest {

    public static void main(String[] args) {

        FileReader fileReader = null;

        try {

            /**
             * FileInputStream에서는 한글 데이터가 깨지는 것을 보실 수 있었습니다.
             * 이유는 한글 데이터는 영문, 숫자 등과 다르게 2byte나 3byte의 크기를 차지하기 때문입니다.
             * 그렇기 때문에 1byte씩 읽어들이는 방식으로 출력하면
             * 한글이 깨져서 나오게 됩니다.
             */

            String strFilePath = "C:\\dev\\test.txt";

            fileReader = new FileReader(strFilePath);

            while (true) {
                int read = fileReader.read();
                if (read == -1) {
                    break;
                }
                System.out.print((char) read);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
