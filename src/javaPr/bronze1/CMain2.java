package javaPr.bronze1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CMain2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        int num5 = scanner.nextInt();
        int num6 = scanner.nextInt();



        List<Integer> work = Work2(num1, num2, num3, num4, num5, num6);

        System.out.println(work.get(0) + " " + work.get(1));


    }



    protected static List<Integer> Work2(int a, int b, int c, int d, int e, int f) {

        List<Integer> list = new ArrayList<>();

        int result1 = a ^ c ^ e;
        int result2 = b ^ d ^ f;

        list.add(result1);
        list.add(result2);

        return list;

    }



}
