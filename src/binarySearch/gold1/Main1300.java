package binarySearch.gold1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main1300 {

    public static void main(String[] args) throws Exception{

        // N = ArrSize
        // k = B[k] - answerIndex;
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));

        // 0 0 0 0    --- N
        // 0 0 0 0    --- 2n
        // 0 0 0 0    --- 3n


        // min(mid, N)
        // min(mid, 2N)
        // mint(mid, NN)

        // => (i~N) min(mid/i, N)

        // B[N^2]

        // 1,2,2,3,3,4,4,5, .... B[6],B[7]


        int N = Integer.parseInt(br.readLine());
        long k = Long.parseLong(br.readLine());

        long left = 1;
        long right = (long)N*N;
        long result = 0;

        while(left<=right){
            long mid = (left + right) / 2;
            long count = 0;

            for(int i = 1; i<=N; i++){
                count += Math.min(mid/i,N);
            }


            if(count>=k) {
                result = mid;
                right = mid - 1;
            } else{
                left = mid + 1;
            }
        }

        System.out.println(result);





    }





}
