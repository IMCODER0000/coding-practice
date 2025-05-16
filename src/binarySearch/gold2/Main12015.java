package binarySearch.gold2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main12015 {

    private static int BS(int[] arr, int target, int length){
        int left = 0;
        int right = length;

        while(left < right){
            int mid = (left + right) / 2;

            if(arr[mid] < target){
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }


    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arrSize = Integer.parseInt(br.readLine());
        String[] arrString = br.readLine().split(" ");
        int[] result = new int[arrSize];
        int[] numArr = new int[arrSize];

        int length = 0;


        for(int i = 0; i<result.length; i++){
            numArr[i] = Integer.parseInt(arrString[i]);
            int bsResult = BS(result, numArr[i], length);
            result[bsResult] = numArr[i];
            if(bsResult == length){
                length++;
            }

        }

        System.out.println(length);







    }






}
