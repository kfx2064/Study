package lec08.fileio04.a;

import java.io.File;

public class FileIOTest {

    public static void main(String[] args) throws Exception {
        //File file = new File("./test.txt");
        //File file = new File("test.txt");
        //File file = new File("../test.txt");
        //File file = new File("/test.txt");
        File file =
                new File("C:\\dev\\github\\Study\\InflearnJavaTheoryLecture\\src\\lec08\\fileio04\\first\\test.txt");

        /**
         * 파일의 경로를 반환합니다.
         */
        String path = file.getPath();
        /**
         * 절대 경로를 구합니다.
         */
        String absolutePath = file.getAbsolutePath();
        String canonicalPath = file.getCanonicalPath();
        /**
         * 출력해 보겠습니다.
         */
        System.out.println("path : " + path);
        System.out.println("absolutePath : " + absolutePath);
        System.out.println("canonicalPath : " + canonicalPath);

        /**
         * 다른 걸 테스트해볼까요?
         * 따라와 주세요.
         */
        System.out.println();

        String parent = file.getParent();
        File parentFile = file.getParentFile();
        System.out.println("parent : " + parent);
        System.out.println("parentFile :" + parentFile);

        /**
         * 부모파일이랑 부모파일경로는 null로 뜨는군요.
         * 아무 것도 없다는 뜻입니다.
         */

        String absoluteParent = file.getAbsoluteFile().getParent();
        File absoluteFileParentFile = file.getAbsoluteFile().getParentFile();
        System.out.println();
        System.out.println("absoluteParent : " + absoluteParent);
        System.out.println("absoluteFileParentFile : " + absoluteFileParentFile);

        /**
         * absolute의 패런트와 패런트 파일을 구해봤습니다.
         */

        boolean exists = file.exists();
        boolean isFile = file.isFile();
        boolean isDirectory = file.isDirectory();
        System.out.println();
        System.out.println("exists : " + exists);
        System.out.println("isFile : " + isFile);
        System.out.println("isDirectory : " + isDirectory);
    }

}