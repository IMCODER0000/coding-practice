package binarySearch.bronze1;
import java.util.Scanner;

public class Main1145_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 1; ; i++) {
            int count = 0;
            for (int num : numbers) {
                if (i % num == 0) {
                    count++;
                }
            }

            if (count >= 3) {
                System.out.println(i);
                break;
            }
        }
    }
}
