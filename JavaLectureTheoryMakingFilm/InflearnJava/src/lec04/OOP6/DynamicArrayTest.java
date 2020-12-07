package lec04.OOP6;

public class DynamicArrayTest {
	
	public static void main(String[] args) {
		
		DynamicArray dArray = new DynamicArray();
		dArray.dynamicMethod("Grape", "WaterMelon", "Apple", "Orange");
		
		dArray.dynamicMethod(new String[]{"Samsung", "SK", "Hyundai"});
		
	}

}
