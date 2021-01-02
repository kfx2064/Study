package lec08.exception01.sixth;

public class ExceptionMain {
	
	public static void main(String[] args) {
		
		try {
			
			System.out.println("비즈니스 로직을 수행합니다.");
			
			int divide1 = 10 / 2;
			System.out.println("첫번째 나누기 : " + divide1);
			
			int divide2 = 10 / 0;
			System.out.println("두번째 나누기 : " + divide2);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("마지막에 종료 로직을 수행합니다.");
		}
		
	}

}
