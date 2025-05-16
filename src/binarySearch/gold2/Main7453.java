package binarySearch.gold2;

import java.io.*;
import java.util.Arrays;


public class Main7453 {
    private static int Upper(int[] sub, int T) {
        int left = 0;
        int right = sub.length;

        while(left < right){
            int mid = (left + right)/2;

            if(sub[mid]<= T){
                left = mid + 1;
            } else{
                right = mid;
            }
        }

        return left;


    }
    private static int Lower(int[] sub, int T) {
        int left = 0;
        int right = sub.length;

        while(left < right){
            int mid = (left + right)/2;
            
            // 0 mid result;

            if (sub[mid] < T) {
                left = mid + 1 ;
            } else{
                right = mid;
            }
            
        }
        
        return left;

    }

    private static long BS(int[] main, int[] sub){
        long result = 0;


        for (int i = 0; i < main.length; i++) {
            int T = -main[i];



            int count = Upper(sub, T) - Lower(sub, T);
            result += count;


            }


        return result;


        }





    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n];
        int[] B = new int[n];
        int[] C = new int[n];
        int[] D = new int[n];
        int[]AB = new int[n*n];
        int[]CD = new int[n*n];

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            A[i] = Integer.parseInt(input[0]);
            B[i] = Integer.parseInt(input[1]);
            C[i] = Integer.parseInt(input[2]);
            D[i] = Integer.parseInt(input[3]);
        }
        int s = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                    AB[s] = A[i] + B[j];
                    CD[s] = C[i] + D[j];
                s++;
            }
        }

        Arrays.sort(CD);

        long result = BS(AB, CD);

        System.out.println(result);


    }

}
