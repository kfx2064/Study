package lec04.OOP02;

/**
 * 클래스의 구성요소 강의입니다.
 */
public class PropertyOfClass {

    // 정적 전역변수, static 전역변수
    public static int entityCount;
    // 클래스 영역에 저장되는 변수입니다.

    // 전역변수
    // 클래스 영역에 저장되는 변수입니다.
    // 정적 전역변수와 다른 점은 클래스로 생성되는 객체마다 고유의 값을 가집니다.
    public String goodsNo;
    public String goodsName;
    public String goodsPrice;

    // enum 타입
    // 특정 값을 정의하여 해당 값만 사용할 때 즐겨 사용됩니다.
    public enum EnumDataType {
        INSERT, UPDATE, DELETE, NORMAL
    }

    // 전역변수이자 enum 타입을 활용한 구분 값.
    public EnumDataType enumDataType = EnumDataType.NORMAL;

    // 정적 초기화
    // 최초 클래스가 사용될 때 딱 1번 호출되는 구역입니다.
    static {
        System.out.println("Goods ::: 정적 초기화 실행");
        System.out.println("Goods entity count : " + entityCount);
        System.out.println("정적 초기화가 여러번 실행될까요?");
    }

    // 초기화 블럭
    // 객체 생성 시 호출되는 최초 구간입니다.
    // 생성자 함수보다 먼저 호출됩니다.
    {
        // 객체를 생성할 때마다 초기화 블럭이 실행된다.
        System.out.println("초기화 블럭을 실행합니다.");
        entityCount++;

        goodsNo = "goods" + entityCount;

        System.out.println("상품번호 : " + goodsNo);
    }

    // 생성자 함수
    // 객체 생성 시 호출되는 함수입니다.
    // 클래스명과 함수명이 동일해야 합니다.
    // 기본 생성자 함수를 만들지 않으면 클래스는 기본 생성자 함수를 자동으로 가집니다.
    // 파라미터를 가진 생성자 함수를 만들면, 파라미터가 없는 기본 생성자 함수는 생기지 않습니다.
    public PropertyOfClass() {
        System.out.println("기본 생성자 함수를 실행합니다.");
    }

    // 파라미터를 가진 생성자 함수입니다.
    public PropertyOfClass(String goodsName) {
        this.goodsName = goodsName;
    }

    // 파라미터를 가진 생성자 함수입니다.
    public PropertyOfClass(String goodsName, String goodsPrice) {
        this.goodsName = goodsName;
        this.goodsPrice = goodsPrice;
    }

    // toString 메서드입니다.
    @Override
    public String toString() {
        return "PropertyOfClass{" +
                "goodsNo='" + goodsNo + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", goodsPrice='" + goodsPrice + '\'' +
                ", enumDataType=" + enumDataType +
                '}';
    }

    /**
     * static 내부 클래스입니다.
     * 클래스 내에 선언된 내부 클래스에 static 제한자를 선언해 놓은 것입니다.
     * 부모 클래스와 가까운 관계일 경우 내부 클래스를 선언하는데,
     * 객체 고유의 값을 가지지 않고 클래스는 모두 동일한 값을 가지게 됩니다.
     */
    public static class InnerClassInfo {
        public static String[] innerClassPropertiesName = new String[]{"상품번호", "상품명", "단가"};
        public static int[] innerClassPropertiesPrice = new int[]{100, 1000, 2500, 3500};
    }

    /**
     * static 함수
     * 정적 함수라고도 합니다.
     * 함수에 static을 붙입니다.
     * 객체에 상관없이 클래스가 모두 동일한 값을 가질 때 사용합니다.
     *
     *
     * 함수
     * 메서드라고도 합니다.
     * 어떤 특정 동작을 정의해 놓은 구간입니다.
     *
     *
     * 내부 클래스
     * 클래스 내부에 클래스를 정의해 놓은 것을 말합니다.
     * 해당 클래스를 호출해서 사용하는 자식 클래스의 부모 클래스 내부에서 사용할 때 내부 클래스를 사용합니다.
     *
     *
     * 제네릭스
     * 클래스나 함수에 제네릭스를 사용할 수 있습니다.
     * 제네릭으로 지정된 타입으로 클래스나 메서드를 만들어 사용합니다.
     * 타입을 일정하게 명시해서 지정해 줄 때 자주 사용됩니다.
     */

}
