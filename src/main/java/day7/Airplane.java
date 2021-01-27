package day7;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel = 0;

    public Airplane(String producer, int year, int length, int weight){
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }
    public void setProducer (String producer){this.producer = producer;}
    public void setYear (int year){this.year = year;}
    public void setLength (int length){this.length = length;}
    public  void setWeight (int weight){this.weight = weight;}
    public void setFuel (int fuel){this.fuel = fuel;}
    public int getFuel() {return fuel;}

    public void info(){
        System.out.println("Изготовитель: " + producer +", год выпуска: " + year + ", длина: "
                + length + ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }
    public void fillUp(int n){
        fuel += n;
    }

    public static void compareAirplanes(Airplane air1, Airplane air2){
        if (air1.length > air2.length){
            System.out.println("Самолет " + air1.producer + " длиннее " + air2.producer);
        } else if (air1.length < air2.length){
            System.out.println("Самолет " + air2.producer + " длиннее " + air1.producer);
        } else if (air1.length == air2.length) {
            System.out.println("Длины самолетов равны");
        }
    }
}