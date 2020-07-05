package ch07.part06.main4.sub2;

public class TypeA {

    private String name = "테스트";
    private int value = 1;

    public TypeA() {

    }

    public TypeA(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "TypeA[" +
                "name='" + name + '\'' +
                ", value=" + value +
                ']';
    }
}
