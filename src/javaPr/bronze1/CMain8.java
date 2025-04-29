package javaPr.bronze1;

import java.util.Scanner;

public class CMain8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int[] divisors = new int[num];

        for (int i = 0; i < num; i++) {
            divisors[i] = scanner.nextInt();
        }

        int minDivisor = Integer.MAX_VALUE;
        int maxDivisor = Integer.MIN_VALUE;

        for (int i = 0; i < num; i++) {
            if (divisors[i] < minDivisor) {
                minDivisor = divisors[i];
            }
            if (divisors[i] > maxDivisor) {
                maxDivisor = divisors[i];
            }
        }

        int N = minDivisor * maxDivisor;

        System.out.println(N);
    }
}
