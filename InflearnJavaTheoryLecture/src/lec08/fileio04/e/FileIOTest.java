package lec08.fileio04.e;

import java.io.File;

public class FileIOTest {

    public static void main(String[] args) {

        /**
         * 폴더를 삭제합니다.
         */
        File file = new File("C:\\dev\\FileIOTest\\deleteFolder");
        boolean delete = file.delete();

        System.out.println("삭제되었는가? : " + delete);

    }

}
