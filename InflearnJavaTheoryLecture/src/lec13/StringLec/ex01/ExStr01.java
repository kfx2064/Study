package lec13.StringLec.ex01;

import org.mariadb.jdbc.internal.com.send.authentication.gssapi.GssUtility;

import java.util.Arrays;

public class ExStr01 {

    public static void main(String[] args) {

        String str01 = "Hello, world!";
        char char01 = str01.charAt(0);
        System.out.println("char01 : " + char01);

        String str02 = "abcd";
        int compareTo01 = str02.compareTo("bcdf");
        int compareTo02 = str02.compareTo("abcd");
        int compareTo03 = str02.compareTo("Abcd");
        int compareTo04 = str02.compareToIgnoreCase("Abcd");

        System.out.println("compareTo01 : " + compareTo01);
        System.out.println("compareTo02 : " + compareTo02);
        System.out.println("compareTo03 : " + compareTo03);
        System.out.println("compareTo04 : " + compareTo04);
        
        String str03 = "Hello, ";
        String str04 = "world!";
        String concat01 = str03.concat(str04);
        System.out.println("concat01 : " + concat01);

        String str05 = "Hello, world!";
        boolean contains01 = str05.contains("h");
        boolean contains02 = str05.contains("H");
        System.out.println("contains01 : " + contains01);
        System.out.println("contains02 : " + contains02);

        String strStarts = "Hello, world!";
        boolean starts01 = strStarts.startsWith("H");
        boolean starts02 = strStarts.startsWith("h");
        System.out.println("starts01 : " + starts01);
        System.out.println("starts02 : " + starts02);

        String strEmpty01 = "";
        String strEmpty02 = "Hello, world!";
        boolean boolEmpty01 = strEmpty01.isEmpty();
        boolean boolEmpty02 = strEmpty02.isEmpty();
        System.out.println("boolEmpty01 : " + boolEmpty01);
        System.out.println("boolEmpty02 : " + boolEmpty02);

        String strIndexof01 = "Hello, world!";
        int indexOf01 = strIndexof01.indexOf("H");
        int indexOf02 = strIndexof01.indexOf("e");
        int indexOf03 = strIndexof01.indexOf("A");
        System.out.println("indexOf01 : " + indexOf01);
        System.out.println("indexOf02 : " + indexOf02);
        System.out.println("indexOf03 : " + indexOf03);

        String strLastIndexOf = "Hello, world!";
        int intLastIndex01 = strLastIndexOf.lastIndexOf("!");
        int intLastIndex02 = strLastIndexOf.lastIndexOf("d");
        System.out.println("intLastIndex01 : " + intLastIndex01);
        System.out.println("intLastIndex02 : " + intLastIndex02);

        String strLength = "Hello, world!";
        int intLength = strLength.length();
        System.out.println("intLength : " + intLength);
        
        String strSplit = "a=b=c=d";
        String[] splitData = strSplit.split("=");
        System.out.println("splitData : " + Arrays.toString(splitData));

    }

}
