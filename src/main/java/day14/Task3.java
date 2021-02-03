package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        String separator = File.separator;
        File file = new File(separator + "C:" + separator + "Users" + separator + "wella" + separator + "Desktop"
                + separator + "Marathon" + separator + "JavaMarathon2021" + separator +
                "src" + separator + "main" + separator + "java" + separator + "day14" + separator + "people");

        System.out.println(parseFileToObjList(file));
    }

    public static List<Human> parseFileToObjList(File file){
        List<Human> peoples = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] nameAge = line.split(" ");
                if (Integer.parseInt(nameAge[1]) < 0) throw new IllegalStateException();

                Human human = new Human(nameAge[0], Integer.parseInt(nameAge[1]));
                peoples.add(human);
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