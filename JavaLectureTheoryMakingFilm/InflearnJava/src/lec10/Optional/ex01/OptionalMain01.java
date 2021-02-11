package lec10.Optional.ex01;

import java.util.Optional;

import lec04.OOP15.second.Korea;

public class OptionalMain01 {
	
	public static void main(String[] args) {
		
		Optional<String> good = Optional.of("good");
		String s = good.get();
		System.out.println("옵셔널 값 : " + s);
		
		String nice = Optional.of("nice").get();
		System.out.println("옵셔널 값 : " + nice);
		
		Optional<Object> empty = Optional.empty();
		System.out.println("empty : " + empty);
		
		Optional<String> korea = Optional.ofNullable("korea");
		String s1 = korea.get();
		System.out.println("옵셔널의 값 : " + korea);
		System.out.println("옵셔널의 값 : " + s1);
		
		String america = Optional.ofNullable("america").get();
		System.out.println("옵셔널의 값 : " + america);
		
		Optional<Object> o = Optional.ofNullable(null);
		System.out.println("옵셔널의 값 : " + o);
		
		Optional<Object> o1 = Optional.of(null);
		System.out.println(o1);
		
	}

}
