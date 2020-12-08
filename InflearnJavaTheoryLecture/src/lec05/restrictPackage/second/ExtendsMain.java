package lec05.restrictPackage.second;

import lec05.restrictPackage.first.GoodsVO;

public class ExtendsMain extends GoodsVO {

    /**
     * 메인 메서드를 만들기 이전에 상속받은 GoodsVO를 활용할 수 있는 메서드를 만들도록 하겠습니다.
     */
    public static void main(String[] args) {


        ExtendsMain extendsMain = new ExtendsMain();
        extendsMain.showMethod();

        /**
         * name과 count가 잘 찍히는 것을 볼 수 있습니다.
         * 이론에서 배운 바와 같이 상속을 받으면 다른 패키지더라도 protected가 걸린 변수를
         * 사용할 수 있습니다.
         *
         * 그럼 이번 강의는 여기서 마치겠습니다.
         *
         * 감사합니다.
         */

    }

    /**
     * main 메서드는 static이기 때문에 바로 사용이 불가합니다.
     * 그렇기 때문에 메서드로 따로 빼내어 출력을 찍어주고
     * main 메서드에서 객체를 생성하여 메서드를 실행하여 봅니다.
     */
    public void showMethod() {
        String goodsName = super.goodsName;
        int goodsCount = super.goodsCount;

        System.out.println("상품 이름 : " + goodsName);
        System.out.println("상품 가격 : " + goodsCount);
    }

}
