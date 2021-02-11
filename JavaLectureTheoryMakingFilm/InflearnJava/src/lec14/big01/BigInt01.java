package lec14.big01;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigInt01 {
	
	public static void main(String[] args) {
		
		BigInteger bigInteger = new BigInteger("1");
		System.out.println(bigInteger);
		
		System.out.println("=======================================");
		BigInteger one = BigInteger.ONE;
		BigInteger zero = BigInteger.ZERO;
		BigInteger ten = BigInteger.TEN;
		BigInteger two = BigInteger.TWO;
		System.out.println("one : " + one);
		System.out.println("zero : " + zero);
		System.out.println("ten : " + ten);
		System.out.println("two : " + two);
		
		System.out.println("=======================================");
		BigInteger longBig = BigInteger.valueOf(100);
		System.out.println(longBig);
		
		System.out.println("=======================================");
		BigInteger oneBig1 = BigInteger.ONE;
		BigInteger oneBig2 = BigInteger.valueOf(1);
		boolean eqBig1 = oneBig1.equals(oneBig2);
		System.out.println("비교 : " + eqBig1);
		
		System.out.println("=======================================");
		BigInteger twoBig1 = BigInteger.TWO;
		BigInteger twoBig2 = BigInteger.valueOf(1);
		boolean eqBig2 = twoBig1.equals(twoBig2);
		System.out.println("비교 : " + eqBig2);
		
		System.out.println("=======================================");
		BigInteger oneBigAdd = new BigInteger("1");
		BigInteger twoBigAdd = BigInteger.valueOf(2);
		BigInteger resultAdd = oneBigAdd.add(twoBigAdd);
		System.out.println(resultAdd);
		
		System.out.println("=======================================");
		BigInteger threeBigAdd = BigInteger.valueOf(3);
		BigInteger fourBigAdd = BigInteger.valueOf(4);
		BigInteger addResult2 = threeBigAdd.add(fourBigAdd);
		System.out.println(addResult2);
		
		System.out.println("=======================================");
		BigInteger bigTwoSubs = BigInteger.valueOf(2);
		BigInteger bigOneSubs = BigInteger.valueOf(1);
		BigInteger bigSubsResult1 = bigTwoSubs.subtract(bigOneSubs);
		System.out.println("결과 : " + bigSubsResult1);
		
		System.out.println("=======================================");
		BigInteger bigFiveSubs = BigInteger.valueOf(5);
		BigInteger bigThreeSubs = BigInteger.valueOf(3);
		BigInteger bigSubsResult2 = bigFiveSubs.subtract(bigThreeSubs);
		System.out.println("결과 : " + bigSubsResult2);
		
		System.out.println("=======================================");
		BigInteger bigMulti01 = BigInteger.valueOf(3);
		BigInteger bigMulti02 = BigInteger.valueOf(2);
		BigInteger bigMultiResult1 = bigMulti01.multiply(bigMulti02);
		System.out.println("곱하기 : " + bigMultiResult1);
		
		System.out.println("=======================================");
		BigInteger bigMulti03 = BigInteger.valueOf(4);
		BigInteger bigMulti04 = BigInteger.valueOf(5);
		BigInteger bigMultiResult2 = bigMulti03.multiply(bigMulti04);
		System.out.println("곱하기 : " + bigMultiResult2);
		
		System.out.println("=======================================");
		BigInteger bigDiv01 = BigInteger.valueOf(6);
		BigInteger bigDiv02 = BigInteger.valueOf(2);
		BigInteger bigDivResult1 = bigDiv01.divide(bigDiv02);
		System.out.println("나누기 : " + bigDivResult1);
		
		BigInteger bigDiv03 = BigInteger.valueOf(10);
		BigInteger bigDiv04 = BigInteger.valueOf(5);
		BigInteger bigDivResult2 = bigDiv03.divide(bigDiv04);
		System.out.println("나누기 : " + bigDivResult2);
		
		System.out.println("=======================================");
		BigDecimal bigDec10dot1 = new BigDecimal("10.1");
		System.out.println(bigDec10dot1);
		
		BigDecimal bigDecValueOf1 = BigDecimal .valueOf(1.5);
		System.out.println(bigDecValueOf1);
		
		System.out.println("=======================================");
		
		BigDecimal bigDecEq01 = BigDecimal.valueOf(10.1);
		BigDecimal bigDecEq02 = BigDecimal.valueOf(10.1);
		boolean boolBigEq = bigDecEq01.equals(bigDecEq02);
		System.out.println("equals : " + boolBigEq);
		
		System.out.println("=======================================");
		BigDecimal bigDecAdd1 = BigDecimal.valueOf(1.5);
		BigDecimal bigDecAdd2 = BigDecimal.valueOf(0.2);
		BigDecimal bigDecResult1 = bigDecAdd1.add(bigDecAdd2);
		System.out.println("더하기 : " + bigDecResult1);
		
		System.out.println("=======================================");
		BigDecimal bigDecSubs1 = BigDecimal.valueOf(1.5);
		BigDecimal bigDecSubs2 = BigDecimal.valueOf(0.2);
		BigDecimal bigDecResultSubs = bigDecSubs1.subtract(bigDecSubs2);
		System.out.println("빼기 : " + bigDecResultSubs);
		
		System.out.println("=======================================");
		BigDecimal bigDecMulti1 = BigDecimal.valueOf(0.5);
		BigDecimal bigDecMulti2 = BigDecimal.valueOf(0.2);
		BigDecimal bigDecMultiResult1 = bigDecMulti1.multiply(bigDecMulti2);
		System.out.println("곱하기 : " + bigDecMultiResult1);
		
		System.out.println("=======================================");
		BigDecimal bigDecDiv1 = BigDecimal.valueOf(1.0);
		BigDecimal bigDecDiv2 = BigDecimal.valueOf(2.0);
		BigDecimal bigDecDivResult1 = bigDecDiv1.divide(bigDecDiv2);
		System.out.println("나누기 : " + bigDecDivResult1);
		
		System.out.println("=======================================");
		
		
	}

}
