package finalProject.SeaBattle;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введить имя Игрока №1");
        String name1 = scanner.nextLine();
        System.out.println("Введить имя Игрока №2");
        String name2 = scanner.nextLine();

        double x = Math.random()*2;

        PlayBoard player1 = new PlayBoard(name1);
        PlayBoard player2 = new PlayBoard(name2);

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
            while (true){
            player1.shoot(player2);
            if (player2.getValueOfShips() == 0){
                break;
            }
            player2.shoot(player1);
                if (player1.getValueOfShips() == 0){
                    break;
                }
            }
        } else {
            while (true){
            player2.shoot(player1);
            if (player1.getValueOfShips() == 0) {
                break;
            }
                player1.shoot(player2);
                if (player2.getValueOfShips() == 0){
                    break;
                }
            }
        }
    }
}
