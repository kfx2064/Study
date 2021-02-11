package lec13.StringLec.lecture01;

public class StringLec02 {
	
	public static void main(String[] args) {
		
		String strContains01 = "Hello, world!";
		boolean boolCon01 = strContains01.contains("Hello");
		boolean boolCon02 = strContains01.contains("He");
		boolean boolCon03 = strContains01.contains("good");
		System.out.println("boolCon01 : " + boolCon01);
		System.out.println("boolCon02 : " + boolCon02);
		System.out.println("boolCon03 : " + boolCon03);
		
		String strStarts01 = "Hello, world!";
		boolean boolStarts01 = strStarts01.startsWith("H");
		boolean boolStarts02 = strStarts01.startsWith("e");
		System.out.println("boolStarts01 : " + boolStarts01);
		System.out.println("boolStarts02 : " + boolStarts02);
		
		boolean boolStarts03 = strStarts01.startsWith("H", 1);
		boolean boolStarts04 = strStarts01.startsWith("e", 1);
		System.out.println("boolStarts03 : " + boolStarts03);
		System.out.println("boolStarts04 : " + boolStarts04);
		
		System.out.println("==============================================");
		
		String strLastIndex01 = "Hello, world!";
		int intLast01 = strLastIndex01.lastIndexOf("!");
		int intLast02 = strLastIndex01.lastIndexOf("d");
		System.out.println("intLast01 : " + intLast01);
		System.out.println("intLast02 : " + intLast02);
		
		strLastIndex01 = "!dlrow, olleH";
		int intLast03 = strLastIndex01.lastIndexOf("!");
		int intLast04 = strLastIndex01.lastIndexOf("d");
		System.out.println("intLast03 : " + intLast03);
		System.out.println("intLast04 : " + intLast04);
		
		strLastIndex01 = "!dlrow, olleH. Hello, world!";
		int intLast05 = strLastIndex01.lastIndexOf("!");
		int intLast06 = strLastIndex01.lastIndexOf("d");
		System.out.println("intLast05 : " + intLast05);
		System.out.println("intLast06 : " + intLast06);
		
	}

}