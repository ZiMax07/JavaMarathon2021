package day13;

import java.util.Date;

public class Message {

    private String sender;
    private String receiver;
    private String text;
    private Date date;

    public Message(String sender, String receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.date = new Date();
    }

    public String getSender() {
        return sender;
    }
    public String getReceiver() {
        return receiver;
    }
    public String getText() {
        return text;
    }
    public Date getDate() {
        return date;
    }

    @Override
    public  String toString(){
        return "FROM : " + sender +
                "\nTO : " + receiver +
                "\nON : " + date +
                "\nMESSAGE : " + text;
    }
}
