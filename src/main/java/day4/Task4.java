package day4;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random()*10000)+1;
        }
        int sum = 0;
        int maxSum = 0;
        int index = 0;
        for (int i = 1; i < array.length - 1; i++){
            sum = array[i] + array[i-1] + array[i+1];
            if (sum > maxSum){
                index = i -1;
            }
            maxSum = Math.max(maxSum,sum);
        }
        System.out.println("Максимальная сумма тройки соседних элементов = " + maxSum);
        System.out.println("Индекс первого элемента тройки с максимальной суммой : " + index);
    }
}
