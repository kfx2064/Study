package ex08.part06;

public class TestMain1 {

    public static void main(String[] args) {

        Gender1 gender1 = Gender1.MAN;
        int value1 = gender1.getValue();
        String name1 = gender1.getName();
        System.out.println("남 : " + value1);
        System.out.println("남 : " + name1);

        Gender1 gender2 = Gender1.WOMAN;
        int value2 = gender2.getValue();
        String name2 = gender2.getName();
        System.out.println("여 : " + value2);
        System.out.println("여 : " + name2);

    }

}
