package ver2_lect05.fileIO05.training02;

import java.awt.*;
import java.io.File;
import java.io.FileWriter;

public class IOManyFunction09 {

    public static void main(String[] args) {

        String path = String.valueOf("C:\\dev\\FileIO\\file2.txt");
        FileWriter fileWriter = null;

        try {

            fileWriter = new FileWriter(path);

            fileWriter.write('F');
            fileWriter.write('a');
            fileWriter.write('c');
            fileWriter.write('t');
            fileWriter.write('o');
            fileWriter.write('r');
            fileWriter.write('y');
            fileWriter.write('.');
            fileWriter.write('\r');
            fileWriter.write('\n');

            /**
             * char를 이용하여 하나씩 넣는 방법입니다.
             */

            char[] message = "Electronics.\r\n".toCharArray();
            fileWriter.write(message);

            /**
             * 문자열을 char 배열로 변환하여 쓰는 방법입니다.
             */

            fileWriter.write("Cars.\r\n");

            /**
             * 그냥 String 문자열을 쓰는 방법입니다.
             *
             * 이런 방식으로 파일에 내용을 쓸 수 있습니다.
             *
             * 한글을 한 번 해볼까요?
             */

            fileWriter.write("중화학 공업.");

            /**
             * 이제 실행을 시켜서 값을 확인해 보겠습니다.
             *
             * 파일이 텍스트에 제대로 쓰여진 것을 확인해 보셨나요?
             * 이런 식으로 코딩을 하시면 파일 입출력을 해보실 수 있습니다.
             *
             * 이런 것이 있구나, 하고 알아두시고 넘어가시면 좋습니다.
             *
             * 그럼 다음 강의에서 뵙겠습니다.
             */

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                fileWriter.close();
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
