package ver2_lect05.fileIO05.training02;

import java.io.FileInputStream;

public class IOManyFunction04 {

    public static void main(String[] args) {

        FileInputStream fis = null;

        try {

            fis = new FileInputStream("C:\\dev\\FileIOTextFile.txt");

            while (true) {
                int read = fis.read();
                if (read == -1) {
                    break;
                }
                System.out.print((char) read);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        /**
         * 위의 코딩을 따라 쳐보면 텍스트 파일의 내용을 읽어오는 것을 확인할 수 있습니다.
         * 한글은 깨지죠?
         * 인코딩된 값의 문제입니다.
         * 보통 프로그래밍할 때 한글이 문제가 되는 경우는 의외로 많습니다.
         * 이유는 프로그래밍의 본고장은 미국과 유럽입니다.
         * 영어권 국가들이죠.
         * 그래서 알파벳에 시스템이 맞춰져 있는 경우가 많습니다.
         * 지금은 많이 발전하고 UTF-8, EUC-KR 등이 나오기도 했죠.
         * 하지만 그럼에도 적절한 인코딩 타입을 써주지 않으면 내용이 깨지곤 합니다.
         */

    }

}
