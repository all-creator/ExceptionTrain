package atom.mining.model;

public class User {

    private String username;
    private int age;
    private boolean isLock;
    private String role;

    public User(String username, int age, boolean isLock, String role) {
        this.username = username;
        this.age = age;
        this.isLock = isLock;
        this.role = role;
    }

    public User(int age, boolean isLock, String role) {
        this.age = age;
        this.isLock = isLock;
        this.role = role;
    }

    public User(String username) {
        throw new UnsupportedOperationException("Not valid");
    }


}
