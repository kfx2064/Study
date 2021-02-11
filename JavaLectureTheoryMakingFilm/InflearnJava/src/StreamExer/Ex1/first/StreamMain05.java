package StreamExer.Ex1.first;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamMain05 {
	
	public static void main(String[] args) {
		
		Stream<Integer> mapStream01 = Stream.of(3, 4, 5).map(i -> i + 1);
		mapStream01.forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		Stream<Boolean> mapStream02 = Stream.of(3, 4, 5).map(i -> i < 5);
		mapStream02.forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		Stream<Boolean> mapStream03 = Stream.of("samsung", "lg", "hyundai", "sk").map(s -> s.equals("sk"));
		mapStream03.forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		String[][] multipleStringArray = new String[][] {{"a", "b", "c"}, {"가", "나", "다"}, {"good", "nice", "well"}};
		Stream<String> flatMapStream01 = Stream.of(multipleStringArray).flatMap(arr -> Arrays.stream(arr));
		flatMapStream01.forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		Stream<String> concatStream01 = Stream.of("samsung", "lg");
		Stream<String> concatStream02 = Stream.of("반도체", "가전", "휴대폰", "자동차 전자장비");
		Stream<String> concatResultStream = Stream.concat(concatStream01, concatStream02);
		concatResultStream.forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		Stream<String> multipleMethodStream01 = 
				Stream.of("Samsung", "LG", "", "SK", "Hyundai", "Hyundai", "Hyundai")
						.distinct()
						.filter(s -> !s.isEmpty())
						.sorted((s1, s2) -> s1.compareTo(s2));
		multipleMethodStream01.forEach(i -> System.out.print(i + " "));
		System.out.println();
		
	}

}
