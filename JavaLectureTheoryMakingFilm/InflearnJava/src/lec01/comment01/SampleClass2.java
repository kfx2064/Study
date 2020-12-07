package lec01.comment01;

public class SampleClass2 {
	
	public static void main(String[] args) {
		
		//methodOne();
		methodTwo();
		
	}
	
	public static void methodOne() {
		System.out.println("안녕하세요.");
		System.out.println("비즈니스 로직이 수행됩니다.");
		int one = 10;
		int two = 20;
		int three = 5;
		three = one + two;
		System.out.println("결과값은 : " + three);
	}
	
	public static void methodTwo() {
		System.out.println("안녕하세요.");
		System.out.println("비즈니스 로직이 수행됩니다.");
		int one = 10;
		int two = 20;
		int three = 5;
		//three = one + two;
		System.out.println("결과값은 : " + three);
	}

}
