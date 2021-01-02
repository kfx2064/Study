package lec05.generics.third;

import java.util.ArrayList;
import java.util.List;

public class TypeMain {
	
	public static void main(String[] args) {
		
		TypeGenerics01<Integer> typeGenerics01 = new TypeGenerics01<Integer>(1);
		TypeGenerics01<String> typeGenerics02 = new TypeGenerics01<String>("사과");
		
		//System.out.println(typeGenerics01.t);
		//System.out.println(typeGenerics02.t);
		
		List<String> aList = new ArrayList<String>();
		aList.add("사과");
		aList.add("포도");		
		
		List<Integer> bList = new ArrayList<Integer>();
		bList.add(1);
		bList.add(2);
		
	}

}
