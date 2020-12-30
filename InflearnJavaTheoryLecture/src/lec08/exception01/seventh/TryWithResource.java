package lec08.exception01.seventh;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {

    public static void main(String[] args) {

        /**
         * try 구문에서 open, close를 수행하는 try-with-resource 구문입니다.
         * try-with-resource 구문은 try 괄호 안에서 열고 닫고를 해결하지만,
         * 좀 더 쉽게 이해하는 방법은 try-catch-finally 구문을 간편하게
         * 만든 것으로 보면 됩니다.
         * basic한 코딩을 더 선호하시고
         * 확실하게 명시적인 코딩을 선호하신다면
         * try-catch-finally를 사용하는 것도 좋은 방법입니다.
         *
         * 그럼 실습을 진행하겠습니다.
         */

        try(BufferedReader br = new BufferedReader(new FileReader("C:\\dev\\testOut.txt"))) {

            while (true) {
                String strData = br.readLine();
                if (strData != null) {
                    System.out.println(strData);
                } else {
                    break;
                }
            }

        } catch (FileNotFoundException fe) {
            fe.printStackTrace();
        } catch (IOException ie) {
            ie.printStackTrace();
        }

    }

}
