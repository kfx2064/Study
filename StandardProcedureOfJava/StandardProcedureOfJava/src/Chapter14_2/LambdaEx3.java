package Chapter14_2;

@FunctionalInterface
interface MyFunction {
	void myMethod();
}

class Outer {
	int val = 10;	// Outer.this.val
	
	class Inner {
		int val = 20;	// this.val
		
		void method(int i) {	// void method(final int i) {
			int val = 30;	// final int val = 30;
			// i = 10;	// 에러. 상수의 값을 변경할 수 없음.
			
			MyFunction f = () -> {
				System.out.println("			 i : " + i);
				System.out.println("		   val : " + val);
				System.out.println("	  this.val : " + ++this.val);		// ++this.val 이기 때문에 21.
				System.out.println("outer.this.val : " + ++Outer.this.val);	// ++Outer.this.val 이기 때문에 11.
			};
			
			f.myMethod();
		}
	}// Inner 클래스의 끝.
}// Outer 클래스의 끝.

public class LambdaEx3 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.method(100);
	}
}
