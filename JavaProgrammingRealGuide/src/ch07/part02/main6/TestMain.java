package ch07.part02.main6;

public class TestMain {

    public static void main(String[] args) {

        // 객체생성 불가
        ProductVo vo1 = new ProductVo();

        ProductVo vo2 = new ProductVo("a001");
        vo2.setProductName("아메리카노");
        vo2.setPrice(4000);

        ProductVo vo3 = new ProductVo("a002", "카페라떼");
        vo3.setPrice(4300);

        ProductVo vo4 = new ProductVo("a003", "카페모카", 4500);



    }

}
