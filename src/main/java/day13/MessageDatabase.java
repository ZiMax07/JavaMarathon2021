package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {

    private static List<Message> messages = new ArrayList<>();
    private static Message message;

    public static void addNewMessage(User u1, User u2, String text){
        message = new Message(u1.getUserName(),u2.getUserName(),text);
        messages.add(message);
    }
    public static List<Message> getMessages(){
        return messages;
    }
    public static void showDialog(User u1, User u2){
        for (Message message : getMessages()){
            if (u1.getUserName().equals(message.getSender())){
                if(u2.getUserName().equals(message.getReceiver())){
            System.out.println(message.getSender() + " : " + message.getText());
                }
            } else if(u2.getUserName().equals(message.getSender())){
                if (u1.getUserName().equals(message.getReceiver())){
                    System.out.println(message.getSender() + " : " + message.getText());
                }
            }
        }
    }
}
