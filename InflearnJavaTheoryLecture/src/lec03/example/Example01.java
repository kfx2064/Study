package lec03.example;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Example01 {

    public static StringBuilder sbProcureNo = new StringBuilder("");
    public static StringBuilder sbProcureItem = new StringBuilder("");
    public static StringBuilder sbProcureQty = new StringBuilder("");
    public static StringBuilder sbProcurePrice = new StringBuilder("");

    public static StringBuilder sbOrderRequestNo = new StringBuilder("");

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("구매시스템에 접속하셨습니다.");
        System.out.print("구매요청을 진행하시겠습니까?(Y/N) : ");
        String strProcureGo = scanner.next();

        boolean isProcureGo = false;

        while (strProcureGo.equals("Y")) {

            System.out.println("구매시스템에 접속하셨습니다.");
            System.out.println("구매요청을 생성합니다.");

            Date today = new Date();
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMdd");
            StringBuilder strToday = new StringBuilder(sdf1.format(today));

            System.out.println("오늘 날짜는 : " + strToday.toString());

            System.out.println("구매요청번호를 생성합니다.");

            strToday.append("001");

            System.out.println("구매요청번호가 생성되었습니다.");
            System.out.println("구매요청번호는 ===> " + strToday.toString());

            sbProcureNo.append(strToday.toString());

            System.out.print("구매품목을 입력해 주세요 : ");
            String procureItem = scanner.next();
            sbProcureItem.append(procureItem.toString());

            System.out.print("구매수량을 입력해 주세요 : ");
            String procureQty = scanner.next();
            sbProcureQty.append(procureQty.toString());

            System.out.print("구매가격을 입력해 주세요 : ");
            String procurePrice = scanner.next();
            sbProcurePrice.append(procurePrice);

            System.out.println("구매 정보입니다.");
            System.out.println("구매요청번호 : " + sbProcureNo.toString());
            System.out.println("구매품목 : " + sbProcureItem.toString());
            System.out.println("구매수량 : " + sbProcureQty.toString());
            System.out.println("구매가격 : " + sbProcurePrice.toString());

            System.out.println("\n\n\n");

            System.out.print("발주요청을 진행하시겠습니까?(Y/N)");
            String strOrderRequestGo = scanner.next();

            if (strOrderRequestGo.equals("Y")) {

                sbOrderRequestNo.append(strToday.toString());
                System.out.println("발주요청을 진행합니다.");
                System.out.println("발주요청번호는 " + sbOrderRequestNo.toString() + "입니다.");

                System.out.println("요청하신 구매요청으로 발주요청을 진행하였습니다.");

            }

            System.out.print("구매요청을 진행하시겠습니까?(Y/N) : ");

            String getProcureIsGo = scanner.next();
            strProcureGo = getProcureIsGo;

        }

        System.out.println("구매시스템을 종료합니다.");

    }

}
