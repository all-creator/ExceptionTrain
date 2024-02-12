package atom.mining;

import atom.mining.dao.UserCRUD;
import atom.mining.model.User;
import atom.mining.service.UserService;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Main {
    private final UserService service;

    public Main(UserService service) {
        this.service = service;
    }

    private void start() throws IOException {
        try (var bs = new ByteArrayInputStream(new byte[10])) { // 14
            System.out.println("Test create User");
            service.createUser("all");
            System.out.println("User created: " + service.getUser());
            System.out.println("Test get User");
            System.out.println("User found: " + service.getUser());
            System.out.println("Test update User");
            service.updateUser(new User("all", 10));
            System.out.println("User updated: " + service.getUser());
            System.out.println("Test delete User");
            service.delete();
            System.out.println("User not found: " + service.getUser());
        }
    }

    public static void main(String[] args) {
        new Main(new UserService(new UserCRUD())).start(); // 15
    }
}