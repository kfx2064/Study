package lec10.Optional.ex01;

import java.util.Optional;

public class OptionalMain03 {
	
	public static void main(String[] args) {
		
		String s = Optional.ofNullable("Resort").orElse("Food");
		System.out.println("orElse : " + s);
		
		Object bed = Optional.ofNullable(null).orElse("Bed");
		System.out.println("orElse : " + bed);
		
		String good = Optional.ofNullable("good").orElseGet(() -> "nice");
		System.out.println("orElseGet : " + good);
		
		Object o = Optional.ofNullable(null).orElseGet(() -> "nice");
		System.out.println("orElseGet : " + o);
		
		System.out.println("showMsg를 사용하여 orElse와 orElseGet의 차이를 보겠습니다.");
		System.out.println("===========================================");
		new OptionalMain03().doElseMethod();
		
	}
	
	public String showMsg() {
		System.out.println("Running fast, rest easy.");
		return "Last Mile";
	}
	
	public void doElseMethod() {
		
		Object o = Optional.ofNullable(null).orElseGet(() -> showMsg());
		System.out.println("method : " + o);
		
		Object o1 = Optional.ofNullable(null).orElse(showMsg());
		System.out.println("method : " + o1);
		
		System.out.println("===========================================");
		
		System.out.println("orElse");
		String good1 = Optional.ofNullable("good").orElse(showMsg());
		
		System.out.println("orElseGet");
		String good = Optional.ofNullable("good").orElseGet(this::showMsg);
		
		System.out.println("method : " + good);
		System.out.println("method : " + good1);
		
	}

}
