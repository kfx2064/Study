package lec05.abstractPacakge.first;

public class MainComp {

    public static void main(String[] args) {

        SSIComp ssiComp = new SSIComp();
        LGComp lgComp = new LGComp();
        HHIComp hhiComp = new HHIComp();

        ssiComp.showCompName();
        ssiComp.showLoc();

        lgComp.showCompName();
        lgComp.showLoc();

        hhiComp.showCompName();
        hhiComp.showLoc();

    }

}
