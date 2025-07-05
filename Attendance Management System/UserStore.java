import java.util.HashMap;

public class UserStore {
    public static HashMap<String, String[]> users = new HashMap<>();

    static {
        users.put("admin", new String[]{"admin123", "Admin"});
        users.put("student", new String[]{"student123", "Student"});
    }

    public static boolean register(String username, String password, String role) {
        if (users.containsKey(username)) return false;
        users.put(username, new String[]{password, role});
        return true;
    }

    public static String[] login(String username, String password) {
        if (users.containsKey(username)) {
            String[] info = users.get(username);
            if (info[0].equals(password)) return info;
        }
        return null;
    }

    public static boolean exists(String username) {
        return users.containsKey(username);
    }
}