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
        player1.runRunRun(95);
        player2.runRunRun(97);
        player3.runRunRun(100);
        player4.runRunRun(91);
        player5.runRunRun(96);
        player6.runRunRun(90);
        Player.info();

    }
}
