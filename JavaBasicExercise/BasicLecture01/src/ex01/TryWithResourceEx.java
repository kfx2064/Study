package ex01;

class CloseableResource implements AutoCloseable {

    public void exceptionWork(boolean exception) throws WorkException {
        System.out.println("exceptionWork(" + exception + ")가 호출됨.");
        System.out.println(1);
        if(exception) {
            System.out.println(2);
            throw new WorkException("첫 번째 WorkException 발생");
        }
    }

    @Override
    public void close() throws CloseException {
        System.out.println("close()가 호출됨");
        throw new CloseException("두 번째 CloseException발생!!!");
    }
}

class WorkException extends Exception {
    WorkException(String msg) { super(msg); }
}

class CloseException extends Exception {
    CloseException(String msg) { super(msg); }
}

public class TryWithResourceEx {

    public static void main(String[] args) throws Exception {

        System.out.println();

        try (CloseableResource cr = new CloseableResource()) {
            System.out.println("a");
            cr.exceptionWork(true);
        } catch (WorkException e) {
            System.out.println("b");
            e.printStackTrace();
        } catch (CloseException e) {
            System.out.println("c");
            e.printStackTrace();
        }

    }

}
