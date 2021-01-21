package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        if (a >= b) {
            System.out.println("Некорректный ввод");
        }
        int c = a + 1;
        while (c < b) {
            if (c % 5 == 0 && c % 10 != 0) {
                System.out.println(c);
                c++;
            }
        }
    }
}
