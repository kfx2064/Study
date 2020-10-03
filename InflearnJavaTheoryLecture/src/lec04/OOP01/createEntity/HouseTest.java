package lec04.OOP01.createEntity;

public class HouseTest {

    public static void main(String[] args) {

        House house = new House();
        System.out.println("에어컨 : " + house.airconStat);

        house.airconOn();
        System.out.println("에어컨 : " + house.airconStat);

        house.airconOff();
        System.out.println("에어컨 : " + house.airconStat);

    }

}
