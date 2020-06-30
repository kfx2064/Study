package ch07.part01.main1;

public class ProductVo {

    // 객체수 저장 목적
    private static int count;

    // enum 타입
    public enum DataType {
        INSERT, UPDATE, DELETE, NORMAL
    }

    // 품목번호
    private String productNo;       // 품목번호
    private String productName;     // 품목명
    private int price;              // 단가

    // 기본값으로 normal로 설정함
    private DataType dataType = DataType.NORMAL;

    // 정적 초기화 구간
    static {
        System.out.println("ProductVo - 정적 초기화 구간 실행");
        System.out.println("ProductVo - count = " + count);
    }

    // 초기화 블럭
    {
        // 객체 생성 시마다 호출이 일어나며 count의 값을 1씩 증가시킴
        count++;
        System.out.println("ProductVo - 초기화 구간 실행 coutn[" + count + "]");

        // count를 이용하여 객체 품목번호를 정의함
        if (count < 10) {
            productNo = "a00" + count;
        } else if (count < 100) {
            productNo = "a0" + count;
        } else {
            productNo = "a" + count;
        }

        System.out.println("ProductVo - productNo[" + productNo + "]");
    }

    public ProductVo() {
        System.out.println("ProductVo - 생성자함수[1] 실행");
    }

    public ProductVo(String productName, int price) {
        this.productName = productName;
        this.price = price;
        System.out.println("ProductVo - 생성자함수[2] 실행");
    }

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return productNo + "\t" + productName + "\t" + price;
    }

    // ProductVo의 항목을 String[]로 나타내기 위한 함수
    public String[] getData() {
        return new String[]{productNo, productName, "" + price};
    }

    // 테이블 항목 정보
    public static class TableInfo {
        public static final String[] HEADER_NAME_INFO
                = new String[]{"품목번호", "품목명", "단가", "상태"} ;
        public final static int[] WIDTH_INFO = {100, 400, 100, 80};
    }
}
