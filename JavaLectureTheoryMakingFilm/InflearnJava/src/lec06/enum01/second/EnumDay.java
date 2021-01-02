package lec06.enum01.second;

public enum EnumDay {
	
	MON("월"), TUE("화"), WED("수"), THU("목"), FRI("금"), SAT("토"), SUN("일");
	
	public String strName;
	
	private EnumDay(String strName) {
		this.strName = strName;
	}

}
