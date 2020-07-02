package ch07.part03.main1.sub2;

import java.util.Arrays;

public class TestMain {

    public static void main(String[] args) {
        String[] headerInfo = ProductVo.TableInfo.HEADER_INFO;
        int[] widthInfo = ProductVo.TableInfo.WIDTH_INFO;

        System.out.println(Arrays.toString(headerInfo));
        System.out.println(Arrays.toString(widthInfo));
    }

}
