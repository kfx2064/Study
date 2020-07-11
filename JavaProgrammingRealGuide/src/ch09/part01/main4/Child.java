package ch09.part01.main4;

public class Child extends Parent {

    private int value = 2;
    {
        System.out.println("name = " + name);
        System.out.println("value = " + value);

        System.out.println("super.name = " + super.name);
        System.out.println("super.value = " + super.value);

        System.out.println("this.name = " + this.name);
        System.out.println("this.value = " + this.value);

        System.out.println("Type.A = " + Type.A);
    }

    public static void main(String[] args) {
        new Child();
    }

}
