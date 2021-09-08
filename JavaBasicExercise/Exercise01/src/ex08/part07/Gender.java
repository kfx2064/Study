package ex08.part07;

public enum Gender {

    MAN(1, "남자"), WOMAN(2, "여자");

    private int value;
    private String name;

    private Gender(int value, String name) {
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
