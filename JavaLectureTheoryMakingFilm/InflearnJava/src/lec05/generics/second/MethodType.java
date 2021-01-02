package lec05.generics.second;

import lec05.generics.first.Alpha02;

public class MethodType {
	
	public <T> T aMethod(T t) {
		return null;
	}
	
	public <T> T bMethod(Alpha02<T> a) {
		return null;
	}
	
	public static <T> T cMethod(T t) {
		return null;
	}
	
	public static <T> T dMethod(Alpha02<T> alpha02) {
		return null;
	}

}
 