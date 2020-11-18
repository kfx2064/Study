package lec04.OOP12;

public class OverridingChild extends OverridingParent {

    @Override
    public String showCompany() {
        String pStr = super.showCompany();
        pStr = "삼성" + pStr;
        return pStr;
    }

}
