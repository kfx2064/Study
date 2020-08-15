package ver2_lec02;

/**
 * 메인메소드
 */
public class MainMethod_01_03 {

    public static void main(String[] args) {

        /**
         * 메인 메소드에서 실제 기능들을 동작시켰습니다.
         */

        ProgramInterfaceImpl_01_02 program = new ProgramInterfaceImpl_01_02();
        program.start();
        program.run();
        program.shutdown();
        program.stop();

        /**
         * 이렇게 인터페이스에 대해 실습해 보았습니다.
         */

    }

}
