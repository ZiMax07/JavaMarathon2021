package day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<String> auto = new ArrayList<>();
        Collections.addAll(auto,"BMW", "Mazda", "Toyota", "Nissan", "Audi");
        auto.remove(0);
        auto.add(2,"Chevrolet");
        for(String car : auto){
            System.out.println(car);
        }
    }
}
