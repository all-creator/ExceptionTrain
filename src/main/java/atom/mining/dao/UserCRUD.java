package atom.mining.dao;

import atom.mining.exception.ErrorEcxeption;
import atom.mining.exception.UserException;
import atom.mining.model.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class UserCRUD {

   private static final Map<String, User> users = new HashMap<>();

    public void createUser(String name) { // 10
        new User(name);
    }

    public void getUser() { // 11
        throw new ErrorEcxeption("User not found")
    }

    public Optional<User> updateUser() {
        return new User("")
    }

    public void delete() {
        throw UserException
    }

}
