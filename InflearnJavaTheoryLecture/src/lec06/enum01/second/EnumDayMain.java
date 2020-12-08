package lec06.enum01.second;

import java.util.Scanner;

public class EnumDayMain {

    public static void main(String[] args) {

        while (true) {

            /**
             * 요일을 활용한 Enum입니다.
             */

            System.out.println("요일을 입력하세요.  ");
            
            Scanner scanner = new Scanner(System.in);
            String strNext = scanner.next();
            
            if (strNext.equals(EnumDay.MON.strName)) {
                System.out.println("월요일입니다.");
            } else if (strNext.equals(EnumDay.TUE.strName)) {
                System.out.println("화요일입니다.");
            } else if (strNext.equals(EnumDay.WED.strName)) {
                System.out.println("수요일입니다.");
            } else if (strNext.equals(EnumDay.THU.strName)) {
                System.out.println("목요일입니다.");
            } else if (strNext.equals(EnumDay.FRI.strName)) {
                System.out.println("금요일입니다.");
            } else if (strNext.equals(EnumDay.SAT.strName)) {
                System.out.println("토요일입니다.");
            } else if (strNext.equals(EnumDay.SUN.strName)) {
                System.out.println("일요일입니다.");
            } else {
                break;
            }

            /**
             * 실습이 잘 되었는지요?
             *
             * Enum은 이런 식으로 활용이 가능합니다.
             *
             * 그럼 이번 강의는 여기서 마치겠습니다.
             *
             * 감사합니다.
             */

        }
        
    }
    
}
