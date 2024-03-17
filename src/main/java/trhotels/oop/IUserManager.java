package trhotels.oop;

public interface IUserManager {
    void registerUser(String name, String email, String password, String phoneNumber, Location location);
    User authenticateUser(String email, String password);
    boolean deleteUser(User user);
}