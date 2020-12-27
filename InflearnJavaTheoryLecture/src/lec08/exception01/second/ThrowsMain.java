package lec08.exception01.second;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * try-catch는 다양한 방식으로 사용할 수 있습니다.
 *
 * 실습해 보도록 하겠습니다.
 */
public class ThrowsMain {

    public static void main(String[] args) {

        try {

            FileInputStream fis = new FileInputStream("c:/");

            /**
             * 여러 개의 catch 구문을 통해 예외를 세부적으로 지정해 줄 수 있습니다.
             * 세부적으로 정해진 예외 처리를 통해
             * 특정 예외를 처리해 줄 수 있고
             * 이를 통해 더 자세한 예외 정보를 프로그래머도 확인할 수 있습니다.
             *
             * 예를 들어 사이트를 이용하다 보면 예외 화면을 볼 수 있습니다.
             * 그때 catch에서 예외 종류를 구분해 주면
             * 출력되는 메시지를 바꾸거나 화면 디자인을 여러 가지로 구분해서
             * 보여줄 수 있습니다.
             *
             * 그럼 이번 강의도 여기서 마치겠습니다.
             *
             */

        } catch (ArithmeticException ae) {
            ae.printStackTrace();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }

    }

}
