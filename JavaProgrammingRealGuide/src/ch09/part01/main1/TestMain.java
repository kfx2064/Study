package ch09.part01.main1;

public class TestMain {

    public static void main(String[] args) {

        ProductVo v1 = new ProductVo();
        v1.setPrice(1000);
        v1.setProductName("아메리카노");
        v1.setProductNo("a001");
        System.out.println(v1);

        MemberVo v2 = new MemberVo();
        v2.setMemberId("m001");
        v2.setMemberName("홍길동");
        System.out.println(v2);

    }

}
