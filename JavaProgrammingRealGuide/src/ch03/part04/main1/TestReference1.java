package ch03.part04.main1;

import ch03.part04.main1.vo.ProductVo;

public class TestReference1 {

    public static void main(String[] args) {

        /**
         * 참조변수 생성
         */
        ProductVo product1 = new ProductVo();
        ProductVo product2 = new ProductVo();
        ProductVo product3 = new ProductVo();

        // product1 속성 정보
        product1.productNo = "a001";
        product1.productName = "아메리카노";
        product1.price = 4000;

        // product2 속성 정보
        product2.productNo = "a002";
        product2.productName = "카페라떼";
        product2.price = 4300;

        // product3 속성 정보
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

        boolean compare1 = (product1 == product2);
        boolean compare2 = (product1 == product3);
        System.out.println("compare1 == product2 : " + compare1);
        System.out.println("compare2 == product3 : " + compare2);

        ProductVo prod1 = product1;
        ProductVo prod2 = product2;
        ProductVo prod3 = product3;

        boolean compare3 = (prod1 == product1);
        boolean compare4 = (prod2 == product2);
        boolean compare5 = (prod3 == product3);

        System.out.println("prod1 == product1:" + compare3);
        System.out.println("prod2 == product2:" + compare4);
        System.out.println("prod3 == product3:" + compare5);

        boolean typeCompare1 = (product1 instanceof ProductVo);
        boolean typeCompare2 = (product2 instanceof ProductVo);
        boolean typeCompare3 = (product3 instanceof ProductVo);

        System.out.println("product1 instanceof ProductVo:" + typeCompare1);
        System.out.println("product2 instanceof ProductVo:" + typeCompare2);
        System.out.println("product3 instanceof ProductVo:" + typeCompare3);

    }

}
