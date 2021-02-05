package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        String separator = File.separator;
        File file = new File(separator + "C:" + separator + "Users" + separator + "wella" + separator + "Desktop"
                + separator + "Marathon" + separator + "JavaMarathon2021" + separator +
                "src" + separator + "main" + separator + "java" + separator + "day16" + separator + "numbers");

        printResult(file);


    }
        public static void printResult(File file) {
            try {
                Scanner scanner = new Scanner(file);

                int sum = 0;
                int count = 0;
                while (scanner.hasNextLine()){
                    sum += scanner.nextInt();
                    count++;
                }
                double average = (double) sum / count;
                String formattedDouble = new DecimalFormat("#0.000").format(average);
                System.out.println(average + " --> " + formattedDouble);
                scanner.close();
            } catch (FileNotFoundException e) {
                System.out.println("Файл не найден");
            }
    }
}