package day5;

public class Car {
    private int year;
    private String color;
    private String model;

    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        System.out.println("Год выпуска : " + year);
        return year;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        System.out.println("Цвет : " + color);
        return color;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        System.out.println("Марка : " + model);
        return model;
    }
}
