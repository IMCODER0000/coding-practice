package binarySearch.silver4;

import java.util.Arrays;
import java.util.Scanner;

public class Main1920_2 {


    private static int BS(int[] arr, int targer) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == targer) {
                return 1;
            } else if (arr[mid] < targer) {
                left = mid+1;
            } else if (arr[mid] > targer) {
                right = mid-1;
            }



        }

        return 0;



    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr1 = new int[N];

        for (int i = 0; i < N; i++) {
            arr1[i] = sc.nextInt();

        }

        Arrays.sort(arr1);


        int M = sc.nextInt();

        int[] arr2 = new int[M];
        Integer[] results = new Integer[M];

        for (int j = 0; j < M; j++) {
            arr2[j] = sc.nextInt();
            int result = BS(arr1, arr2[j]);
            results[j] = result;
        }



        for (Integer i : results) {
            System.out.println(i);
        }




    }

}
