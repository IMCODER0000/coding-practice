package binarySearch.gold5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main2470 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N 전체 용액의 수 2<=N<=10000

        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] Ns = new int[N];



        for(int i = 0; i<N; i++){
            Ns[i] = Integer.parseInt(input[i]);

        }

        Arrays.sort(Ns);

        int left = 0;
        int right = N - 1;

        int min = Integer.MAX_VALUE;
        int ans1 = 0, ans2 = 0;

        while(left < right){
            int sum = Ns[left] + Ns[right];

            if(Math.abs(sum) < min){
                min = Math.abs(sum);
                ans1 = Ns[left];
                ans2 = Ns[right];
            }

            if(sum < 0){
                left++;
            } else {
                right--;
            }
        }

        System.out.println(ans1 + " " + ans2);

    }

}
