package ch07.part02.main6;

public class ProductVo {

    // 전역변수 정의
    private String productNo;
    private String productName;
    private int price;

    public ProductVo() {

    }

    // 생성자 함수
    public ProductVo(String productNo) {
        this.productNo = productNo;
    }

    // 생성자 함수
    public ProductVo(String productNo, String productName) {
        this.productNo = productNo;
        this.productName = productName;
    }

    // 생성자 함수
    public ProductVo(String productNo, String productName, int price) {
        this.productNo = productNo;
        this.productName = productName;
        this.price = price;
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
}
