package day4;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random()*10000)+1;
        }
        int maxSum = 0;
        int index = 0;
        for (int i = 0; i < array.length - 2; i++){    //1 число + 2 после него, и 2 последних не включены в длину, тк 3 с конца +2 числа
            int sum = 0;
            for (int j = i; j < i + 3;j++)
            sum += array[j];
            //System.out.print(sum + " сумма чисел | ");
            if (sum > maxSum){
                maxSum = sum;
                index = i;
            }
            //System.out.println("тройка №" + i);
            //System.out.println(i-1 + " - " + array[i-1]);
            //System.out.println(i + " - " + array[i]);
            //System.out.println(i+1 + " - " + array[i+1]);
            //System.out.print("Сумма max= " + maxSum);
            //System.out.println();
        }
        //System.out.println();
        System.out.println("Максимальная сумма тройки соседних элементов = " + maxSum);
        System.out.println("Индекс первого элемента тройки с максимальной суммой : " + index);
    }
}