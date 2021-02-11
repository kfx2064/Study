package lec10.Optional.ex02;

import java.util.Optional;

public class OptionalMain02 {
	
	public static void main(String[] args) {
		
		//String testText = String.valueOf("good");
		String testText = String.valueOf("bad");
		
		Optional<String> s1 = Optional.of(testText).filter(s -> {
			if (s.equals("good")) {
				System.out.println("good이 맞습니다.");
				return true;
			} else {
				System.out.println("bad입니다.");
				return false;
			}
		});
		
		System.out.println("good이 맞는가 : " + s1);
		
		System.out.println("===============================================");
		
		String good = Optional.of(testText).filter(s -> {
			if (s.equals("good")) {
				System.out.println("good이 맞습니다.");
				return true;
			} else {
				System.out.println("bad입니다.");
				return false;
			}
		}).orElseGet(() -> {
			System.out.println("데이터가 존재하지 않아 수행합니다.");
			return "bad";
		});
		
		System.out.println("orElseGet을 추가합니다.");
		System.out.println("good이 맞는가 : " + good);
		
		System.out.println("==================================");
		
		int valueDataRange = 10;
		int successRatio = 3;
		int failRatio = 12;
		
		boolean rtnValid1 = Optional.of(successRatio).filter(i -> i < valueDataRange).isPresent();
		boolean rtnValid2 = Optional.of(failRatio).filter(i -> i < valueDataRange).isPresent();
		
		System.out.println("정상인가 : " + rtnValid1);
		System.out.println("정상인가 : " + rtnValid2);
		
	}

}
