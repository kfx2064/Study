package lec08.exception01.sixth;

public class ExceptionMain {

    public static void main(String[] args) {


        /**
         * finally를 실습해 보겠습니다.
         * finally는 마지막에 무조건 로직을 수행하는 예외처리 구문 로직입니다.
         * 마지막에 무조건 로직을 수행해야 하는 경우들이 있습니다.
         * 파일 입출력을 수행할 때,
         * 해당 기능을 수행하는 것들에 대해 open과 close를 명확하게
         * 해줘야 하는 경우들이 있습니다.
         * 그리고 database 관련 로직을 수행할 때도
         * connection과 disconnection을 명확하게 수행해줘야 합니다.
         *
         * 해당 기능들은 관련 프로그램과 연관이 있는데
         * 연결을 맺고 끊는 것을 정확하게 해주지 않으면
         * 무한한 연결을 맺을 수 없기 때문에
         * 시스템이 다운되는 현상이 생깁니다.
         * 그래서 연결을 시작하고 끝내는 것을 명확히 해줘야 합니다.
         *
         * 여기서는 단순 실습으로 finally 구문을 테스트 해보겠습니다.
         */

        try {

            System.out.println("비즈니스 로직을 수행합니다.");

            int divide1 = 10 / 2;
            System.out.println("첫번째 나누기 : " + divide1);

            int divide2 = 10 / 0;
            System.out.println("두번째 나누기 : " + divide2);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("마지막에 종료 로직을 수행합니다.");
        }

    }

}
