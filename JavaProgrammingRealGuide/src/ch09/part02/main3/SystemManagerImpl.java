package ch09.part02.main3;

public class SystemManagerImpl implements ISystemManager {

    @Override
    public void start() {
        System.out.println("system start()");
    }

    @Override
    public void stop() {
        System.out.println("system stop()");
    }

    @Override
    public void status() {
        System.out.println("system status()");
    }

    public static void main(String[] args) {
        SystemManagerImpl systemManager = new SystemManagerImpl();
        systemManager.start();
        systemManager.status();
        systemManager.stop();
    }

}
