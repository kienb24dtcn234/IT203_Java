public class User {
    private String id;
    private String username;
    private String password;
    private String email;

    public User(String id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        setPassword(password);
        setEmail(email);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password != null && !password.trim().isEmpty()) {
            this.password = password;
        } else {
            System.out.println("Password không được rỗng!");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null && email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
            this.email = email;
        } else {
            System.out.println("Email không hợp lệ!");
        }
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Password: ********");
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        User u1 = new User("U01", "kien", "12342356", "kien@gmail.com");
        User u2 = new User("U02", "admin", "", "admin@gmail.com");
        User u3 = new User("U03", "test", "abc12312", "email_sai");

        u1.display();
        u2.display();
        u3.display();

        u1.setPassword("");
        u1.setEmail("saiemail");
        u1.display();
    }
}
