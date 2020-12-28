package lec08.thread02.first;

public class CustomThreadMain {

    public static void main(String[] args) {

        System.out.println("메인함수 실행");

        Thread thread1 = new CustomThread("첫번째 쓰레드", 750);
        Thread thread2 = new CustomThread("두번째 쓰레드", 1500);

        CustomRunnable cr1 = new CustomRunnable("세번째 쓰레드 runnable", 2250);
        CustomRunnable cr2 = new CustomRunnable("네번째 쓰레드 runnable", 3000);

        Thread thread3 = new Thread(cr1);
        Thread thread4 = new Thread(cr2);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        System.out.println("메인함수 종료");

    }

}
