package lec08.threadExercise03;

import java.text.SimpleDateFormat;
import java.util.Date;
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

        while (stop == false) {
            try {
                synchronized (StringFactoryProcess.productStringList) {
                    synchronized (StringFactoryProcess.rawMaterialPlasticList) {
                        /**
                         * 원재료를 추출합니다.
                         */
                        String rawMaterial = getRawMaterial();
                        /**
                         * 제품 고유 명칭을 생성합니다.
                         */
                        StringBuilder stringProductBuilder = new StringBuilder("노끈")
                                                                    .append("-")
                                                                    .append(strToday)
                                                                    .append("-")
                                                                    .append(makeProcessCount);

                        makeProcessCount++;
                    }
                }
            } catch (Exception e) {
                System.out.println("제품 제조 공정에 문제가 생겼습니다.");
                e.printStackTrace();
                break;
            }
        }
    }

    public String getRawMaterial() throws Exception {
        if (StringFactoryProcess.rawMaterialPlasticList.size() > 0) {
            return StringFactoryProcess.rawMaterialPlasticList.poll();
        } else {
            throw new Exception("원재료가 없습니다.");
        }
    }

    public Map<String, Integer> makeProduct(String rawMaterial, int makeProcessCount) {

    }

}
