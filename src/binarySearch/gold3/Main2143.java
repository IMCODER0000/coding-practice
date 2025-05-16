package binarySearch.gold3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2143 {


    public static long Upper(List<Long> arr, int target){
        long left = 0;
        long right = arr.size();

        while(left < right){
            long mid = (left+right) / 2;

            // 0 mid reuslt
            // result mid 0

            if (arr.get((int)mid) <= target) {
                left = mid + 1;
            } else{
                right = mid ;
            }

        }



        return left;
    }


    public static long Lower(List<Long> arr, int target) {
        long left = 0;
        long right = arr.size();

        while(left < right){
            long mid = (left + right)/2;

            // 0 mid reuslt
            // result mid 0

            if(arr.get((int)mid) < target) {
                left = mid + 1;
            } else {
                right = mid;
            }

        }



        return left;
    }



    public static long Solution(List<Long> main,List<Long> sub, int T ){

        long result = 0;

        for(int i = 0; i<main.size(); i++) {
            int target = T - main.get(i).intValue();

            long num = Upper(sub, target) - Lower(sub, target);
            result += num;
        }

        return result;

    }

    // n = A 배열의 크기
    // m = B 배열의 크기
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        String[] inputN = br.readLine().split(" ");
        Long[] A = new Long[n];
        List<Long> sumA = new ArrayList<>();
        for(int i = 0; i<n; i++){
            A[i] = Long.parseLong(inputN[i]);
        }
        for(int i = 0; i<n; i++){
            long sum = 0;
            for(int j = i; j<n; j++){
                sum += A[j];
                sumA.add(sum);
            }
        }

        int m = Integer.parseInt(br.readLine());
        String[] inputM = br.readLine().split(" ");
        Long[] B = new Long[m];
        List<Long> sumB = new ArrayList<>();
        for(int i = 0; i<m; i++) {
            B[i] = Long.parseLong(inputM[i]);
        }

        for(int i = 0; i<m; i++){
            long sum = 0;
            for(int j = i; j<m; j++){
                sum +=B[j];
                sumB.add(sum);
            }
        }

        List<Long> main = sumA.size() >= sumB.size() ? sumB : sumA;
        List<Long> sub = sumA.size() >= sumB.size() ? sumA : sumB;

        Collections.sort(sub);

        long result = Solution(main, sub, T);

        System.out.println(result);



    }




}
