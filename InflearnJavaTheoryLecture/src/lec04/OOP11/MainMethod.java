package lec04.OOP11;

public class MainMethod {

    public static void main(String[] args) {

        OverloadingExam overloadingExam = new OverloadingExam();

        int calculate = overloadingExam.calculate();
        int over1 = overloadingExam.calculate(1, 2);
        long over2 = overloadingExam.calculate(1, 3l);
        long over3 = overloadingExam.calculate(1l, 3);
        long over4 = overloadingExam.calculate(2l, 3l);

        System.out.println("calculate : " + calculate);
        System.out.println("over1 : " + over1);
        System.out.println("over2 : " + over2);
        System.out.println("over3 : " + over3);
        System.out.println("over4 : " + over4);

    }

}
