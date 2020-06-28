package ch03.part05.main3;

import ch03.part05.main3.vo.ProductVo;

public class TestMethod {

    public static void main(String[] args) {

        ProductVo v = new ProductVo();

        v.setProductNo("a001");
        v.setProductName("아메리카노");
        v.setPrice(4000);

        System.out.println("productNo=" + v.getProductNo());
        System.out.println("productName=" + v.getProductName());
        System.out.println("price=" + v.getPrice());

    }

}
