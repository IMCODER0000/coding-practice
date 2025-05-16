package binarySearch.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main1654_re {

    private static boolean Possibility(long maxLength, long N, long[] lines){
        long count = 0;
        for(long line : lines){
            count += line/maxLength;
        }

        return count>=N;



    }

    private static long LengthBS(long maxLength, long[] arr, long N){
        long left = 0;
        long right = maxLength;
        long result = 0;

        while(left <= right){
            long mid = left +(right - left) / 2;

            if(Possibility(mid, N, arr)){
                result = mid;
                left = mid + 1;
            } else{
                right = mid -1;
            }
        }

        return result;


    }

    public static void main(String[] args) throws Exception {

        // K - haveLanLine
        // N - needLanLine


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] KN = br.readLine().split(" ");

        int K = Integer.parseInt(KN[0]);
        int N = Integer.parseInt(KN[1]);


        long[] KsLength = new long[K];

        for(int i = 0; i<K; i++){
            KsLength[i] = Long.parseLong(br.readLine());
        }

        long[] haveLine = new long[K];
        long MaxLength = 0;

        for(int i = 0; i<KsLength.length; i ++){
            haveLine[i] = KsLength[i];
            MaxLength = Math.max(MaxLength,haveLine[i]);
        }

        long result = LengthBS(MaxLength, haveLine, N);

        System.out.println();
        System.out.println(result);



























    }







}