package lec06.enum01.first;

/**
 * enum은 이와 같이 정의할 수 있습니다.
 * CRUD를 예를 들어 정의하겠습니다.
 * 따라와 주세요.
 */
public enum EnumCRUD {

    CREATE(1, "저장"), READ(2, "읽기"), UPDATE(3, "수정"), DELETE(4, "삭제");

    private int intValue;
    private String strName;

    private EnumCRUD(int intValue, String strName) {
        this.intValue = intValue;
        this.strName = strName;
    }

    public int getIntValue() {
        return intValue;
    }

    public String getStrName() {
        return strName;
    }
}
