package lec04.OOP15.first;

public class Hyundai extends CarParent {


    public void howManyWheel() {
        System.out.println(super.wheelCount);
    }

    public void howManyDoor() {
        System.out.println(super.doorCount);
    }

}
