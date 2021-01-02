package lec08.threadExercise03;

public class RawMaterialInputProcess implements Runnable {

	protected boolean stop = false;
	protected int count = 1;
	protected String rawMaterialName = "플라스틱";
	
	public void setStop(boolean isStop) {
		stop = isStop;
	}
	
	@Override
	public void run() {
		System.out.println("원재료 투입 공정이 시작되었습니다.");
		while (stop == false) {
			try {
				synchronized (StringFactoryProcess.rawMaterialPlasticList) {
					int rawMaterialListSize = StringFactoryProcess.rawMaterialPlasticList.size();
					if (rawMaterialListSize > 9) {
						System.out.println("원재료 투입을 일시 중지합니다.");
						Thread.sleep(1000);
						continue;
					} else if (rawMaterialListSize > 0 && rawMaterialListSize < 10) {
						inputRawMaterialWork(count);
						System.out.println("원재료가 투입되었습니다.");
					} else if (rawMaterialListSize == 0) {
						inputRawMaterialWork(count);
						System.out.println("원재료가 투입되었습니다.");
					}
					Thread.sleep(1000);
					System.out.println("[[중간재 대기열]]" + StringFactoryProcess.rawMaterialPlasticList);
					count++;
				}
			} catch (Exception e) {
				System.out.println("원재료 투입 공정에 문제가 생겼습니다.");
				e.printStackTrace();
				break;
			}
		}
	}
	
	public void inputRawMaterialWork(int count) {
		String inputRawMaterial = rawMaterialName + " " + count;
		StringFactoryProcess.rawMaterialPlasticList.add(inputRawMaterial);
	}

}
