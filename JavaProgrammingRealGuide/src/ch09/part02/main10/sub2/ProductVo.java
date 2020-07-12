package ch09.part02.main10.sub2;

public class ProductVo {

    private String productNo;
    private String productName;
    private int price;

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

    @Override
    public String toString() {
        return "ProductVo{" +
                "productNo='" + productNo + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
