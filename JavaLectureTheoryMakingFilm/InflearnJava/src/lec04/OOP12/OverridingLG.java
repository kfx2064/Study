package lec04.OOP12;

public class OverridingLG extends OverridingParent {

	@Override
	public String showCompany() {
		String pStr = super.showCompany();
		pStr = "LG" + pStr;
		return pStr;
	}
	
	

}
