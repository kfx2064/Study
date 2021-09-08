package ex08.part06;

public class TestMain {

    public static void main(String[] args) {

        Gender gender1 = Gender.MAN;
        int value1 = gender1.getValue();
        String name1 = gender1.getName();
        System.out.println("남자 : " + value1);
        System.out.println("남자 : " + name1);

        Gender gender2 = Gender.WOMAN;
        int value2 = gender2.getValue();
        String name2 = gender2.getName();
        System.out.println("여자 : " + value2);
        System.out.println("여자 : " + name2);

    }

}
