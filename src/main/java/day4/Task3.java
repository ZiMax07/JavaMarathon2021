package day4;

public class Task3 {
    public static void main(String[] args) {
    int m = 12;
    int n = 8;
    int[][] array = new int[m][n];
    for (int i = 0; i < array.length; i++){
        for(int j = 0; j < array[i].length; j++){
            array[i][j] = (int) (Math.random()*50)+1;
        }
    }
    int maxSum = 0;
    int index = 0;
    for (int i = 0; i < array[i].length; i++){
        int sum = 0;
        for (int j = 0; j < array[i].length; j++){
            //System.out.print(array[i][j] + " ");
            sum += array[i][j];
            }
        //System.out.println();
        //System.out.println("код строки : " + i);
        //System.out.println(sum);
        if (sum >= maxSum){
            maxSum = sum;
            index = i;
        }
        //System.out.println();
        }
        //System.out.println("MAX SUM : " + maxSum);
        System.out.println("индекс строки, сумма чисел в которой максимальна : " + index);

    }
}

