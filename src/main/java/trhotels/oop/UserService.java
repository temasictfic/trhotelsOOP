package trhotels.oop;

import java.util.List;
import java.util.Optional;

public class UserService implements IUserManager {
    private List<User> users;

    public UserService(List<User> users) {
        this.users = users;
    }

    @Override
    public void registerUser(String username, String email, String password, String phoneNumber, Location location) {
        User newUser = new User(username, email, password, phoneNumber, location);
        users.add(newUser);
        System.out.println("User registered: " + newUser.getUsername());
    }

    @Override
    public User authenticateUser(String email, String password) {
        Optional<User> user = users.stream()
            .filter(u -> {
                boolean matches = u.getEmail().equals(email) && u.verifyPassword(password);
                System.out.println("Matching " + u.getEmail() + ": " + matches);
                return matches;
            })
            .findFirst();
        return user.orElse(null);
    }

    @Override
    public boolean deleteUser(User user) {
        return users.remove(user);
    }

    public Optional<User> getUserbyEmail(String email) {
        return users.stream()
            .filter(user -> user.getEmail().equals(email))
            .findFirst();
    }

}
