package lec01.array05.fifth;

import java.util.Arrays;

public class Array05 {
	
	public static void main(String[] args) {
		
//		int arr1[][] = new int[2][1];
//		
//		int[][] arr2 = new int[2][1];
//		
//		arr1[0][0] = 1;
//		arr1[1][0] = 2;
//		
//		System.out.println(Arrays.toString(arr1));
//		
//		int save1 = arr1[0][0];
//		int save2 = arr1[1][0];
//		
//		System.out.println("save1 : " + save1);  
//		System.out.println("save2 : " + save2);  
		
		int[][] anotherArr1 = new int[2][2];
		anotherArr1[0][0] = 1;
		anotherArr1[0][1] = 2;
		anotherArr1[1][0] = 3;
		anotherArr1[1][1] = 4;
		
		System.out.println(anotherArr1[0][0]);
		System.out.println(anotherArr1[0][1]);
		System.out.println(anotherArr1[1][0]);
		System.out.println(anotherArr1[1][1]);
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				int getVar = anotherArr1[i][j];
				System.out.println("getVar : " + getVar);
			}
		}
		
		String[][][] strMultiArr1 = new String[2][2][2];
		strMultiArr1[0][0][0] = "가";
		strMultiArr1[0][0][1] = "나";
		strMultiArr1[0][1][0] = "다";
		strMultiArr1[1][0][0] = "라";
		
		strMultiArr1[1][0][1] = "마";
		strMultiArr1[0][1][1] = "바";
		strMultiArr1[1][1][0] = "사";
		
		strMultiArr1[1][1][1] = "자";
		
		for (int x = 0; x < 2; x++) {
			for (int y = 0; y < 2; y++) {
				for (int z = 0; z < 2; z++) {
					String strValue = strMultiArr1[x][y][z];
					System.out.println("strValue : " + strValue + "\t\t");
				}
			}
		}
		
	}

}
