package lec08.fileio04.d;

import java.io.File;

public class FileIOTest {

    public static void main(String[] args) {

        /**
         * 파일명을 변경합니다.
         */

        File fileOrigin = new File("C:\\dev\\FileIOTest\\changeFile\\test.txt");
        File fileChange = new File("C:\\dev\\FileIOTest\\changeFile\\good.txt");

        fileOrigin.renameTo(fileChange);

    }

}
