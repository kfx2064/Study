package lec05.restrictPackage.first;

public class Main {
	
	public static void main(String[] args) {
		
		GoodsVO goodsVO = new GoodsVO();
		goodsVO.goodsName = "김치";
		goodsVO.goodsCount = 2;
		goodsVO.goodsUnitName = "봉지";
		
		int goodsPrice = goodsVO.getGoodsPrice();
		System.out.println("상품 가격 : " + goodsPrice);
		
		goodsVO.setGoodsPrice(10000);
		int gp = goodsVO.getGoodsPrice();
		System.out.println("상품 가격 : " + gp);
		
	}

}
