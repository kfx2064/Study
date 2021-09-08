package ex08.part08;

public class TestMain {

    public static void main(String[] args) {

        Gender gender = Gender.MAN;
        int value = gender.getValue();
        String name = gender.getName();
        System.out.println("남 : " + value);
        System.out.println("남 : " + name);

        Gender gender1 = Gender.WOMAN;
        int value1 = gender1.getValue();
        String name1 = gender1.getName();
        System.out.println("여 : " + value1);
        System.out.println("여 : " + name1);

    }

}
