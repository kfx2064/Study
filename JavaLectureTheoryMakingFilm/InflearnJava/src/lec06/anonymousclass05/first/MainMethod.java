package lec06.anonymousclass05.first;

public class MainMethod {
	
	public static void main(String[] args) {
		
		new Company() {
			@Override
			public String returnCompanyName() {
				return super.returnCompanyName();
			}
		};
		
		new Company("Korea Gas") {
			@Override
			public String returnCompanyName() {
				return super.returnCompanyName();
			}
		};
		
		new Runnable() {

			@Override
			public void run() {
				
			}
			
		};
		
	}

}
