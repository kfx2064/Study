package ver2_lec01;

/**
 * 콜라
 */
public class Cola_01_01_01 {

    /**
     * 콜라 부모 클래스를 먼저 만들겠습니다.
     * 콜라 부모 클래스는 코카콜라와 펩시콜라 두 가지의 자식 클래스를 둡니다.
     * 콜라의 공통적인 속성을 가져다가
     * 코카콜라와 펩시콜라 두 자식 클래스를 만드는 겁니다.
     */

    /**
     * 먼저 콜라 이름은 콜라라고 기본값으로 정해 두겠습니다.
     */
    public String colaName = String.valueOf("콜라");


    /**
     * 콜라 음료의 속성을 보여주는 겁니다.
     * 콜라 음료 속성은 탄산입니다.
     * 탄산 음료라는 속성을 보여줍니다.
     */
    public void showColaProperty() {
        System.out.println("음료 종류는 탄산");
    }

    /**
     * 콜라의 이름을 보여줍니다.
     * 입력받은 파라미터를 통해서 콜라의 이름을
     * 출력하여 보여 줍니다.
     * 이 두 가지 메소드는 객체지향적인 개념을 통해서
     * 상속받은 클래스에서 글자를 보여줍니다.
     * @param getColaName
     */
    public void showColaName(String getColaName) {
        colaName = String.valueOf(getColaName);
        System.out.println("콜라 이름 ::: " + colaName);
    }

}
