package lec13.StringLec.lecture01;

import java.util.Arrays;

public class StringLec03 {
	
	public static void main(String[] args) {
		
		String strLength01 = "abcd";
		String strLength02 = "abc";
		int intLength01 = strLength01.length();
		int intLength02 = strLength02.length();
		System.out.println("intLength01 : " + intLength01);
		System.out.println("intLength02 : " + intLength02);
		
		strLength01 = "Hello, world!";
		int intLength03 = strLength01.length();
		System.out.println("intLength03 : " + intLength03);
		
		String strSplit01 = "가-나-다-라-마";
		String strSplit02 = "Alpha-Beta-Charlie";
		String[] arrSplit01 = strSplit01.split("-");
		String[] arrSplit02 = strSplit02.split("-");
		System.out.println(Arrays.toString(arrSplit01));
		System.out.println(Arrays.toString(arrSplit02));
		
		String strSplit03 = "가,나,다,라,마,바";
		String[] arrSplit03 = strSplit03.split(",");
		System.out.println(Arrays.toString(arrSplit03));
		
		System.out.println("============================================");
		
		String strReplace01 = "Hello, world!";
		String replaceStr01 = strReplace01.replace("world", "earth");
		System.out.println("replaceStr01 : " + replaceStr01);
		
		String replaceStr02 = strReplace01.replace("Hello", "Good");
		System.out.println("replaceStr02 : " + replaceStr02);
		
		System.out.println("============================================");
		
		String strReplaceAll01 = "Hello world! Hello world!";
		String ra01 = strReplaceAll01.replaceAll("Hello", "Good");
		System.out.println("replaceAll : " + ra01);
		
		String strReplaceFirst = "Hello, world! Hello, world!";
		String strRF = strReplaceFirst.replaceFirst("Hello", "Good");
		System.out.println("strRF : " + strRF);
		
	}

}
