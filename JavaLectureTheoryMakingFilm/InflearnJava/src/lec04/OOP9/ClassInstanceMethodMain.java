package lec04.OOP9;

public class ClassInstanceMethodMain {
	
	public static void main(String[] args) {
		
		int stSum = ClassInstanceMethod.staticSum(1, 2);
		int stAv = ClassInstanceMethod.staticAverage(4, 8);
		System.out.println("stSum : " + stSum);
		System.out.println("stAv : " + stAv);
		
		ClassInstanceMethod cim = new ClassInstanceMethod();
		int etSum = cim.entitySum(2, 3);
		int etAv = cim.entityAverage(6, 10);
		System.out.println("etSum : " + etSum);
		System.out.println("etAv : " + etAv);
		
	}

}
