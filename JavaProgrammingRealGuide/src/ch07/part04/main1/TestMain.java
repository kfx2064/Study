package ch07.part04.main1;

public class TestMain {

    public static void main(String[] args) {

        TypeA a = new TypeA();

        a.setGenderType(TypeA.GenderType.MAN);

        if (a.getGenderType() == TypeA.GenderType.MAN) {
            System.out.println("객체비교 a.getGenderType()[남자]");
        } else if (a.getGenderType() == TypeA.GenderType.WOMAN) {
            System.out.println("객체비교 a.getGenderType()[여자]");
        } else {
            System.out.println("비교불가");
        }

    }

}
