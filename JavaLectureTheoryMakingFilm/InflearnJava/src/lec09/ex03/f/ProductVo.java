package lec09.ex03.f;

public class ProductVo {
	
	private String productNo;
	private String productName;
	private int price;
	private boolean checkYn;
	private String productCode;
	
	public ProductVo(String productNo, String productName, int price, boolean checkYn, String productCode) {
		this.productNo = productNo;
		this.productName = productName;
		this.price = price;
		this.checkYn = checkYn;
		this.productCode = productCode;
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

	public boolean isCheckYn() {
		return checkYn;
	}

	public void setCheckYn(boolean checkYn) {
		this.checkYn = checkYn;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	
}
