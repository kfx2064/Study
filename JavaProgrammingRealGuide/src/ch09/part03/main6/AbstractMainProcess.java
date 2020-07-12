package ch09.part03.main6;

public abstract class AbstractMainProcess {

    public abstract void setConfig();

    public abstract IProcess[] addProcesses();

    public final void main() {
        setConfig();

        IProcess[] processes = addProcesses();
        if (processes != null) {
            for (IProcess p : processes) {
                p.execute();
            }
        }
    }

    public interface IProcess {
        public void execute();
    }

}
