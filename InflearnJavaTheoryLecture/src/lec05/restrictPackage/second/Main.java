package lec05.restrictPackage.second;

import lec05.restrictPackage.first.GoodsVO;

public class Main {

    public static void main(String[] args) {

        GoodsVO goodsVO = new GoodsVO();
        goodsVO.goodsName = "나물";
        /**
         * protected, default, private은 모두 접근이 불가능합니다.
         *
         * getter와 setter를 통해서 접근이 가능한데,
         * private만 해보도록 하겠습니다.
         */

        System.out.println("상품 가격 : " + goodsVO.getGoodsPrice());
        goodsVO.setGoodsPrice(1000);
        System.out.println("변경된 상품 가격 " + goodsVO.getGoodsPrice());

        /**
         * 다른 것도 실습해 볼까요?
         */

    }

}
