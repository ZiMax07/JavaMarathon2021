package day4;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random()*10000)+1;
        }
        int arrayMin = array[0];
        int arrayMax = array [0];
        int countNumberWithZeroEnd = 0;
        int countSum = 0;
        for (int number : array) {
            arrayMax = Math.max(arrayMax, number);
            arrayMin = Math.min(arrayMin, number);
            if (number % 10 == 0){
                countSum = countSum + number;
                countNumberWithZeroEnd++;
            }
        }
        System.out.println("наибольший элемент массива : " + arrayMax);
        System.out.println("наименьший элемент массива : " + arrayMin);
        System.out.println("количество элементов массива, оканчивающихся на 0 : " + countNumberWithZeroEnd);
        System.out.println("сумму элементов массива, оканчивающихся на 0      : " + countSum);

    }
}
