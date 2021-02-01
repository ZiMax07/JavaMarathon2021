package day13;

public class Task1 {
    public static void main(String[] args){

        User user1 = new User("Alex");
        User user2 = new User("John");
        User user3 = new User("Василий");

        user1.sendMessage(user2, "Hi");
        user1.sendMessage(user2, "Dude.. Wake up!!");
        user2.sendMessage(user1,"Hi, BROOOOoo");
        user2.sendMessage(user1, "I'm not sleeping");
        user2.sendMessage(user1, "Learn JAVA =P");
        user3.sendMessage(user1, "Привет, давай знакомиться?");
        user3.sendMessage(user1,"Я, Вася. Живу в России.");
        user3.sendMessage(user1,"А ты где живешь?");
        user1.sendMessage(user3, "Hi... I don't understand u");
        user1.sendMessage(user3, "speak english pls");
        user1.sendMessage(user3, "u russian mafia???");
        user3.sendMessage(user1, "YES");

        MessageDatabase.showDialog(user1,user3);
    }
}
