package Chapter13_12;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinEx1 {
	static final ForkJoinPool pool = new ForkJoinPool();	// 쓰레드풀을 생성.
	
	public static void main(String[] args) {
		long from = 1L;
		long to = 100_100_000L;
		
		SumTask task = new SumTask(from, to);
		
		Long start = System.currentTimeMillis();	// 시작시간 초기화.
		Long result = pool.invoke(task);		// invoke 쓰레드 호출해서 작업을 시작.
		
		System.out.println("Elapsed time(4 core) : " + (System.currentTimeMillis() - start));
		System.out.printf("sum of %d~%d=%d%n", from, to, result);
		System.out.println();
		
		result = 0L;
		start = System.currentTimeMillis();	// 시작시간 초기화
		for(long i = from; i <= to; i++) {
			result += i;
		}
		
		System.out.println("Elapsed time(1 core) : " + (System.currentTimeMillis() - start));
		System.out.printf("sum of %d~%d=%d%n", from, to, result);
	}
}

class SumTask extends RecursiveTask<Long> {
	long from;
	long to;
	
	SumTask(long from, long to) {
		this.from = from;
		this.to = to;
	}

	@Override
	protected Long compute() {
		// TODO Auto-generated method stub
		long size = to - from;
		
		if(size <= 5) {	// 더할 숫자가 5개 이하면
			return sum();	// 숫자의 합을 반환
		}
		
		long half = (from + to) / 2;
		
		// 범위를 반으로 나눠서 두 개의 작업을 생성.
		SumTask leftSum = new SumTask(from, half);
		SumTask rightSum = new SumTask(half+1, to);
		
		leftSum.fork();
		
		return rightSum.compute() + leftSum.join();
	}
	
	long sum() {
		long tmp = 0L;
		
		for(long i = from; i <= to; i++) {
			tmp += i;
		}
		
		return tmp;
	}
	
}
