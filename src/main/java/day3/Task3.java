package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите 2 числа: \n 1 число - делимое \n 2 число - делитель\n");
        int count = 0;
        while (count < 5){
            double result;
            double dividend = console.nextDouble(); //делимое
            double divider = console.nextDouble(); //делитель
            if (divider == 0){
                System.out.println("Деление на 0");
                count++;
                continue;
            }
            result = dividend / divider;
            System.out.println(dividend + " : " + divider + " = " + result);
            count++;
        }
    }
}
