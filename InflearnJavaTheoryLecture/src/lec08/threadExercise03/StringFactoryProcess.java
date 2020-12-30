package lec08.threadExercise03;

import java.util.*;

public class StringFactoryProcess {

    public static Queue<String> rawMaterialPlasticList = new LinkedList<>();
    public static Queue<Map<String, Integer>> productStringList = new LinkedList<>();
    public static Queue<Map<Integer, Map<String, Integer>>> inputList = new LinkedList<>();

    public static void main(String[] args) {
        RawMaterialInputProcess rawMaterialInputProcess = new RawMaterialInputProcess();
        Thread rawMaterialThread = new Thread(rawMaterialInputProcess);
        ProductMakeProcess productMakeProcess = new ProductMakeProcess();
        InputWareHouse inputWareHouse = new InputWareHouse();

        try {
            rawMaterialThread.setPriority(5);
            productMakeProcess.setPriority(5);
            inputWareHouse.setPriority(5);

            rawMaterialThread.start();
            productMakeProcess.start();
            inputWareHouse.start();

            Thread.sleep(12000);
            rawMaterialInputProcess.setStop(true);
            productMakeProcess.setStop(true);

            Thread.sleep(1000);
            System.out.println("[[[ 생산 결과 ]]]");
            System.out.println(rawMaterialPlasticList);
            System.out.println(productStringList);
            System.out.println(inputList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
