package lec04.OOP02;

import java.util.ArrayList;
import java.util.List;

public class PropertyOfClass {
	
	public static int entityCount;
	
	public String goodsNo;
	public String goodsName;
	public String goodsPrice;

	public enum EnumDataType {
		INSERT, UPDATE, DELETE, NORMAL
	}
	
	public EnumDataType enumDataType = EnumDataType.NORMAL;
	
	static {
		System.out.println("Goods ::: 정적 초기화 실행");
		System.out.println("Goods entity count : " + entityCount);
		System.out.println("정적 초기화가 여러번 실행될까요?");
	}
	
	{
		System.out.println("초기화 블럭을 실행합니다.");
		entityCount++;
		
		goodsNo = "goods" + entityCount;
		
		System.out.println("상품번호 : " + goodsNo);
	}
	
	public PropertyOfClass() {
		System.out.println("기본 생성자 함수를 실행합니다.");
	}
	
	public PropertyOfClass(String goodsName) {
		this.goodsName = goodsName;
	}
	
	public PropertyOfClass(String goodsName, String goodsPrice) {
		this.goodsName = goodsName;
		this.goodsPrice = goodsPrice;
	}

	@Override
	public String toString() {
		return "PropertyOfClass [goodsNo=" + goodsNo + ", goodsName=" + goodsName + ", goodsPrice=" + goodsPrice + "]";
	}
	
	public static class InnerClassInfo {
		public static String[] innerClassPropertiesName = new String[] {"상품번호", "상품명", "단가"};
		public static int[] innerClassPropertiesPrice = new int[] {100, 1000, 2500, 3500};
	}
	
}
