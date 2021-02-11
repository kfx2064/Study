package lec10.Optional.ex02;

import java.util.Optional;

public class OptionalMain03 {
	
	public static void main(String[] args) {
		
		String originalString = "  good  ";
		
		System.out.println("문자열 길이 : " + originalString.length());
		
		String s1 = Optional.ofNullable(originalString)
							.map(s -> s.trim())
							.orElseGet(() -> {
								return "not good";
							});
		
		System.out.println("문자열 길이 : " + s1.length());
		
		System.out.println("===================================");
		
		int validData = 10;
		
		Integer integer = Optional.ofNullable(validData)
									.map(i -> i + 1)
									.orElseGet(() -> {
										return 0;
									});
		System.out.println("계산된 데이터 : " + integer);
		
		System.out.println("====================================");
		
		int intInputData = 15;
		
		Optional<Boolean> calcValidBoolean = Optional.ofNullable(intInputData)
														.map(i -> {
															if (i < 10) {
																return true;
															} else {
																return false;
															}
														});
		
		System.out.println("검증된 값 : " + calcValidBoolean.get());
		
		System.out.println("=====================================");
		
		//String calcResultData = String.valueOf("success");
		String calcResultData = null;
		
		Optional.ofNullable(calcResultData)
				.ifPresent(s -> System.out.print("성공하였습니다."));
		
		System.out.println();
		System.out.println("=====================================");
		
		Optional.ofNullable(calcResultData)
				.ifPresentOrElse(
						s -> System.out.println("성공하였습니다.")
						, () -> System.out.println("실패하였습니다.")
						);
		
		if (calcResultData == null) {
			System.out.println("실패하였습니다.");
		} else {
			System.out.println("성공하였습니다.");
		}
		
		System.out.println("==========================");
		
		String countryName = "Korea";
		
		Integer strLength01 = Optional.ofNullable(countryName)
										.map(s -> s.length())
										.orElseGet(() -> {
											return 0;
										});
		System.out.println("문자열 길이 : " + strLength01);
		
		countryName = null;
		
		Integer strLength02 = Optional.ofNullable(countryName)
									.map(s -> s.length())
									.orElseGet(() -> {
										return 0;
									});
		
		System.out.println("문자열 길이 : " + strLength02);
		
		System.out.println("=======================================");
		
		String manufacturingResult = "success";
		
		boolean isBoolean01 = Optional.ofNullable(manufacturingResult)
										.map(String::trim)
										.filter(s -> s.equals("success"))
										.isPresent();
		
		System.out.println("생산 결과 : " + isBoolean01);
		
		manufacturingResult = "fail";
		
		boolean isBoolean02 = Optional.ofNullable(manufacturingResult)
										.map(String::trim)
										.filter(s -> s.equals("success"))
										.isPresent();
		System.out.println("생산 결과 : " + isBoolean02);
		
	}

}
