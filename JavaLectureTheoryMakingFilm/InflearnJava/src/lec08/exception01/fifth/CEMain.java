package lec08.exception01.fifth;

public class CEMain {
	
	public static void output(int amount) throws CustomException {
		
		if (amount < 0) {
			throw new CustomException("");
		}
		
		System.out.println("인출되었습니다.");
		
	}
	
	public static void main(String[] args) {
		
		try {
			
			output(100);
			output(-1);
			
		} catch (CustomException ce) {
			ce.printStackTrace();
		}
		
	}

}
