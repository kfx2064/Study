package ch03.part07.main1;

import ch03.part07.main1.vo.ProductVo1;

public class TestMain {

    public static void main(String[] args) {

        ProductVo1 prod1 = new ProductVo1();
        prod1.productNo = "a001";
        prod1.setProductName("아메리카노");
        prod1.setPrice(4000);
        prod1.setType(1);

        ProductVo2 prod2 = new ProductVo2();
        prod2.productNo = "a001";
        prod2.setProductName("아메리카노");
        prod2.setPrice(4000);
        prod2.setType(1);

    }

}
