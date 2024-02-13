package atom.mining.exception;

public class Exception { // 3 Класс реализует собственную логику исключений, должен быть удалён и заменён на java.lang.Exception
    public Exception(String message) {
        System.err.println(message);
        for (StackTraceElement s : Thread.currentThread().getStackTrace()) {
            System.err.println(s.toString());
        }
    }
}
