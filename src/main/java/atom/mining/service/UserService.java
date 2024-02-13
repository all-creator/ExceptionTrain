package atom.mining.service;

import atom.mining.dao.UserCRUD;
import atom.mining.model.User;

public class UserService {
    private final UserCRUD userCRUD;

    public UserService(UserCRUD userCRUD) {
        this.userCRUD = userCRUD;
    }

    public void createUser(String name) {
        userCRUD.createUser(name);
    }

    public void getUser() {
        userCRUD.getUser();
    }

    public User updateUser() {
        return userCRUD.updateUser().orElseThrow(new Exception("user not updated")); // 16 Exception следует заменить на UserException
        // имплементирующую java.util.function.Supplier<T> через SomeException или напрямую в случае решения об удалении SomeException.
    }

    public void delete() {
        userCRUD.delete();
    }
}
