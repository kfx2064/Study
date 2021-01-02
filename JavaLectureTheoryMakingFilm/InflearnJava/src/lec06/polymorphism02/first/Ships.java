package lec06.polymorphism02.first;

public class Ships extends Company {
	
	public int steelPartsCount;
	public int builtInMaterialCount;
	
	public void builtShips() {
		System.out.println("배를 만듭니다.");
	}
	
	public void builtSeaPlant() {
		System.out.println("해양플랜트를 만듭니다.");
	}

}
