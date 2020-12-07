package ver2_lec02;

public class ProgramInterfaceImpl implements ProgramInterface {

	@Override
	public void start() {
		System.out.println("프로그램을 시작합니다.");
	}

	@Override
	public void stop() {
		System.out.println("프로그램을 멈춥니다.");
	}

	@Override
	public void run() {
		System.out.println("프로그램을 실행합니다.");
	}

	@Override
	public void shutdown() {
		System.out.println("프로그램 실행을 멈춥니다.");
	}
	
}
