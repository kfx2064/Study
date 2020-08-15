package ver2_lec01;

/**
 * 코카콜라
 */
public class CocaCola_01_01_02 extends Cola_01_01_01 {

    /**
     * 부모클래스의 속성을 그대로 보여 줍니다.
     */
    @Override
    public void showColaProperty() {
        super.showColaProperty();
    }

    /**
     * 코카콜라 이름을 받아서 보여 줍니다.
     * @param getColaName
     */
    @Override
    public void showColaName(String getColaName) {
        super.showColaName(getColaName);
    }

    /**
     * 코카콜라의 본사 주소지를 보여 줍니다.
     */
    public void whereIsCocaCola() {
        System.out.println("미국 조지아");
    }
}
