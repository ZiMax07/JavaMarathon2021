package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {

        String separator = File.separator;
        File file = new File(separator + "C:" + separator +"Users" + separator + "wella" + separator + "Desktop"
                + separator + "Marathon" + separator + "JavaMarathon2021" + separator +
                "src" + separator +"main" + separator + "resources" + separator + "shoes.csv");

        File fileNew = new File(separator + "C:" + separator +"Users" + separator + "wella" + separator + "Desktop"
               + separator + "Marathon" + separator + "JavaMarathon2021" + separator +
               "src" + separator +"main" + separator + "resources" + separator + "missing_shoes.txt");

        List<String> shoes = new ArrayList<>();

        Scanner scanner = new Scanner(file);
        PrintWriter pw = new PrintWriter(fileNew);

        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] info = line.split(";");
            if(Integer.parseInt(info[2]) == 0){
                shoes.add(line);
            }
        }
        for (int i = 0; i < shoes.size();i++){
        pw.println(shoes.get(i)); }
        pw.close();
    }
}
