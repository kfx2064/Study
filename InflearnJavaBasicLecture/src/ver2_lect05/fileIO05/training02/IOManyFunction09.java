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

            fileWriter.write("Cars.");

            /**
             * 그냥 String 문자열을 쓰는 방법입니다.
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
