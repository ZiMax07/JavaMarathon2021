package day18;

public class Task1 {
    public static void main(String[] args) {

        System.out.println(recursionSum(0));

    }

    static int sum;
    static int[] numbers = new int[]{1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};

    public static int recursionSum(int n){
        if(n == numbers.length)
            return sum;
        recursionSum(n+1);
        return sum += numbers[n];
    }
}
