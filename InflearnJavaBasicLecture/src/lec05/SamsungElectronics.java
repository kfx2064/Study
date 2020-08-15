package lec05;

public class SamsungElectronics extends Electronics {

    int productsCount = 20;

    public void showCount() {

        /**
         * Electronics의 productsCount와 SamsungElectronics의 productsCount를
         * 비유하여, super를 사용했을 때와 안 헀을 떄를 비교하여 알려준다.
         */

        /**
         * 콘솔에 값을 출력하는 것으로 찍어 보시면, super가 붙은 것과 안 붙은 것의 차이를
         * 아실 수 있습니다.
         * super는 보통 extends를 통해 상속받은 부모 클래스의 값을 알아낼 때 사용합니다.
         * Electronics, 즉 전자회사라는 부모 클래스의 제품 개수는 10개이지만,
         * 전자회사를 상속받은 SamsungElectronics, 삼성전자는 20개일 때,
         * super.를 사용하면 10개와 20개로 찍히는 것을 확인할 수 있습니다.
         *
         * super 클래스는 사용하는 경우가 드문 편입니다.
         *
         * 하지만 고도로 객체지향적인 개념의 코드를 짤 때는 자주 사용되곤 하기 때문에
         * 알아두시면 매우 좋습니다.
         * 슈퍼 클래스는 여기까지 하겠습니다.
         */
        System.out.println("pc ::: " + productsCount);
        System.out.println("super.pc ::: " + super.productsCount);
    }

}
