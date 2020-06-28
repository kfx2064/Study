package ch03.part06.main2.vo;

public class TestMain {

    public static void main(String[] args) {

        ProductVo product1 = new ProductVo();
        product1.setProductNo("a001");
        product1.setProductName("아메리카노");
        product1.setPrice(4000);

        ProductVo product2 = new ProductVo();
        product2.setProductInfo("a002", "카페라떼");
        product2.setPrice(4300);

        ProductVo product3 = new ProductVo();
        product3.setProductInfo("a003", "카페모카", 4500);

    }

}
