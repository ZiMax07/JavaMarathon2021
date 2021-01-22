package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.printf("Введите 2 числа: \n 1 число - делимое \n 2 число - делитель\n");
        while (true){
            double result;
            Double dividend = console.nextDouble(); //делимое
            Double divider = console.nextDouble(); //делитель
            if (divider == 0){
                System.out.println("Деление на 0. Работа программы завершена");
                break;
            }
            result = dividend / divider;
            System.out.println(dividend + " : " + divider + " = " + result);
    }
}}
