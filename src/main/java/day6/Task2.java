package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boing", 2015, 1500,25000);
        airplane.setYear(2017);
        airplane.setLength(1750);
        airplane.fillUp(1500);
        airplane.fillUp(1800);
        airplane.info();

    }
}