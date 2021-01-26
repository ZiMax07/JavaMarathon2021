package day7;


import static day7.Airplane.compareAirplanes;

public class Task1 {
    public static void main(String[] args) {
    Airplane air1 = new Airplane("Airbus",2015,4250,15000);
        Airplane air2 = new Airplane("Boeing",2018,4500,17000);
        compareAirplanes(air1,air2);
    }
}