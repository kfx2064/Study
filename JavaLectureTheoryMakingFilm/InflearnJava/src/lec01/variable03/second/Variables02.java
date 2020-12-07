package lec01.variable03.second;

public class Variables02 {
	
	public static void main(String[] args) {
		
		GoodsVO01 gdsVO01 = new GoodsVO01();
		GoodsVO01 gdsVO02 = new GoodsVO01();
		
		gdsVO01.gdsNo = "gds001";
		gdsVO01.gdsName = "물";
		gdsVO01.gdsPrice = 500;
		gdsVO01.gdsQuantity = 1;
		
		gdsVO02.gdsNo = "gds002";
		gdsVO02.gdsName = "햇반";
		gdsVO02.gdsPrice = 2000;
		gdsVO02.gdsQuantity = 2;
		
		System.out.println("상품1 번호 : " + gdsVO01.gdsNo);
		System.out.println("상품1 이름 : " + gdsVO01.gdsName);
		System.out.println("상품1 가격 : " + gdsVO01.gdsPrice);
		System.out.println("상품1 수량 : " + gdsVO01.gdsQuantity);
		
		System.out.println("상품2 번호 : " + gdsVO02.gdsNo);
		System.out.println("상품2 이름 : " + gdsVO02.gdsName);
		System.out.println("상품2 가격 : " + gdsVO02.gdsPrice);
		System.out.println("상품2 수량 : " + gdsVO02.gdsQuantity);
		
	}

}
