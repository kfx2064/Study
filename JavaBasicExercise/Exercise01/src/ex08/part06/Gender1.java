package ex08.part06;

public enum Gender1 {

    MAN(1, "남자"), WOMAN(2, "여자");

    private int value;
    private String name;

    private Gender1(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

}
