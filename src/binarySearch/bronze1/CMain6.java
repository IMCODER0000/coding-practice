package binarySearch.bronze1;

import java.math.BigInteger;
import java.util.Scanner;

public class CMain6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int TestCase = scanner.nextInt();

        for (int i = 0; i < TestCase; i++) {

            int a = scanner.nextInt();
            int b = scanner.nextInt();

            BigInteger A = BigInteger.valueOf(a);

            BigInteger lastData = A.modPow(BigInteger.valueOf(b), BigInteger.valueOf(10));

            int result = lastData.intValue();
            if (result == 0) {
                result = 10;
            }

            System.out.println(result);
        }
    }
}
