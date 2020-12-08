package lec06.enum01.first;

public class EnumMain {

    public static void main(String[] args) {

        EnumCRUD eCreate = EnumCRUD.CREATE;
        EnumCRUD eRead = EnumCRUD.READ;
        EnumCRUD eUpdate = EnumCRUD.UPDATE;
        EnumCRUD eDelete = EnumCRUD.DELETE;

        System.out.println("저장 : " + eCreate.getStrName());
        System.out.println("읽기 : " + eRead.getStrName());
        System.out.println("수정 : " + eUpdate.getStrName());
        System.out.println("삭제 : " + eDelete.getStrName());

        /**
         * enum에 정의된 데이터들을 볼 수 있습니다.
         * 하지만 이것은 단순 출력으로 보이기에 확실하게 감이 오지 않을 수 있습니다.
         *
         * 다음 코딩을 진행해 보겠습니다.
         */
        //int kindLogicValue = 1;
        int kindLogicValue = 2;
        //int kindLogicValue = 3;
        //int kindLogicValue = 4;

        if (EnumCRUD.CREATE.getIntValue() == kindLogicValue) {
            System.out.println("저장 로직입니다.");
        } else if (EnumCRUD.READ.getIntValue() == kindLogicValue) {
            System.out.println("읽기 로직입니다.");
        } else if (EnumCRUD.UPDATE.getIntValue() == kindLogicValue) {
            System.out.println("수정 로직입니다.");
        } else if (EnumCRUD.DELETE.getIntValue() == kindLogicValue) {
            System.out.println("삭제 로직입니다.");
        }

        /**
         * 이런 식으로 코딩을 할 수 있습니다.
         * 다른 걸 좀 더 짜볼까요?
         *
         * 따라와 주세요.
         */

    }

}
