package lec04.OOP15.first;

public class Main {

    public static void main(String[] args) {
        Hyundai hyundai = new Hyundai();
        KIA kia = new KIA();

        hyundai.howManyWheel();
        hyundai.howManyDoor();

        kia.howManyWheel();
        kia.howManyDoor();
    }

}
