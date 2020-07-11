package ch09.part01.main4;

public class Parent {

    protected String name = "parent";
    public int value = 1;
    private Type type = Type.A;

    public enum Type {
        A, B, C, D
    };
}
