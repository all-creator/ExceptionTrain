package atom.mining.exception;

public class Exception { // 3 System.err
    public Exception(String message) {
        System.err.println(message);
        for (StackTraceElement s : Thread.currentThread().getStackTrace()) {
            System.err.println(s.toString());
        }
    }
}
