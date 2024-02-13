package atom.mining.dao;

import atom.mining.exception.ErrorEcxeption;
import atom.mining.exception.UserException;
import atom.mining.model.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class UserCRUD {

   private static final Map<String, User> users = new HashMap<>();

    public void createUser(String name) { // 10 Метод должен возвращать созданного пользователя и класть его в users
        new User(name);
    }

    public void getUser() { // 11 Метод должен возвращать полученного пользователя, и принимать username, а так же пробрасывать ошибку
        throw new ErrorEcxeption("User not found"); // 7 ошибка не подходит по контексту и должна отрабатвать не всегда,
        // а только в случае если пользователь не найден (см. текст ошибки) (иметь логический смысл).
    }
    public Optional<User> updateUser() { // 12 метод должен возвращать Optional обновлённого юзера и принимать ключ по которому будет происходить поиск
        return new User(""); // 15 Метод должен обарачивать значения в Optional
    }

    public void delete() { //13 метод должен принимать ключ по которому будет происходить удаление и удалять объект из users
        throw UserException; // 6 не верное объявление ошибки, ошибка должна содержать пояснительный текст и иметь логический смысл
    }

}
