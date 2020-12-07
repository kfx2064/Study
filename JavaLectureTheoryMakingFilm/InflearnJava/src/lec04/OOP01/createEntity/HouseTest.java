package lec04.OOP01.createEntity;

public class HouseTest {
	
	public static void main(String[] args) {
		
		House house = new House();
		House houseAnother = new House();
		System.out.println("에어컨1 : " + house.airconStat);
		System.out.println("에어컨2 : " + houseAnother.airconStat);
		
		house.airconOn();
		System.out.println("에어컨1 : " + house.airconStat);
		System.out.println("에어컨2 : " + houseAnother.airconStat);
		
		house.airconOff();
		System.out.println("에어컨1 : " + house.airconStat);
		System.out.println("에어컨2 : " + houseAnother.airconStat);
		
	}

}
