package ver2_lec01;

/**
 * 펩시콜라
 */
public class PesiCola_01_01_02 extends Cola_01_01_01 {

    /**
     * 펩시콜라의 속성을 보여줍니다.
     */
    @Override
    public void showColaProperty() {
        super.showColaProperty();
    }

    /**
     * 펩시콜라의 콜라 이름을 보여 줍니다.
     * @param getColaName
     */
    @Override
    public void showColaName(String getColaName) {
        super.showColaName(getColaName);
    }

    /**
     * 펩시콜라 본사 주소지를 보여 줍니다.
     */
    public void whereIsPesiCola() {
        System.out.println("미국 뉴욕");
    }
}
