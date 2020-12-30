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

            /**
             * 가상의 노끈 공장을 구현해 봤습니다.
             * 실제 공장의 업무 로직은 작은 공장이라 하더라도
             * 체계적이고 복잡한 편입니다.
             * 보통은 자재 입고 -> 자재 출고 -> 공정 투입 ->
             * 제조공정 진행 -> 제품 완성 -> 제품 포장 ->
             * 제품 창고 보관 -> 고객사 출하  의 과정을 거칩니다.
             * 제가 이 과정을 아는 이유는 경력 중에
             * 스마트팩토리 구축사업도 있었기 때문이죠.
             *
             * 그 과정을 단순화시켜서 쓰레드로 구현해 봤습니다.
             * 본래는 쓰레드가 아닙니다.
             * 서버 컴퓨터에서 웹 프로그램이 구동되어 있고
             * 사용자의 입력과 출력, 기계의 입력과 출력에 따라
             * 그때그때마다 반응하여 동작합니다.
             *
             * 하지만 우리는 아직 웹을 배우지 않았습니다.
             * 그래서 자바 쓰레드로 구현해 봤습니다.
             *
             * 한 번 동작시켜 보죠.
             */
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
