package ch07.part04.main2;

public enum Gender {

    MAN(1, "남자"), WOMAN(2, "여자");

    public int value;
    public String name;

    private Gender(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
