package lec08.exception01.third;

public class ExceptionMain {
	
	public void showMsg() throws Exception {
		
		System.out.println("안녕하세요.");
		int divide = 10 / 0;
		
	}
	
	public static void main(String[] args) {
		
		try { 
			
			ExceptionMain exceptionMain = new ExceptionMain();
			exceptionMain.showMsg();
			
		} catch (Exception e) {
			System.out.println("예외가 발생하였습니다.");
			e.getMessage();
			e.printStackTrace();
		}
		
	}

}
