package lec04.OOP12;

public class MainMethod {
	
	public static void main(String[] args) {
		
		OverridingChild overridingChild = new OverridingChild();
		String reStr = overridingChild.showCompany();
		
		System.out.println("reStr : " + reStr);
		
		OverridingLG overridingLG = new OverridingLG();
		String lgStr = overridingLG.showCompany();
		
		System.out.println("lgStr : " + lgStr);
		
		OverridingParent overridingParent = new OverridingParent();
		String pStr = overridingParent.showCompany();
		
		System.out.println("pStr : " + pStr);
		
	}

}
