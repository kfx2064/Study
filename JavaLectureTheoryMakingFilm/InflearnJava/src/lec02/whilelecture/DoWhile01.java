package lec02.whilelecture;

public class DoWhile01 {
	
	public static void main(String[] args) {
		
		int intTest = 0;
		do {
			System.out.println("인덱스 : " + intTest);
			intTest++;
		} while (intTest < 5);
		
		intTest = 0;
		System.out.println("=============================================");
		
		do {
			System.out.println("인덱스 : " + intTest);
			intTest++;
		} while (intTest < 0);
		
		System.out.println("=============================================");
		
		do {
			System.out.println("무조건 한 번은 실행합니다.");
		} while (false);
		
	}

}
