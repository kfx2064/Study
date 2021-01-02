package lec06.polymorphism02.first;

public class Company {
	
	public String companyName;
	public String companyLocation;
	public int companyEmployeeCount;
	
	public void builtCompany() {
		System.out.println("회사를 만듭니다.");
	}
	
	public void manageCompany() {
		System.out.println("회사를 운영합니다.");
	}
	
	public void shareProfits() {
		System.out.println("수익을 나눕니다.");
	}

}
