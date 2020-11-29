package lec04.OOP15.second;

public class China extends Country {

    public String special = "넓고 인구가 많다.";

    public void showDefault() {
        String species = super.species;
        String haveMust = super.haveMust;
        System.out.println("종 : " + species);
        System.out.println("필요한 것 : " + haveMust);
    }

    @Override
    public void mainEat() {
        System.out.println("두유와 꽈배기를 먹는다.");
    }
}
