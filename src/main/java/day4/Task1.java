package day4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите любое положителное и целое число");
        int n = console.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random()*10)+1;
            System.out.print(array[i] + " / ");
        }
        System.out.println("\nДлина массива : " + array.length);
        int countMore8 = 0;
        int countEqually1 = 0;
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] < 8){
                countMore8++;
            }
            if (array[i] == 1){
                countEqually1++;
            }
            if (array[i] % 2 == 0){
                countEven++;
            } else {countOdd++;}

        }
        int sum = 0;
        for(int number : array){
            sum = sum + number;
        }
        System.out.println("Количество чисел больше 8    : " + countMore8);
        System.out.println("Количество чисел равных 1    : " + countEqually1);
        System.out.println("Количество четных чисел      : " + countEven);
        System.out.println("Количество нечетных чисел    : " + countOdd );
        System.out.println("Сумма всех элементов массива : " + sum);


        }
    }
