package javaPr.bronze1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//        A X B = GCD(A,B) X LCM(A,B)
//        LCM = A X B / GCD(A,B)

public class Main1145 {


    public static List<List<Integer>> result = new ArrayList<>();

    public static List<Integer> answer = new ArrayList<>();

    public static int totalCount = 0;


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean[] isTrue = new boolean[5];
        int[] numbers = new int[5];
        int lcm = 0;
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            numbers[i] = num;
        }

        for (int r = 3; r <= 5; r++) {
            BT(numbers, isTrue, 0, 5, r);
        }
//        BT(numbers, isTrue, 0, 5, 3);

        int lcm1 = 0;
        for (List<Integer> integers : result) {
            lcm1 = LCM(integers.get(0), integers.get(1));
            for (int i = 2; i < integers.size(); i++) {
                lcm1 = LCM(lcm1, integers.get(i));

            }

            answer.add(lcm1);
        }

        int minimum = Minimum(answer);

        System.out.println(minimum);


    }

    private static int Minimum(List<Integer> list) {
        Integer min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (min > list.get(i)) {
                min = list.get(i);
            }
        }

        return min;
    }

    private static void BT(int[] numbers, boolean[] isTrue, int start, int size, int now) {

        if (now == 0) {
            List<Integer> nowArr = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                if (isTrue[i]) {
                    nowArr.add(numbers[i]);
                }
            }
            totalCount++;
            result.add(nowArr);
            return;
        }


        for (int i = start; i < size; i++) {

            isTrue[i] = true;
            BT(numbers, isTrue, i + 1, size, now - 1);
            isTrue[i] = false;


        }


    }

    public static int GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int LCM(int a, int b) {

        return a * b / GCD(a, b);

    }


}
