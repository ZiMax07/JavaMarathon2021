package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    int floors = console.nextInt();
    if (floors <= 4 && floors > 0){
        System.out.println("Малоэтажный дом");
    } else if(floors >= 5 && floors < 9){
        System.out.println("Среднеэтажный дом");
    } else if (floors >= 9) {
        System.out.println("Многоэтажный дом");
    } else {
        System.out.println("Ошибка ввода");
    }

    }
}
