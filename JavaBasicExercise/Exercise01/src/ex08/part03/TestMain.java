package ex08.part03;

public class TestMain {

    public static void main(String[] args) {

        TypeA a = new TypeA();

        a.setGenderType(TypeA.GenderType.MAN);

        if (a.getGenderType() == TypeA.GenderType.MAN) {
            System.out.println("남자");
        } else if (a.getGenderType() == TypeA.GenderType.WOMAN) {
            System.out.println("여자");
        } else {
            System.out.println("비교불가");
        }

    }

}
