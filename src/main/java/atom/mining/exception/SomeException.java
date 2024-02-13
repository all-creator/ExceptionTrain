package atom.mining.exception;

public class SomeException extends Exception { // 4 Класс не имеет смысла, должен реализовывать общую логику исключений (в нашем случае)
    // или быть удалён
    public SomeException(String message) {
        super(message);
    }
}
