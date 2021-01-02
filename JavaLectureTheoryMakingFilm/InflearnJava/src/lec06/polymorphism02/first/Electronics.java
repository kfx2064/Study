package lec06.polymorphism02.first;

public class Electronics extends Company {
	
	public int electricalPartsCount;
	public int electronicsPartsCount;
	
	public void makeMobileDevice() {
		System.out.println("모바일 전자제품을 만듭니다.");
	}
	
	public void homeDevice() {
		System.out.println("가전제품을 만듭니다.");
	}
	
	public void systemDevice() {
		System.out.println("시스템 전자제품을 만듭니다.");
	}
	
	public void coreDevice() {
		System.out.println("핵심 전자제품을 만듭니다.");
	}

}
