import java.util.HashMap;
import java.util.Map;

public class AuthService {
    private Map<String, User> users = new HashMap<>();

    public void register(String email, String password) {
        users.put(email, new User(email, password));
    }

    public boolean login(String email, String password) {
        User user = users.get(email);
        return user != null && user.getPassword().equals(password);
    }

    public void restorePassword(String email) {
        if (users.containsKey(email)) {
            System.out.println("Reset token generated for: " + email);
        }
    }
}
