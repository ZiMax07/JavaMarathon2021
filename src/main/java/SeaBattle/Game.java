package SeaBattle;

public class Game {

    public static void main(String[] args) {

        double x = Math.random()*2;

        PlayBoard player1 = new PlayBoard("Макс");
        PlayBoard player2 = new PlayBoard("Лида");

        if (x > 1){
            System.out.println("Первый ходит игрок : " + player1.getName());
            player1.game();
            player2.game();
        } else {
            System.out.println("Первый ходит игрок : " + player2.getName());
            player2.game();
            player1.game();
        }

        if (x > 1){
            while (player1.getValueOfShips() !=0 || player2.getValueOfShips() != 0){
            player1.shoot(player2);
            player2.shoot(player1);
            }
        } else {
            while (player1.getValueOfShips() !=0 || player2.getValueOfShips() != 0){
            player2.shoot(player1);
            player1.shoot(player2);
            }
        }
    }
}
