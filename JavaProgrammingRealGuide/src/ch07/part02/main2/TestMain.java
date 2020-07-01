package ch07.part02.main2;

import java.util.Arrays;

public class TestMain {

    public static void main(String[] args) {
        // 정적 전역변수 사용
        String[] headerNames = ProductVo.HEADER_NAMES;
        System.out.println(Arrays.toString(headerNames));
    }

}
