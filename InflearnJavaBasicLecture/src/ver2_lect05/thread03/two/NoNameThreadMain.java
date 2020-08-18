package ver2_lect05.thread03.two;

/**
 * 익명 클래스를 이용한 쓰레드 처리입니다.
 */
public class NoNameThreadMain {

    /**
     * 익명 클래스를 이용한 쓰레드를 만들어 보겠습니다.
     * 코딩을 따라와 주세요.
     *
     * 우선 showPrint라는 메소드부터 만들도록 하겠습니다.
     * 쓰레드에서 처리되는 데이터를 콘솔에 찍어주기 위한 메소드입니다.
     */
    public static void main(String[] args) {
        System.out.println("메인 메소드 실행합니다.");

        Thread threadOne = new Thread() {
            @Override
            public void run() {
                showPrint("threadOne", 1000);
            }
        };

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                showPrint("thread2", 300);
            }
        });

        threadOne.start();
        thread2.start();

        System.out.println("메인 메소드 종료");

    }

    /**
     * 이것이 쓰레드에서 처리하기 위한 메소드입니다.
     */
    private static void showPrint(String message, int interruptInterval) {

        /**
         * 반복문이 세 번 동작합니다.
         */
        for (int i = 0; i < 3; i++) {
            /**
             * try-catch문으로 예외 처리를 위해 감싸 줍니다.
             */
            try {
                /**
                 * 쓰레드를 파라미터로 넘겨받은 기간만큼 멈춰줍니다.
                 */
                Thread.sleep(interruptInterval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            /**
             * 그 뒤 메시지를 찍습니다.
             */
            System.out.println(message);
        }

    }

}
