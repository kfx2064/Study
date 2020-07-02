package ch07.part03.main1.sub2;

public class ProductVo {

    private String productNo;
    private String productName;
    private String price;

    // 품목 그리드 관련 공통정보타입 정의
    public static class TableInfo {
        public final static String[] HEADER_INFO = {"품목번호", "품목명", "단가"};
        public final static int[] WIDTH_INFO = {100, 400, 100};
    }

}
