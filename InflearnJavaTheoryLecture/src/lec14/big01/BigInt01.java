package lec14.big01;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigInt01 {

    public static void main(String[] args) {

        /**
         * 빅인티저와 빅데시말에 대해 학습하겠습니다.
         *
         * 빅인티저와 빅데시말이 주로 사용되는 것은 long이나 double로도 커버할 수 없는
         * 커다란 데이터를 다룰 때 사용합니다.
         *
         * 특히나 금액을 계산할 때 사용하곤 하는데
         * 일반인은 그럴 일이 없지만 기업은
         * 조 단위까지도 갈 수 있습니다.
         * 억 단위가 넘어가는 경우도 많기 때문에
         * 빅인티저나 빅데시말을 사용하고
         * 이 중에서도 빅인티저를 사용합니다.
         *
         * 그럼 실습을 진행하겠습니다.
         * 빅 인티저부터입니다.
         */
        BigInteger bigInteger = new BigInteger("1");
        System.out.println(bigInteger);

        /**
         * 빅 인티저는 이런 식으로 생성할 수 있습니다.
         */

        System.out.println("========================================");
        BigInteger one = BigInteger.ONE;
        BigInteger zero = BigInteger.ZERO;
        BigInteger ten = BigInteger.TEN;
        BigInteger two = BigInteger.TWO;
        System.out.println("one : " + one);
        System.out.println("zero : " + zero);
        System.out.println("ten : " + ten);
        System.out.println("two : " + two);

        /**
         * 이런 식으로도 데이터를 뽑아낼 수 있죠.
         *
         * 다른 방법을 해보겠습니다.
         */

        System.out.println("========================================");
        BigInteger longBig = BigInteger.valueOf(100);
        System.out.println(longBig);

        /**
         * 이런 식으로도 생성이 가능하지요.
         * 생성 방법은 여러 가지를 알아보았습니다.
         * 이번엔 계산하는 방법과 비교하는 방법에 대해 알아보겠습니다.
         */

        System.out.println("========================================");
        BigInteger oneBig1 = BigInteger.ONE;
        BigInteger oneBig2 = BigInteger.valueOf(1);
        boolean eqBig1 = oneBig1.equals(oneBig2);
        System.out.println("비교 : " + eqBig1);

        /**
         * 비교를 이런 식으로 할 수 있습니다.
         * 다른 것도 확인해 볼까요?
         */

        System.out.println("========================================");
        BigInteger twoBig1 = BigInteger.TWO;
        BigInteger twoBig2 = BigInteger.valueOf(1);
        boolean eqBig2 = twoBig1.equals(twoBig2);
        System.out.println("비교 : " + eqBig2);

        /**
         * 1과 2는 다르지요.
         * equals 메서드를 통해 비교하니 당연히 false가 뜨는 것입니다.
         * 값이 다르니까요.
         * 이런 식으로 값의 비교를 bigInteger에서 할 수 있습니다.
         * 이번엔 더하기, 빼기, 곱하기, 나누기를 해보겠습니다.
         */

        System.out.println("========================================");
        BigInteger oneBigAdd = new BigInteger("1");
        BigInteger twoBigAdd = BigInteger.valueOf(2);
        BigInteger resultAdd = oneBigAdd.add(twoBigAdd);
        System.out.println(resultAdd);

        /**
         * 결과값이 3이지요?
         * 더하기가 제대로 동작한 것을 확인하실 수 있습니다.
         * 다른 것도 확인해 볼까요?
         */

        System.out.println("========================================");
        BigInteger threeBigAdd = BigInteger.valueOf(3);
        BigInteger fourBigAdd = BigInteger.valueOf(4);
        BigInteger addResult2 = threeBigAdd.add(fourBigAdd);
        System.out.println(addResult2);

        /**
         * 3 더하기 4는 7입니다.
         * 잘 동작하지요?
         *
         * 이번엔 다른 것을 해보겠습니다.
         */


        System.out.println("========================================");

        BigInteger bigTwoSubs = BigInteger.valueOf(2);
        BigInteger bigOneSubs = BigInteger.valueOf(1);
        BigInteger bigSubsResult1 = bigTwoSubs.subtract(bigOneSubs);
        System.out.println("결과 : " + bigSubsResult1);

        /**
         * 빼기 동작입니다.
         * substract를 사용하는 것이지요.
         * 다른 것도 해보겠습니다.
         */

        System.out.println("========================================");

        BigInteger bigFiveSubs = BigInteger.valueOf(5);
        BigInteger bigThreeSubs = BigInteger.valueOf(3);
        BigInteger bigSubsResult2 = bigFiveSubs.subtract(bigThreeSubs);
        System.out.println("결과 : " + bigSubsResult2);

        /**
         * 다른 값으로 빼기를 하여 결과값을 확인하실 수 있습니다.
         * 이런 식으로 빼기를 활용하실 수 있습니다.
         * 그렇다면 이번엔 곱하기를 해보겠습니다.
         */

        System.out.println("========================================");

        BigInteger bigMulti01 = BigInteger.valueOf(3);
        BigInteger bigMulti02 = BigInteger.valueOf(2);
        BigInteger bigMultiResult1 = bigMulti01.multiply(bigMulti02);

        System.out.println("곱하기 : " + bigMultiResult1);

        System.out.println("========================================");

        BigInteger bigMulti03 = BigInteger.valueOf(4);
        BigInteger bigMulti04 = BigInteger.valueOf(5);
        BigInteger bigMultiResult2 = bigMulti03.multiply(bigMulti04);

        System.out.println("곱하기 : " + bigMultiResult2);

        /**
         * 잘 됩니다.
         * 곱하기도 이런 식으로 하실 수 있습니다.
         *
         * 이번엔 나누기를 해보겠습니다.
         */

        System.out.println("========================================");

        BigInteger bigDiv01 = BigInteger.valueOf(6);
        BigInteger bigDiv02 = BigInteger.valueOf(2);
        BigInteger bigDivResult1 = bigDiv01.divide(bigDiv02);
        System.out.println("나누기 : " + bigDivResult1);

        BigInteger bigDiv03 = BigInteger.valueOf(10);
        BigInteger bigDiv04 = BigInteger.valueOf(5);
        BigInteger bigDivResult2 = bigDiv03.divide(bigDiv04);
        System.out.println("나누기 : " + bigDivResult2);

        /**
         * 이런 식으로 결과값을 확인하실 수 있습니다.
         *
         * 이렇게 하여 빅 인티저 활용 방법을 알아보았습니다.
         * 이번엔 빅 데시말을 해볼까요?
         */

        System.out.println("========================================");

        BigDecimal bigDec10dot1 = new BigDecimal("10.1");
        System.out.println(bigDec10dot1);

        BigDecimal bigDecValueOf1 = BigDecimal.valueOf(1.5);
        System.out.println(bigDecValueOf1);

        System.out.println("========================================");

        /**
         * 빅 데시말입니다.
         * 빅 데시말은 빅 인티저와 같은데 다만 다른 것은 double처럼 소수입니다.
         * 이것에 대해 실습을 진행해 보겠습니다.
         */

        BigDecimal bigDecEq01 = BigDecimal.valueOf(10.1);
        BigDecimal bigDecEq02 = BigDecimal.valueOf(10.1);
        boolean boolBigEq = bigDecEq01.equals(bigDecEq02);
        System.out.println("equals : " + boolBigEq);

        /**
         * equals이구요.
         */

        System.out.println("========================================");

        BigDecimal bigDecAdd1 = BigDecimal.valueOf(1.5);
        BigDecimal bigDecAdd2 = BigDecimal.valueOf(0.2);
        BigDecimal bigDecResult1 = bigDecAdd1.add(bigDecAdd2);
        System.out.println("더하기 : " + bigDecResult1);

        /**
         * 더하기구요, 빼기를 하겠습니다.
         */

        System.out.println("========================================");

        BigDecimal bigDecSubs1 = BigDecimal.valueOf(1.5);
        BigDecimal bigDecSubs2 = BigDecimal.valueOf(0.2);
        BigDecimal bigDecResultSubs = bigDecSubs1.subtract(bigDecSubs2);
        System.out.println("빼기 : " + bigDecResultSubs);

        /**
         * 이젠 곱하기입니다.
         */

        System.out.println("========================================");

        BigDecimal bigDecMulti1 = BigDecimal.valueOf(0.5);
        BigDecimal bigDecMulti2 = BigDecimal.valueOf(0.2);
        BigDecimal bigDecMultiResult1 = bigDecMulti1.multiply(bigDecMulti2);
        System.out.println("곱하기 : " + bigDecMultiResult1);

        System.out.println("========================================");

        BigDecimal bigDecDiv1 = BigDecimal.valueOf(1.0);
        BigDecimal bigDecDiv2 = BigDecimal.valueOf(2.0);
        BigDecimal bigDecDivResult1 = bigDecDiv1.divide(bigDecDiv2);
        System.out.println("나누기 : " + bigDecDivResult1);

        /**
         * 빅 데시말은 이런 식으로 사용할 수 있습니다.
         * 이제 빅 인티저와 빅 데시말의 사용법에 대해 알아본 것 같습니다.
         * 이 정도 활용법을 알아두시면 좋습니다.
         *
         * 그럼 이번 강의는 여기서 마치겠습니다.
         *
         * 감사합니다.
         */


    }

}
