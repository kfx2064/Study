package lec02.forlecture;

import java.util.ArrayList;
import java.util.List;

public class For02 {
	
	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(0);
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		
		for (int i : intList) { 
			System.out.println("i : " + i);
		}
		
		String[] arrStrCountry = new String[] {"한국", "미국", "중국", "러시아", "일본"};
		
		for (String strCountry : arrStrCountry) {
			System.out.println("나라 이름 : " + strCountry);
		}
		
	}

}
