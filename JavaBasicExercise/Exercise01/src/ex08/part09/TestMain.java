package ex08.part09;

public class TestMain {

    public static void main(String[] args) {

        Gender gender = Gender.MAN;
        int value1 = gender.getValue();
        String name1 = gender.getName();
        System.out.println("남 : " + value1);
        System.out.println("남 : " + name1);

        Gender gender1 = Gender.WOMAN;
        int value2 = gender1.getValue();
        String name2 = gender1.getName();
        System.out.println("여 : " + value2);
        System.out.println("여 : " + name2);

    }

}
