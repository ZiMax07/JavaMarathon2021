package day14;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws ScannerException{
        String separator = File.separator;
        File file = new File(separator + "C:" + separator +"Users" + separator + "wella" + separator + "Desktop"
                + separator + "Marathon" + separator + "JavaMarathon2021" + separator +
                "src" + separator +"main" + separator + "java" + separator + "day14" + separator + "numbers");

        printSumDigits(file);

    }
    public static void printSumDigits(File file) throws ScannerException{
        try {
            Scanner scanner = new Scanner(file);
            int sum = 0;
            int count = 0;
            while (scanner.hasNextLine()){
                count++;
                sum += scanner.nextInt();
            }
            scanner.close();
            if (count != 10){
                throw new ScannerException("Некорректный входной файл");
            } else {
                System.out.println(sum);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}