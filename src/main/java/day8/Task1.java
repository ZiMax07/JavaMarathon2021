package day8;

public class Task1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 20000; i++) {
            sb.append(i + " ");
        }
        System.out.println(sb.toString());
        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;
        long start2 = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            String str = String.valueOf(i);
            System.out.print(str + " ");
        }
        long finish2 = System.currentTimeMillis();
        long timeConsumedMillis2 = finish2 - start2;
        System.out.println();
        System.out.println("Время работы программы StringBuilder = " + timeConsumedMillis);
        System.out.println("Время работы программы String = " + timeConsumedMillis2);
    }
}
