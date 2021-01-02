package lec05.restrictPackage.first;

public class GoodsVO {
	
	public String goodsName = "½Ò";
	protected int goodsCount = 1;
	String goodsUnitName = "°¡¸¶´Ï";
	private int goodsPrice = 800000;
	
	public int getGoodsPrice() {
		return goodsPrice;
	}
	
	public void setGoodsPrice(int goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

}
