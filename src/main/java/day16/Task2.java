package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        String separator = File.separator;
        File file1 = new File(separator + "C:" + separator + "Users" + separator + "wella" + separator + "Desktop"
                + separator + "Marathon" + separator + "JavaMarathon2021" + separator +
                "src" + separator + "main" + separator + "java" + separator + "day16" + separator + "file1.txt");

        File file2= new File(separator + "C:" + separator + "Users" + separator + "wella" + separator + "Desktop"
                + separator + "Marathon" + separator + "JavaMarathon2021" + separator +
                "src" + separator + "main" + separator + "java" + separator + "day16" + separator + "file2.txt");

        try {
            PrintWriter pw = new PrintWriter(file1);
            for (int i = 0; i < 1000; i++){
                int random = (int) (Math.random()*100) + 1;
                pw.println(random);
            }
            pw.close();
            PrintWriter pw2 = new PrintWriter(file2);
            Scanner scanner = new Scanner(file1);
            List<Integer> numbers = new ArrayList<>();
            int sum = 0;
            double average;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                numbers.add(Integer.parseInt(line));
            }
            for (int i = 0; i < numbers.size(); i += 20) {
                for (int j = i; j < i + 20; j++) {
                    sum += numbers.get(j);
                }
                average = sum / 20.0;
                pw2.println(average);
                sum = 0;
            }
            pw2.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        printResult(file2);
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            double sum = 0;
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                sum += Float.parseFloat(line);
            }System.out.println(sum);
            System.out.println((int) sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
