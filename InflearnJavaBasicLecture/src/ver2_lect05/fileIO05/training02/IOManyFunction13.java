package ver2_lect05.fileIO05.training02;

import java.io.BufferedReader;
import java.io.FileReader;

public class IOManyFunction13 {

    public static void main(String[] args) {

        /**
         * 이번엔 BufferedReader를 실습해 보겠습니다.
         */
        String path = String.valueOf("C:\\dev\\FileIO\\file2.txt");

        BufferedReader bufferedReader = null;

        try {

            bufferedReader = new BufferedReader(new FileReader(path));

            while (true) {
                String strReadLine = bufferedReader.readLine();
                if (strReadLine == null) {
                    break;
                }
                System.out.println(strReadLine);
            }

            /**
             * 문자 단위로 끊어서 읽어 들입니다.
             * FileReader와 크게 다를 건 없습니다.
             * 다만, buffer를 사용한다는 차이가 있죠.
             *
             * readLine은 읽어 온 값을 라인 단위로 읽기 작업을 하는 것입니다.
             * 버퍼에 미리 읽어와서 담아놨기 때문에
             * 행 단위로 읽기 작업을 할 수 있습니다.
             *
             * 그럼 BufferedReader 강의는 여기까지 하겠습니다.
             *
             * 감사합니다.
             */

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
