package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        String separator = File.separator;
        File file = new File(separator + "C:" + separator + "Users" + separator + "wella" + separator + "Desktop"
                + separator + "Marathon" + separator + "JavaMarathon2021" + separator +
                "src" + separator + "main" + separator + "java" + separator + "day14" + separator + "people");

        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file) {
        List<String> peoples = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] nameAge = line.split(" ");
                if (Integer.parseInt(nameAge[1]) < 0) throw new IllegalStateException();
                peoples.add(line);
            }
            return peoples;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalStateException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}
