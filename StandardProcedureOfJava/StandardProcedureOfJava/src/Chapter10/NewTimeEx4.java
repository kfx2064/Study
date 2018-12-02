package Chapter10;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class NewTimeEx4 {
	
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.of(2014, 1, 1);
		LocalDate date2 = LocalDate.of(2015, 12, 31);
		
		Period pe = Period.between(date1, date2);
		
		System.out.println("date1=" + date1);	// 2014-01-01
		System.out.println("date2=" + date2);	// 2015-12-31
		System.out.println("pe=" + pe);			// Object 그 자체??
		
		System.out.println("YEAR=" + pe.get(ChronoUnit.YEARS));		// 2015 - 2014 = 1	YEAR
		System.out.println("MONTH=" + pe.get(ChronoUnit.MONTHS));	// 12 - 1 = 11	MONTH
		System.out.println("DAY=" + pe.get(ChronoUnit.DAYS));		// 31 - 1 = 30	DAY
		
		LocalTime time1 = LocalTime.of(0, 0, 0);	
		LocalTime time2 = LocalTime.of(12, 34, 56);	
		
		Duration du = Duration.between(time1, time2);	
		
		System.out.println("time1=" + time1);		// 00:00
		System.out.println("time2=" + time2);		// 12:34:56
		System.out.println("du=" + du);				// Object??
		
		// Duration을 그냥 쓸 경우
		long hour = du.getSeconds() / 3600;
		long min = (du.getSeconds() - hour * 3600) / 60;
		long sec = (du.getSeconds() - hour * 3600 - min * 60) % 60;
		int nano = du.getNano();
		
		System.out.println("du...hour=" + hour);		// 12	hour
		System.out.println("du...min=" + min);			// 34	minute
		System.out.println("du...sec=" + sec);			// 56	second
		System.out.println("du...nano=" + nano);		// 0	nano
		
		// Duration을 좀 더 편하게 LocalTime으로 변환하여 값을 사용할 경우
		LocalTime tmpTime = LocalTime.of(0, 0).plusSeconds(du.getSeconds());
		
		System.out.println("HOUR=" + tmpTime.getHour());		// 12	HOUR
		System.out.println("MINUTE=" + tmpTime.getMinute());	// 34	MINUTE
		System.out.println("SECOND=" + tmpTime.getSecond());	// 56	SECOND
		System.out.println("NANO=" + tmpTime.getNano());		// 0	NANO
	}

}
