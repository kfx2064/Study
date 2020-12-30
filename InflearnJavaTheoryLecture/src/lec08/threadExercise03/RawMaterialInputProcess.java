package lec08.threadExercise03;

/**
 * Thread를 활용하는 가상의 공장 제조 공정을 만들어 보겠습니다.
 * 원재료 투입은 30분마다, 원재료로 제품 제조는 1시간마다,
 * 창고로 이동은 2시간마다 이루어지는 공정을 만들어 보겠습니다.
 * 30분은 500밀리세컨드, 1시간은 1초, 2시간은 2초로 가정하겠습니다.
 *
 * 원재료가 10개가 채워지면 원재료 투입 공정은 일시 멈춤을 합니다.
 * 원재료가 2개까지 낮아지면 원재료 투입 공정은 다시 동작합니다.
 */
public class RawMaterialInputProcess implements Runnable {

    protected boolean stop = false;

    protected String rawMaterailName = "플라스틱";

    public void setStop(boolean isStop) {
        stop = isStop;
    }

    @Override
    public void run() {
        int count = 1;
        while (stop == false) {
            try {

                synchronized (StringFactoryProcess.rawMaterialPlasticList) {
                    // 원재료의 개수가 10개인지 확인합니다.
                    /*
                    9개보다 크면 10개가 다 찬 것이므로 투입을 멈춥니다.
                    1개 초과이고 10개 미만이면 재시작 공정이므로 투입을 시작합니다.
                    리스트에 아무 것도 없어도 초반 시작 공정이므로 투입을 시작합니다.
                     */
                    int rawMaterialListSize = StringFactoryProcess.rawMaterialPlasticList.size();
                    if (rawMaterialListSize > 9) {
                        Thread.sleep(500);
                        continue;
                    } else if (rawMaterialListSize > 1  && rawMaterialListSize < 10) {
                        inputRawMaterialWork(count);
                    } else if (rawMaterialListSize == 0){
                        inputRawMaterialWork(count);
                    }

                    Thread.sleep(500);
                }

            } catch (Exception e) {
                System.out.println("원재료 투입 공정에 문제가 생겼습니다.");
                e.printStackTrace();
                break;
            }
        }
    }

    public void inputRawMaterialWork(int count) {
        String inputRawMaterial = rawMaterailName + " " + count;
        StringFactoryProcess.rawMaterialPlasticList.add(inputRawMaterial);
    }

}
