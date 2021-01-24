package day5;

public class Motorbike {
    private int year;
    private String color;
    private String model;

    public Motorbike(int year, String color, String model){
        this.year = year;
        this.color = color;
        this.model = model;
    }
    public int getYear(){
        System.out.println("Год выпуска : " + year);
        return year;
    }
    public String getColor(){
        System.out.println("Цвет : " + color);
        return color;
    }
    public String getModel(){
        System.out.println("Марка : " + model);
        return model;
    }
}
