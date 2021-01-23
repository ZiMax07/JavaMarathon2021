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
    int indexCurent = 0;
    for (int j = 0; j < m; j++){
        int sum = 0;
        for (int i = 0; i < array[j].length; i++){
            //System.out.print(array[j][i] + " ");
            sum = sum + array[j][i];
            }
        //System.out.println();
        //System.out.println("код строки : " + j);
        //System.out.println(sum);
        maxSum = Math.max(maxSum, sum);
        if (maxSum > sum){
            index = index;
            indexCurent++;
        } else if(maxSum == sum){
            index = indexCurent;
            indexCurent++;
        }
        else{index=indexCurent;
            indexCurent++;}
        //System.out.println();
        }
        //System.out.println("MAX SUM : " + maxSum);
        System.out.println("индекс строки, сумма чисел в которой максимальна : " + index);

    }
}

