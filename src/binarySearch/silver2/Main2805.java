package binarySearch.silver2;

import java.util.Scanner;

public class Main2805 {

    public static boolean possibility(long M, long machine, long[] trees) {

        long treeLengthSum = 0;
        long treeLength = 0;
        for (long tree : trees) {
            if (tree > machine) {
                treeLengthSum += (tree - machine);
            }

        }

        return treeLengthSum >= M;


    }

    public static long BS(long maxTreeLength, long M, long[] trees){

        long left = 1;
        long right = maxTreeLength;
        long result = 0;

        while (left <= right) {
            long mid = (left + right) / 2;
            if (possibility(M, mid, trees)) {
                result = mid;
                left = mid + 1;
            } else{
                right = mid -1;
            }

        }


        return result;

    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // N = treeNum;
        // M = needTree;

        int N = sc.nextInt();
        long M = sc.nextInt();

        long[] trees = new long[N];
        long maxTreeLength = 0;


        for (int i = 0; i < N; i++) {

            long treeLength = sc.nextLong();
            trees[i] = treeLength;
            maxTreeLength = Math.max(maxTreeLength, treeLength);

        }

        long result = BS(maxTreeLength, M, trees);

        System.out.println(result);


    }



}
