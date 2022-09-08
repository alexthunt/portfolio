package servletPackage;

import java.io.Serializable;
import java.util.ArrayList;

public class TwitterState implements Serializable {
    private final ArrayList<User> users;
    private int userIndex;
    private boolean loggedIn;

    public TwitterState() {
        this.users = new ArrayList<>();
        this.loggedIn = false;
        this.userIndex = -1;
    }

    public void addUser(String username, String password) {
        User user = new User(username, password);
        users.add(user);
    }
    
    public ArrayList<User> getUsers() {
        return users;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    public int getUserIndex() {
        return userIndex;
    }

    public void setUserIndex(int userIndex) {
        this.userIndex = userIndex;
    }
    
    
    
}
