package ua.edu.ucu.apps.task1;

public class Auth {
    public User login(boolean isTwitter){
        if (isTwitter){
            return new MyTwitterUser(new TwitterUser());
        }
        else{
            return new MyFacebookUser(new FacebookUser());
        }
    }

    public void processData(User user){
        // do something
    }
}
