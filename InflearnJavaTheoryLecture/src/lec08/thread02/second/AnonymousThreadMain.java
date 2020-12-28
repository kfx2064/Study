package lec08.thread02.second;

public class AnonymousThreadMain {

    /**
     * 먼저 메시지를 보여줄 메서드를 만들겠습니다.
     * 공통되는 로직이 많아서 별도로 메서드로 분리하여 만들었습니다.
     * static이 붙은 이유는 메인 메서드에서 활용해야 하기 때문입니다.
     */
    public static void showMessage(String message, int time) {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(time);
                System.out.println("메시지 " + i + " : " + message);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Main method start.");

        Thread firstThread = new Thread() {
            @Override
            public void run() {
                showMessage("첫번째 쓰레드", 1000);
            }
        };

        Thread secondThread = new Thread() {
            @Override
            public void run() {
                showMessage("두번째 쓰레드", 1500);
            }
        };

        Thread thirdThread = new Thread(new Runnable() {
            @Override
            public void run() {
                showMessage("첫 runnable", 2000);
            }
        });

        Thread fourthThread = new Thread(new Runnable() {
            @Override
            public void run() {
                showMessage("두번째 runnable", 2500);
            }
        });

        firstThread.start();
        secondThread.start();
        thirdThread.start();
        fourthThread.start();

        System.out.println("Main method end.");
    }

}
