package day9.Task2;

public class Circle extends Figure{
    private int radius;

    public Circle(String color, int radius){
        super(color);
        this.radius = radius;
    }
    @Override
    public double area(){
        double s = Math.pow(radius,2)*Math.PI;
        return s;
    }
    @Override
    public double perimeter(){
        double p = radius*2*Math.PI;
        return p;
    }
}