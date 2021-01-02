package lec05.generics.forth;

import java.util.ArrayList;
import java.util.HashMap;

public class GenericsCollections {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> scoreList = new ArrayList<Integer>();
		scoreList.add(90);
		scoreList.add(85);
		scoreList.add(95);
		scoreList.add(100);
		scoreList.add(80);
		
		for (int score : scoreList) {
			System.out.print(score + "\t\t\t");
		}
		
		ArrayList<String> lectureList = new ArrayList<String>();
		lectureList.add("국어");
		lectureList.add("수학");
		lectureList.add("영어");
		lectureList.add("과학");
		lectureList.add("사회");
		lectureList.add("국사");
		
		System.out.println();
		for (String lecture : lectureList) {
			System.out.print("과목 : " + lecture + "\t\t");
		}
		
		HashMap<String, Object> mapCountry = new HashMap<String, Object>();
		mapCountry.put("한국", "아시아");
		mapCountry.put("미국", "아메리카");
		mapCountry.put("프랑스", "유럽");
		mapCountry.put("소말리아", "아프리카");
		
		System.out.println();
		System.out.println(mapCountry.toString());
		
	}

}
