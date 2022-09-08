package servletPackage;

import java.io.Serializable;
import java.util.Random;

public class Tweet implements Serializable {

    private String tweetText;
    private String tweetImagePath;
    private int likeCount;

    public Tweet(String tweetText) {
        Random rand = new Random();
        int upper = 5;
        int randomNumber = rand.nextInt(upper);
        this.tweetText = tweetText;
        this.tweetImagePath = null;
        this.likeCount = randomNumber;
    }

    public void addLike() {
        likeCount++;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public Tweet(String tweetText, String tweetImagePath) {
        Random rand = new Random();
        int upper = 5;
        int randomNumber = rand.nextInt(upper);
        this.tweetText = tweetText;
        this.tweetImagePath = tweetImagePath;
        this.likeCount = randomNumber;
    }

    public String getTweetText() {
        return tweetText;
    }

    public void setTweetText(String tweetText) {
        this.tweetText = tweetText;
    }

    public String getTweetImagePath() {
        return tweetImagePath;
    }

    public void setTweetImagePath(String tweetImagePath) {
        this.tweetImagePath = tweetImagePath;
    }

}
