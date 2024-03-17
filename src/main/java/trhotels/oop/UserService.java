package trhotels.oop;

import java.util.List;
import java.util.Optional;

public class UserService {
    private List<User> users;

    public UserService(List<User> users) {
        this.users = users;
    }

    public User addUser(User newUser) {
        users.add(newUser);
        return newUser;
    }

    public Optional<User> getUserbyEmail(String email) {
        return users.stream()
            .filter(user -> user.getEmail().equals(email))
            .findFirst();
    }

    public boolean deleteUser(User user) {
        return users.remove(user);
    }
}
