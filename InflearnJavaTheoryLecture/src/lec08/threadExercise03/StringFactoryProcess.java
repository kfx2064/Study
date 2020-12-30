package lec08.threadExercise03;

import java.util.*;

public class StringFactoryProcess {

    public static Queue<String> rawMaterialPlasticList = new LinkedList<>();
    public static Queue<Map<String, Integer>> productStringList = new LinkedList<>();

    public static void main(String[] args) {
        RawMaterialInputProcess rawMaterialInputProcess = new RawMaterialInputProcess();
        Thread rawMaterialThread = new Thread(rawMaterialInputProcess);
        ProductMakeProcess productMakeProcess = new ProductMakeProcess();

        try {
            rawMaterialThread.setPriority(5);
            productMakeProcess.setPriority(5);

            rawMaterialThread.start();
            productMakeProcess.start();

            Thread.sleep(12000);
            rawMaterialInputProcess.setStop(true);
            productMakeProcess.setStop(true);

            Thread.sleep(1000);
            System.out.println("[[[ 생산 결과 ]]]");
            System.out.println(rawMaterialPlasticList);
            System.out.println(productStringList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
