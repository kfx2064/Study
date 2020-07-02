package ch07.part04.main1;

public class TypeA {

    public enum GenderType {
        MAN, WOMAN
    };

    private GenderType genderType;

    public GenderType genderType() {
        return genderType;
    }

    public GenderType getGenderType() {
        return genderType;
    }

    public void setGenderType(GenderType genderType) {
        this.genderType = genderType;
    }
}
