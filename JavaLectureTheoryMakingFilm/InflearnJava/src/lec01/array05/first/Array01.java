package lec01.array05.first;

import java.util.Arrays;

public class Array01 {
	
	public static void main(String[] args) {
		
		int arr[] = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		System.out.println(Arrays.toString(arr));
		
		int first = arr[0];
		int second = arr[1];
		int third = arr[2];
		
		System.out.println("first : " + first);
		System.out.println("second : " + second);
		System.out.println("third : " + third);
		
	}

}
