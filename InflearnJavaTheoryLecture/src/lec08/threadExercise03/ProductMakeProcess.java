package lec08.threadExercise03;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ProductMakeProcess extends Thread {

    protected String productName = "노끈";
    private boolean stop = false;

    public void setStop(boolean isStop) {
        stop = isStop;
    }

    @Override
    public void run() {
        int makeProcessCount = 0;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        Date todayDate = new Date();
        String strToday = simpleDateFormat.format(todayDate);

        System.out.println("제품 제조 공정이 시작되었습니다.");

        while (stop == false) {
            try {
                /**
                 * 공정 최초 가동 시 장비 준비 절차에 1시간을 소요합니다.
                 * 여기서는 1초로 표현합니다.
                 */
                Thread.sleep(2000);

                /**
                 * 원재료를 추출합니다.
                 */
                String rawMaterial = getRawMaterial();
                System.out.println("중간재를 추출하였습니다.  " + rawMaterial);

                /**
                 * 제품 고유 명칭을 생성합니다.
                 */
                StringBuilder stringProductBuilder = new StringBuilder(productName)
                                                            .append("-")
                                                            .append(strToday)
                                                            .append("-")
                                                            .append(makeProcessCount);
                String newStringProduct = stringProductBuilder.toString();

                Map<String, Integer> productMap =
                        makeProduct(rawMaterial, newStringProduct, makeProcessCount);
                System.out.println("[[제품이 생산되었습니다.]]  " + makeProcessCount);
                StringFactoryProcess.productStringList.add(productMap);
                makeProcessCount++;
            } catch (Exception e) {
                System.out.println("제품 제조 공정에 문제가 생겼습니다.");
                e.printStackTrace();
                break;
            }
        }
        System.out.println("제품 제조 공정이 중지되었습니다.");
    }

    public synchronized String getRawMaterial() throws Exception {
        if (StringFactoryProcess.rawMaterialPlasticList.size() > 0) {
            return StringFactoryProcess.rawMaterialPlasticList.poll();
        } else {
            return "empty";
        }
    }

    public Map<String, Integer> makeProduct(String rawMaterial
                                            , String newStringProduct
                                            , int count) throws Exception {

        if (rawMaterial.equals("empty") == false) {
            Map<String, Integer> productMap = new HashMap<>();
            productMap.put(newStringProduct, count);
            return productMap;
        } else {
            throw new Exception("원재료가 없어서 제조 공정을 긴급 중단합니다.");
        }

    }

}
