//Imports

public class User {
    private String username;
    private String password;
    private boolean isAdmin;

    public User(String username, String password, boolean isAdmin) {
        this.username = username;
        // For simplicity, storing plain text password (NOT recommended for production)
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    // Other methods for role-based actions, profile management, etc.

    // Security: Hashing the password before storing it (use a more secure algorithm
    // in production)
}
