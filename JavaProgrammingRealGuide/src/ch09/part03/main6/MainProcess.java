package ch09.part03.main6;

public class MainProcess extends AbstractMainProcess {

    @Override
    public void setConfig() {
        System.out.println("MainProcess 환경설정");
    }

    @Override
    public IProcess[] addProcesses() {
        IProcess process1 = new Process1();
        IProcess process2 = new Process2();
        IProcess process3 = new Process3();
        return new IProcess[]{process1, process2, process3};
    }

    public static void main(String[] args) {
        MainProcess mainProcess = new MainProcess();
        mainProcess.main();
    }
}
