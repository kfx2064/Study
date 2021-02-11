package lec13.StringLec.lecture01;

public class StringLec04 {
	
	public static void main(String[] args) {
		
		String strSubstring01 = "Hello, world!";
		
		String returnSubs01 = strSubstring01.substring(7);
		String returnSubs02 = strSubstring01.substring(0, 5);
		System.out.println("returnSubs01 : " + returnSubs01);
		System.out.println("returnSubs02 : " + returnSubs02);
		
		String strTrim01 = "  Hello, world!  ";
		String trimResult01 = strTrim01.trim();
		System.out.println("trimResult01 : " + trimResult01);
		
		strTrim01 = "  Hello, world!  ";
		System.out.println("길이 : " + strTrim01.length());
		String trimResult02 = strTrim01.trim();
		System.out.println("길이(trim이후) : " + trimResult02.length());
		
		System.out.println("========================================");
		
		String lowerCase = "Hello, World!";
		System.out.println("lower 전 : " + lowerCase);
		System.out.println("lower 후 : " + lowerCase.toLowerCase());
		
		String strUpperCase = "hello, world!";
		String resultUpper = strUpperCase.toUpperCase();
		System.out.println("resultUpper : " + resultUpper);
		
	}

}
