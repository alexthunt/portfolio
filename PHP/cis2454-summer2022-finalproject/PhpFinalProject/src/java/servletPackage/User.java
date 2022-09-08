package servletPackage;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {

    private String userName;
    private String password;
    private final ArrayList<Tweet> tweets;
    private final ArrayList<String> followed;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.tweets = new ArrayList<>();
        this.followed = new ArrayList<>();
    }

    public void addFollowed(String userName) {
        followed.add(userName);
    }

    public void removeFollowed(String username) {
        int index = 0;
        for (String name : followed) {
            if (name.equalsIgnoreCase(username)) {
                followed.remove(index);
            }
            index++;
        }
    }

    public ArrayList<String> getFollowed() {
        return followed;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Tweet> getTweets() {
        return tweets;
    }

    public void addTweet(Tweet tweet) {
        tweets.add(tweet);
    }

}
