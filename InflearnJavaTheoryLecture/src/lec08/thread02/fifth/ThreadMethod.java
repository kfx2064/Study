package lec08.thread02.fifth;

public class ThreadMethod {

    public static void main(String[] args) {
        Thread firstThread = new CustomThread("first", 5);
        Thread secondThread = new CustomThread("second", 5);
        Thread thirdThread = new CustomThread("third", 5);
        Thread fourthThread = new CustomThread("fourth", 5);

        try {
            firstThread.start();
            // thread 1이 종료될 때까지 대기한다.
            System.out.println("첫번째 쓰레드 join 실행");
            firstThread.join();

            secondThread.start();

            thirdThread.start();
            System.out.println("세번째 쓰레드 join 실행");
            thirdThread.join();
            fourthThread.start();

            /**
             * 보시면 아시겠지만 join 메서드가 실행되기 이전에 이미 start가 된 것에는 영향을 주지 않습니다.
             * join 메서드가 실행되고 난 뒤 start 되는 쓰레드들은
             * 실행되지 않고 이전에 join이 걸린 thread가 끝날 때까지 기다립니다.
             *
             * 이것이 join 입니다.
             */

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
