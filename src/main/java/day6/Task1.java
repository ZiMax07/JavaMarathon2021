package day6;

public class Task1 {
    public static void main(String[] args) {
    Motorbike motorbike = new Motorbike(1998, "Красный" , "Иж Планета");


    System.out.println(motorbike.getModel());
    motorbike.info();
    System.out.println(motorbike.getColor());
    System.out.println(motorbike.getYear());
    System.out.println("Разницу между переданным годом\nи " +
            "годом выпуска транспортного средства (год(а)/лет) : " + motorbike.yearDifference(1994));
    }
}