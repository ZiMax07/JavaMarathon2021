package day18;

public class Task2 {
    public static void main(String[] args) {

        System.out.println(count7(1727374757));

    }
        static int count7;
        static int number;
        static int numberIndexInArray;
        static int count = 0;

    public static int count7(int value){
        String[] array = Integer.toString(value).split("");
        if (count == array.length)
            return count7;

        number = Integer.parseInt(array[numberIndexInArray++]);
        count++;
        if (number == 7 ){
        count7++;
        count7(value);
        return count7;}

        count7(value);
        return count7;
    }
}
