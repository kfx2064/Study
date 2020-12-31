package lec08.fileio04.first.g;

import java.io.File;

public class FileIOTest {

    public static void main(String[] args) {

        /**
         * 임시 파일을 생성하고 삭제합니다.
         * 3초간 쓰레드를 재워서
         * 파일이 생성되고 삭제되는 것을 확인하시겠습니다.
         */

        try {

            File newTempFile = File.createTempFile("tempFile_", ".temp"
                    , new File("C:\\dev\\FileIOTest\\tempFile"));
            Thread.sleep(3000);

            newTempFile.deleteOnExit();
            System.out.println("임시파일 ::: " + newTempFile.getAbsolutePath());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
