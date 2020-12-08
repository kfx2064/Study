package lec06.enum01.first;

import java.util.Scanner;

public class EnumSecondMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("값을 입력하세요.  ");
            int scIn = scanner.nextInt();

            if (scIn == EnumCRUD.CREATE.getIntValue()) {
                System.out.println("저장입니다.");
            } else if (scIn == EnumCRUD.READ.getIntValue()) {
                System.out.println("읽기입니다.");
            } else if (scIn == EnumCRUD.UPDATE.getIntValue()) {
                System.out.println("수정입니다.");
            } else if (scIn == EnumCRUD.DELETE.getIntValue()) {
                System.out.println("삭제입니다.");
            } else {
                break;
            }
        }

        /**
         * 값을 입력받는 것을 해보았습니다.
         * 지금은 콘솔에서 입력받는 형태로 구현했지만,
         * 배우면 배울수록 좀 더 복잡하고 뭔가 시스템이나 서비스처럼 보이는 형태로
         * 프로그램을 만들 수 있습니다.
         *
         * Enum은 저런 식으로 사용이 가능합니다.
         *
         * 여기서 궁금증이 생길 것입니다.
         *
         * 똑같이 자료를 저장할 수 있는 변수를 놔두고
         * 왜 Enum을 사용할까요?
         *
         * 특정한 값의 범위를 지정하려고 하기 때문입니다.
         *
         * CREATE, READ, UPDATE, DELETE는 정보시스템의 기본적인 동작입니다.
         * CRUD라고도 부르죠.
         * 동작의 기본이 되는 것들이기 때문에 저 네 가지로 명확한 경계를 만들 수 있습니다.
         *
         * 또 다른 예가 있습니다.
         *
         * 7일로 구성되는 월, 화, 수, 목, 금, 토, 일이 그것입니다.
         * 슈퍼 프라이데이, 블랙 먼데이 등의 것들이 있긴 하지만
         * 그것도 특정 요일을 치장하는 언어입니다.
         * 결국 월, 화, 수, 목, 금, 토, 일로 범위가 명확하며
         * 해당 범위 내에서 해결이 되야 하지요.
         * 이런 것들을 사용할 때 쓸 수 있습니다.
         *
         * 말이 나온 김에 한 번 짜볼까요?
         *
         * 다음 코딩에서 따라와 주세요.
         */

    }

}
