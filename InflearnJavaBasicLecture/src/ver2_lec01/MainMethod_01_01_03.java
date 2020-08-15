package ver2_lec01;

/**
 * 메인 메소드
 */
public class MainMethod_01_01_03 {

    /**
     * 메인 메소드를 실행합니다.
     * @param args
     */
    public static void main(String[] args) {

        /**
         * 코카콜라 객체를 생성합니다.
         */
        CocaCola_01_01_02 coca = new CocaCola_01_01_02();

        /**
         * 코카콜라 이름을 주입하여 보여 줍니다.
         */
        coca.showColaName("코카콜라");
        /**
         * 코카콜라의 속성을 보여 줍니다.
         */
        coca.showColaProperty();
        /**
         * 코카콜라의 본사 주소를 보여줍니다.
         */
        coca.whereIsCocaCola();

        /**
         * 펩시콜라의 객체를 생성합니다.
         */
        PesiCola_01_01_02 pesi = new PesiCola_01_01_02();
        /**
         * 펩시콜라의 이름을 보여줍니다.
         */
        pesi.showColaName("펩시콜라");
        /**
         * 펩시콜라의 속성을 보여줍니다.
         */
        pesi.showColaProperty();
        /**
         * 펩시콜라의 본사 주소지를 보여줍니다.
         */
        pesi.whereIsPesiCola();

        /**
         * 코카콜라와 펩시콜라의 각자의 객체를 생성하여 보여 줍니다.
         * 코카콜라와 펩시콜라가 공통된 콜라 객체의 내용을 사용하는 것을
         * 확인하실 수 있습니다.
         * 물론 해당 메소드를 새로이 정의해서 사용할 수도 있습니다.
         * 하지만 이번 강의에서는 기본적인 것만 보여드릴 예정입니다.
         * 그리고 향후 실습에서 다양하게 사용해 볼 것이며,
         * 이론 강의에서는 좀 더 자세하게 보여드릴 예정입니다.
         *
         * 그럼 상속에 대해서는 여기서 정리하겠습니다.
         */

    }

}
