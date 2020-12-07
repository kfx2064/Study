package lec04.OOP7.callbyvalue;

public class CallByValueTest {
	
	public static void main(String[] args) {
		
		int first = 3;
		int second = first;
		
		int third = doSomething(first);
		System.out.println("동일 변수 비교 : " + (first == second));
		System.out.println("메서드로 계산된 값 : " + third);
		
		InnerClass1 innerClass1 = new InnerClass1();
		InnerClass1 innerClass2 = innerClass1;
		
		InnerClass1 innerClass3 = makeNewEntity(innerClass1);
		System.out.println("동일 객체 비교 : " + (innerClass1 == innerClass2));
		System.out.println(innerClass1);
		System.out.println(innerClass2);
		System.out.println("1번과 3번 비교 : " + (innerClass1 == innerClass3));
		
		System.out.println("\n\n");
		
		System.out.println(innerClass1);
		System.out.println(innerClass3);
		
	}
	
	public static class InnerClass1 {
		
	}
	
	public static int doSomething(int one) {
		one++;
		return one;
	}
	
	public static InnerClass1 makeNewEntity(InnerClass1 innerClass1) {
		innerClass1 = new InnerClass1();
		return innerClass1;
	}

}
