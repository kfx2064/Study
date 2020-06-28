package ch03.part02.main1;

import ch03.part02.main1.vo.ProductVO;

public class TestMain {

    /**
     * 메인함수 정의
     * @param args
     */
    public static void main(String[] args) {

        /**
         * 기본형 변수의 생성
         */
        int a = 3;
        System.out.println(a);

        /**
         * 참조형 변수의 생성
         */
        ProductVO product1 = new ProductVO();
        ProductVO product2 = new ProductVO();
        ProductVO product3 = new ProductVO();

        product1.productNo = "a001";
        product1.productName = "아메리카노";
        product1.price = 4000;

        product2.productNo = "a002";
        product2.productName = "카페라떼";
        product2.price = 4300;

        product3.productNo = "a003";
        product3.productName = "카페모카";
        product3.price = 4500;

        System.out.println("product1 정보");
        System.out.println("품목번호[" + product1.productNo + "]");
        System.out.println("품목명[" + product1.productName + "]");
        System.out.println("단가[" + product1.price + "]");
        System.out.println();

        System.out.println("product2 정보");
        System.out.println("품목번호[" + product2.productNo + "]");
        System.out.println("품목명[" + product2.productName + "]");
        System.out.println("단가[" + product2.price + "]");
        System.out.println();

        System.out.println("product3 정보");
        System.out.println("품목번호[" + product3.productNo + "]");
        System.out.println("품목명[" + product3.productName + "]");
        System.out.println("단가[" + product3.price + "]");

    }

}
