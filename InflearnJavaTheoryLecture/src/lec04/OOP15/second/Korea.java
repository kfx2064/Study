package lec04.OOP15.second;

public class Korea extends Country {

    public String special = "분단국가며 휴전국가이다.";

    public void showDefault() {
        String species = super.species;
        String haveMust = super.haveMust;
        System.out.println("종 : " + species);
        System.out.println("필요한 것 : " + haveMust);
    }

    @Override
    public void mainEat() {
        System.out.println("밥과 김치를 먹는다.");
    }
}
