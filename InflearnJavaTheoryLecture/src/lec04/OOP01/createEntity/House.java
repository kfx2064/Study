package lec04.OOP01.createEntity;

public class House {

    public String airconStat = "off";
    public String heatStat = "off";
    public String doorStat = "close";

    public void airconOn() {
        airconStat = "on";
    }

    public void airconOff() {
        airconStat = "off";
    }

}
