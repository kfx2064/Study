package lec10.Optional.ex02;

import java.io.IOException;
import java.util.Optional;

public class OptionalMain01 {
	
	public static void main(String[] args) {
		
		try {
			String s = Optional.ofNullable("nicely done.").orElseThrow(() -> new Exception());
			System.out.println("orElseThrow : " + s);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Object o = Optional.ofNullable(null).orElseThrow(IOException::new);			
			System.out.println("orElseThrow : " + o);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Optional<Object> country = Optional.ofNullable(null).or(() -> Optional.of("Country"));
		System.out.println("country : " + country);
		System.out.println("country get : " + country.get());
		
	}

}
