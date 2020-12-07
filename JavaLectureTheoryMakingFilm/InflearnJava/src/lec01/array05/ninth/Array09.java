package lec01.array05.ninth;

import java.util.Arrays;

public class Array09 {
	
	public static void main(String[] args) {
		
		int[] intArr1 = new int[] {5, 9, 3, 1, 2};
		System.out.println(Arrays.toString(intArr1));
		
		Arrays.sort(intArr1);
		System.out.println("정렬된ㄷ 배열 : " + Arrays.toString(intArr1));
		
		String[] strArr1 = new String[] {"볼트", "나사", "스크류", "드라이버", "못"};
		System.out.println(Arrays.toString(strArr1));
		Arrays.sort(strArr1);
		System.out.println("정렬된 문자열 배열 : " + Arrays.toString(strArr1));
		
	}

}
