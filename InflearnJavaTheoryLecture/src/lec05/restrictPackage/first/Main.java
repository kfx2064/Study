package lec05.restrictPackage.first;

public class Main {

    public static void main(String[] args) {

        GoodsVO goodsVO = new GoodsVO();
        goodsVO.goodsName = "김치";
        goodsVO.goodsCount = 2;
        goodsVO.goodsUnitName = "봉지";
        // goodsPrice는 private이라서 다른 클래스인 Main에서는 접근이 불가능하다.
        int goodsPrice = goodsVO.getGoodsPrice();
        System.out.println("상품 가격 : " + goodsPrice);
        // getter method를 통해서 접근이 가능하다.
        goodsVO.setGoodsPrice(10000);
        int gp = goodsVO.getGoodsPrice();
        System.out.println("상품 가격 : " + gp);

        /**
         * 값이 변경되는 것을 확인할 수 있습니다.
         *
         * 다른 것을 실습해 볼까요?
         * 다음 클래스 작성으로 따라와 주세요.
         */

    }

}
