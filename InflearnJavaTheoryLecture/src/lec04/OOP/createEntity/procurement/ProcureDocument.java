package lec04.OOP.createEntity.procurement;

public class ProcureDocument {

    public String procureNo;
    public String procureItemNm;

    public void printInfo() {
        System.out.println("구매번호는 : " + procureNo);
        System.out.println("구매품목명은 : " + procureItemNm);
    }

}
