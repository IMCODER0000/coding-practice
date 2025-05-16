package binarySearch.silver2;

import java.util.Scanner;

public class Main1654 {

    private static boolean CountPossibility(int N, long maxLength, long[] arr){
        long count = 0;
        for(long a : arr){
            count += a/maxLength;
        }
        return count >= N;
    }

    private static long MaxLength(long maxLength, long[] arr, int N){
        long left = 1;
        long right = maxLength;
        long result = 0;

        while (left <= right) {
            long mid = left + (right - left) / 2;

            if(CountPossibility(N, mid, arr)){
                result = mid;
                left = mid + 1;
            } else{
                right = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        int N = sc.nextInt();
        long[] kArr = new long[K];
        long maxLength = 0;

        for (int i = 0; i<K; i++){
            long length = sc.nextLong();
            kArr[i] = length;
            maxLength = Math.max(maxLength, length);
        }

        long result = MaxLength(maxLength, kArr, N);
        System.out.println(result);
    }
}