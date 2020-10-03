package lec04.OOP.createEntity.procurement;

public class ProcureDocumentTest {

    public static void main(String[] args) {

        ProcureDocument procureDocument = new ProcureDocument();

        procureDocument.procureNo = "20201003001";
        procureDocument.procureItemNm = "나무젓가락";

        procureDocument.printInfo();

    }

}
