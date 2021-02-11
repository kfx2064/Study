package lec13.StringLec.lecture01;

public class StringLec01 {
	
	public static void main(String[] args) {
		
		String strCharAt = "Hello, world!";
		char charFirst = strCharAt.charAt(0);
		System.out.println("charFirst : " + charFirst);
		
		char charSecond = strCharAt.charAt(1);
		System.out.println("charSecond : " + charSecond);
		
		String concatStr01 = "Hello, ";
		String concatStr02 = "world!";
		String resultString01 = concatStr01.concat(concatStr02);
		System.out.println("resultString01 : " + resultString01);
		
		String concatString03 = "Material";
		String concatString04 = " purchase.";
		String resultString02 = concatString03.concat(concatString04);
		System.out.println("resultString02 : " + resultString02);
		
		System.out.println("================================================");
		
		String compareStr01 = "good";
		String compareStr02 = "good";
		int resultCompare01 = compareStr01.compareTo(compareStr02);
		System.out.println("resultCompare01 : " + resultCompare01);
		
		String compareStr03 = "not good";
		String compareStr04 = "good";
		int resultCompare02 = compareStr03.compareTo(compareStr04);
		System.out.println("resultCompare02 : " + resultCompare02);
		
		System.out.println("================================================");
		
		String compareStr05 = "good";
		String compareStr06 = "Good";
		int resultCompare03 = compareStr05.compareTo(compareStr06);
		System.out.println("resultCompare03 : " + resultCompare03);
		
		String compareStr07 = "good";
		String compareStr08 = "Good";
		int resultCompare04 = compareStr07.compareToIgnoreCase(compareStr08);
		System.out.println("resultCompare04 : " + resultCompare04);
		
		System.out.println("================================================");
		
		String strEmpty01 = "";
		String strEmpty02 = "Hello, world!";
		boolean boolEmpty01 = strEmpty01.isEmpty();
		boolean boolEmpty02 = strEmpty02.isEmpty();
		System.out.println("boolEmpty01 : " + boolEmpty01);
		System.out.println("boolEmpty02 : " + boolEmpty02);
		
		System.out.println("================================================");
		
	}

}
