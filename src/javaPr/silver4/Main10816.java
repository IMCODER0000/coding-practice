package javaPr.silver4;

import java.util.Arrays;
import java.util.Scanner;

public class Main10816 {

    private static int UpperBs(int[] arr, int target) {
        int left = 0;
        int right = arr.length;


        while (left < right) {
            int mid = (left + right) / 2;


            if (arr[mid] > target) {
                right = mid;
            } else if (arr[mid] <= target) {

                left = mid + 1;

            }


        }

        return left;

    }






    private static int LowerBS(int[] arr, int target) {


        int left = 0;
        int right = arr.length;



        while (left < right) {
            int mid = (left + right) / 2;

            if (arr[mid] >= target) {
                right = mid;
            }

            else{
                left = mid + 1;
            }



        }

        return left;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] sang = new int[N];

        for (int i = 0; i < N; i++) {
            sang[i] = sc.nextInt();
        }

        Arrays.sort(sang);

        int M = sc.nextInt();
        int[] num = new int[M];
        int[] result = new int[M];

        for (int j = 0; j < M; j++) {

            num[j] = sc.nextInt();
            int upper = UpperBs(sang, num[j]);
            int lower = LowerBS(sang, num[j]);
            result[j] = upper - lower;

        }



        for (int i : result) {
            System.out.print(i + " ");
        }







    }






}
