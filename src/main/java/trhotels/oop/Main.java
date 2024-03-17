package trhotels.oop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<User>();
        IUserManager userManager = new UserService(users);

        // Register a new user
        userManager.registerUser("John Doe", "john.doe@example.com", "password123", "1234567890", new Location("Istanbul", null, "Turkey", "Blabla Street"));

        // Login a user
        User user = userManager.authenticateUser("john.doe@example.com", "password123");

        // Now you can use the 'user' object
        if (user != null) {
            System.out.println("User logged in: " + user.getUsername());
        } else {
            System.out.println("Invalid login credentials");
        }
    }
}