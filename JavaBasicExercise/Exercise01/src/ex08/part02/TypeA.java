package ex08.part02;

public class TypeA {

    public enum GenderType {
        MAN, WOMAN
    };

    private GenderType genderType;

    public GenderType getGenderType() {
        return genderType;
    }

    public void setGenderType(GenderType genderType) {
        this.genderType = genderType;
    }

}
