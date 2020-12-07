package lec04.OOP6;

import java.util.Arrays;

public class DynamicArray {
	
	public void dynamicMethod(String... msgParameter) {
		String[] strArray = msgParameter;
		System.out.println(Arrays.toString(strArray));
	}

}
