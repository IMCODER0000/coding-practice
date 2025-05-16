package binarySearch.bronze1.btpractice;

import java.util.*;

public class WW {

    public static List<int[]> result = new ArrayList<>();

    public static int numCount = 0;

    public static void combine(int[] arr, boolean[] visited, int start, int n, int r) {

        if (r == 0) {

            int count = 0;
            for (boolean v : visited) {
                if (v) {
                    count++;
                }
            }

            //count = 3

            int[] temp = new int[count];
            int idx = 0;
            for (int i = 0; i < n; i++) {
                if (visited[i]) {
                    temp[idx++] = arr[i];
                }
            }
            //1,2,3;;
            result.add(temp);
            return;
        }

        for (int i = start; i < n; i++) {

            visited[i] = true;
            combine(arr, visited, i + 1, n, r - 1);
            visited[i] = false;

        }

        //vi[0] - r=3
        //vi[1] - r=2
        //vi[2] - r=1
        //vi[3] - r=0


    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int r = 2;
        boolean[] vi = new boolean[n];

        combine(arr, vi, 0, n, r);

        // 결과 출력
        for (int[] comb : result) {
            System.out.println(Arrays.toString(comb));
            numCount++;
        }
        System.out.println("총 경우의 수는 : " + numCount);

    }
}
