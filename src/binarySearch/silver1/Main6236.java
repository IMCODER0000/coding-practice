package binarySearch.silver1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main6236 {

    // M - 횟수
    // N - 일 수
    // K - 금액
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] NM = br.readLine().split(" ");

        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);
        int[] DayK = new int[N];
        int maxDayK = 0;
        int sumK = 0;


        for (int i = 0; i < N; i++) {
            DayK[i] = Integer.parseInt(br.readLine());
            maxDayK = Math.max(maxDayK,DayK[i]);
            sumK += DayK[i];
        }

        int left = maxDayK;
        int right = sumK;
        int result = 0;

        while(left <= right){
            int mid = (left + right) / 2;
            int count = 1;
            int haveM = mid;

            for(int i =0; i<N; i++){
               if(count>M){
                   break;
               }
               if(haveM<DayK[i]){
                   count++;
                   haveM = mid;
               }
                haveM -= DayK[i];

            }

            if(count<=M){
                result = mid;
                right = mid - 1;
            } else{
                left = mid + 1;
            }


        }

        System.out.println(result);

    }

}
