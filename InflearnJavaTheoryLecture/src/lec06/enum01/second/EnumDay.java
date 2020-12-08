package lec06.enum01.second;

/**
 * 요일을 지칭하는 enum을 만들어 볼까요?
 */
public enum EnumDay {

    MON("월"), TUE("화"), WED("수"), THU("목"), FRI("금"), SAT("토"), SUN("일");

    public String strName;

    private EnumDay(String strName) {
        this.strName = strName;
    }

    /**
     * 다 만들었습니다. 이제 메인 메서드를 만들어 봅시다.
     */

}
