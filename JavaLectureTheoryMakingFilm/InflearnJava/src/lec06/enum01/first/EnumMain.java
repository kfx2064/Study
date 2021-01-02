package lec06.enum01.first;

public class EnumMain {
	
	public static void main(String[] args) {
		
		EnumCRUD eCreate = EnumCRUD.CREATE;
		EnumCRUD eRead = EnumCRUD.READ;
		EnumCRUD eUpdate = EnumCRUD.UPDATE;
		EnumCRUD eDelete = EnumCRUD.DELETE;
		
		System.out.println("저장 : " + eCreate.getStrName());
		System.out.println("읽기 : " + eRead.getStrName());
		System.out.println("수정 : " + eUpdate.getStrName());
		System.out.println("삭제 : " + eDelete.getStrName());
		
		//int kindLogicValue = 1;
		//int kindLogicValue = 2;
		//int kindLogicValue = 3;		
		int kindLogicValue = 4;
		
		if (EnumCRUD.CREATE.getIntValue() == kindLogicValue) {
			System.out.println("저장 로직입니다.");
		} else if (EnumCRUD.READ.getIntValue() == kindLogicValue) {
			System.out.println("읽기 로직입니다.");
		} else if (EnumCRUD.UPDATE.getIntValue() == kindLogicValue) {
			System.out.println("수정 로직입니다.");
		} else if (EnumCRUD.DELETE.getIntValue() == kindLogicValue) {
			System.out.println("삭제 로직입니다.");
		}
		
	}

}
