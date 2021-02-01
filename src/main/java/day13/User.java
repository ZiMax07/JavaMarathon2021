package day13;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String userName;
    private List<User> subscriptions;
    private List<User> friendList;

    public User(String userName){
        this.userName = userName;
        this.subscriptions = new ArrayList<>();
        this.friendList = new ArrayList<>();
    }

    public String getUserName() {
        return userName;
    }
    public List<User> getSubscriptions() {
        return subscriptions;
    }
    public List<User> getFriendList() {
        return friendList;
    }

    public void subscribe(User user){
        subscriptions.add(user);
    }
    public boolean isSubscribed(User user){
        return subscriptions.contains(user);
    }
    public boolean isFriend(User user){
        return friendList.contains(user);
    }

    public void sendMessage(User user, String text){
        MessageDatabase.addNewMessage(new User(getUserName()), user, text);
    }

    public String toString(){
        return "Имя пользователя : " + userName;
    }
}
