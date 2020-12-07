package lec04.OOP01.createEntity.procurement;

public class ProcureDocumentTest {
	
	public static void main(String[] args) {
		
		ProcureDocument procureDocument = new ProcureDocument();
		
		procureDocument.procureNo = "20201003001";
		procureDocument.procureItemNm = "³ª¹«Á£°¡¶ô";
		
		procureDocument.printInfo();
				
	}

}
