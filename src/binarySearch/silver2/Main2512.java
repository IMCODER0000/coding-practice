package binarySearch.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2512 {


    private static boolean Impo(int[] arr, int max, int sol){
        int sum = 0;

        for(int i = 0; i< arr.length; i++){
            if(arr[i]>sol){
                sum+=sol;
            } else {
                sum+= arr[i];
            }
        }
        if(sum<=max){
            return true;
        } else{
            return false;
        }


    }

    private static int solution(int[] arr, int Max ,int arrMax){
        int left = 0;
        int right = Max;
        int result = 0;

        while(left <= right){
            int mid = (left + right) / 2;

            if(Impo(arr,arrMax, mid)){
                result = mid;
                left = mid+1;
            } else{
                right = mid-1;
            }
        }


        return result;
    }

    // N - 지방의 수 (3<= N <=10000)
    // M - 각 지방의 지원 예산
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] inputNs = br.readLine().split(" ");
        int[] Ns = new int[N];
        int M =  Integer.parseInt(br.readLine());
        int Max = 0;


        for(int i = 0; i<N; i++){
            Ns[i] = Integer.parseInt(inputNs[i]);
            Max = Math.max(Max, Ns[i]);
        }

        int solution = solution(Ns, Max, M);

        System.out.println(solution);


    }


}
