package binarySearch.silver4;

import java.util.Arrays;
import java.util.Scanner;

public class Main10816_re {


    private static int UpperBS(int target, int[] haveCards){

        int left = 0;
        int right = haveCards.length;

        while (left < right) {
            int mid = (left + right) / 2;

            if (haveCards[mid] <= target) {
                left = mid + 1;
            } else{
                right = mid;
            }


        }
        return left;
    }

    private static int LowerBs(int target, int[] haveCards){
        int left = 0;
        int right = haveCards.length;

        while (left < right) {
            int mid = (left + right) / 2;

            if (haveCards[mid] >= target) {
                right = mid;
            } else{
                left = mid + 1;
            }



        }



        return left;
    }

    private static int BinarySearch(int target, int[] haveCards) {

        int upperInt = UpperBS(target, haveCards);
        int lowerInt = LowerBs(target, haveCards);


        return upperInt - lowerInt;


    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // N = HaveCardsNum
        // M = IntNum

        int N = sc.nextInt();
        int[] haveCards = new int[N];

        for (int i = 0; i < N; i++) {
            haveCards[i] = sc.nextInt();
        }

        Arrays.sort(haveCards);

        int M = sc.nextInt();
        int[] intNum = new int[M];
        StringBuilder sb = new StringBuilder();

        for (int j = 0; j < M; j++) {
            intNum[j] = sc.nextInt();
            int result = BinarySearch(intNum[j], haveCards);

            sb.append(result + " ");
        }

        System.out.println(sb);






    }







}
