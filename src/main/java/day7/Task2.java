package day7;

public class Task2 {
    public static void main(String[] args) {
        Player player1 = new Player(Player.getRandomStamina());
        Player player2 = new Player(Player.getRandomStamina());
        Player player3 = new Player(Player.getRandomStamina());
        Player player4 = new Player(Player.getRandomStamina());
        Player player5 = new Player(Player.getRandomStamina());
        Player player6 = new Player(Player.getRandomStamina());
        Player.info();
        Player player7 = new Player(Player.getRandomStamina());
        Player player8 = new Player(Player.getRandomStamina());
        System.out.println("Сейчас на поле " + Player.getCountPlayer() + " игроков");
        player1.run(95);
        player2.run(97);
        player3.run(100);
        player4.run(91);
        player5.run(96);
        player6.run(90);
        Player.info();

    }
}
