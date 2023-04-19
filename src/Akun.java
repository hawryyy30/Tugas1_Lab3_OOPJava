import java.util.ArrayList;

public class Akun {
    private ArrayList<User> user;

    public Akun() {
        this.user = new ArrayList<>();
    }

    public boolean cekAkun(String username, String password) {
        for (User user : this.user) {
            if (username.equals(user.getUsername()) && password.equals(user.getPassword())) {
                return true;
            }
        }
        return false;
    }

    public User login(String username, String password) {
        for (User user : this.user) {
            if (username.equals(user.getUsername()) && password.equals(user.getPassword())) {
                return user;
            }
        }
        return null;

    }

    public void register(User user) {
        this.user.add(user);
    }

}