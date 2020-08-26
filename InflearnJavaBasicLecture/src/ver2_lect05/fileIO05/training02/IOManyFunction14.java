package ver2_lect05.fileIO05.training02;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class IOManyFunction14 {

    public static void main(String[] args) {

        String path = String.valueOf("C:\\dev\\FileIO\\file2.txt");

        BufferedWriter bufferedWriter = null;

        try {

            bufferedWriter = new BufferedWriter(new FileWriter(path));

            bufferedWriter.write('c');
            bufferedWriter.write('o');
            bufferedWriter.write('m');
            bufferedWriter.write('p');
            bufferedWriter.write('a');
            bufferedWriter.write('n');
            bufferedWriter.write('y');
            bufferedWriter.write('\r');
            bufferedWriter.write('\n');

            char[] message = "Human resource\r\n".toCharArray();
            bufferedWriter.write(message);

            bufferedWriter.write("Account");

            bufferedWriter.flush();

            /**
             * 이것도 크게 차이가 없습니다.
             * 단지 buffer가 존재한다는 차이점이 있는 것이죠.
             *
             * 텍스트 파일에 잘 써진 것을 확인하셨나요?
             *
             * 그럼 BufferedWriter 클래스의 실습은 여기까지 하겠습니다.
             *
             * 감사합니다.
             */

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        try {

            Desktop.getDesktop().open(new File(path));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
