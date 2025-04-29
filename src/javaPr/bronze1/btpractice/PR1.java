package javaPr.bronze1.btpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PR1 {

    public static List<int[]> results = new ArrayList<>();

    public static int totalCount = 0;



    public static void combine(int[] arr, boolean[] chosen, int start, int size, int now) {

        if (now == 0) {
            int count = 0;
            for (boolean c : chosen) {
                if (c) {
                    count++;
                }
            }

            int idx = 0;
            int[] newArr = new int[count];
            for (int i = 0; i < size; i++) {
                if (chosen[i]) {
                    newArr[idx++] = arr[i];
                }

            }
            results.add(newArr);

            return;


        }

        for (int i = start; i < size; i++) {
            chosen[i] = true;
            combine(arr, chosen, i+1, size, now-1);
            chosen[i] = false;

        }



    }


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int size = arr.length;
        boolean[] chosen = new boolean[size];

        int r = 3;


        combine(arr,chosen, 0, size, r);

        for (int[] result : results) {
            System.out.println(Arrays.toString(result));
            totalCount++;
        }

        System.out.println();
        System.out.println("총 경우의 수는 : " + totalCount);

    }


}

