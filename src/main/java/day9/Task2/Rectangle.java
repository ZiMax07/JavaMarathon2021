package day9.Task2;

public class Rectangle extends Figure{

    private int width;
    private  int height;

    public  Rectangle(String color, int width, int height){
        super(color);
        this.height = height;
        this.width = width;
    }
    @Override
    public double area(){
        double s = width*height;
        return s;
    }
    @Override
    public double perimeter(){
        double p = (width+height)*2;
        return p;
    }
}