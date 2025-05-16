package binarySearch.gold4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main2110 {

    private static boolean Possibility(int C, int distance, int[] points) {
        int count = 1;
        int start = points[0];

        for(int i = 1; i<points.length; i ++ ){
            if( points[i] - start >= distance){
                count++;
                start = points[i];
            }
        }

        return count>= C;


    }


    private static int MaxMinimum(int[] points, int C, int maxNum, int minNum){

        int left = 1;
        int right = maxNum- minNum;
        int result = 0;


        while(left <= right){
            int mid = (left + right) / 2;


            if (Possibility(C,mid, points)) {
                result = mid;
                left = mid + 1;
            } else{
                right = mid - 1;
            }

        }

        return result;


    }



    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] NC = br.readLine().split(" ");

        int N = Integer.parseInt(NC[0]);
        int C = Integer.parseInt(NC[1]);


        int[] points = new int[N];


        for (int i = 0; i < N; i++) {
            points[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(points);


        int result = MaxMinimum(points, C, points[N-1], points[0]);


        System.out.println(result);


    }










}
