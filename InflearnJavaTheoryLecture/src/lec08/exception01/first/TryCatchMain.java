package lec08.exception01.first;

/**
 * 트라이 캐치 구문에 대한 실습을 해볼 겁니다.
 * 잘 따라와 주세요.
 */
public class TryCatchMain {

    public static void main(String[] args) {

        /**
         * try 블럭 안에는 로직을 구현합니다.
         * catch 블럭에는 예외처리를 작성하구요.
         * 일단 10 / 5를 한 뒤
         * 뒤에서는 10 / 0을 하도록 하겠습니다.
         * 0으로 나누는 것은 성립되지 않으므로 자연스럽게 예외가 발생합니다.
         */

        try {

            //int divide = 10 / 5;
            int divide = 10 / 0;
            System.out.println("나누기 : " + divide);

        } catch (Exception e) {
            e.printStackTrace();
        }

        /**
         * e.printstacktrace를 통해서 예외의 상세한 정보를 보여줍니다.
         * by zero라는 메시지가 떠서 0으로 나누려고 해서 예외가 발생했다는 정보를 보여줍니다.
         *
         * 이번 실습은 여기까지 하고 다음 실습으로 넘어가겠습니다.
         */

    }

}
