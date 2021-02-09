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
        String str = "";
        for (int i = 0; i <= 20000; i++) {
            str += i + " ";
        }
        System.out.println(str);
        long finish2 = System.currentTimeMillis();
        long timeConsumedMillis2 = finish2 - start2;
        System.out.println();
        System.out.println("Время работы программы StringBuilder = " + timeConsumedMillis);
        System.out.println("Время работы программы String = " + timeConsumedMillis2);
    }
}
