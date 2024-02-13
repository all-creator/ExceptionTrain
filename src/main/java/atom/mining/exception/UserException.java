package atom.mining.exception;

import java.util.function.Supplier;

public class UserException extends SomeException {
    public UserException(String message) {
        super(message);
    }
}
