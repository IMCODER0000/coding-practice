package javaPr.silver4;

import java.util.Scanner;
public class Main1920 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr1 = new int[N];

        for (int i = 0; i < N; i++) {
            arr1[i] = sc.nextInt();
        }


        int M = sc.nextInt();

        int[] arr2 = new int[M];

        for (int j = 0; j < N; j++) {
            arr2[j] = sc.nextInt();
        }

        Integer[] result = new Integer[M];


        for (int q = 0; q < M; q++) {
            for (int w = 0; w < N; w++) {
                if(arr1[w] == arr2[q]){
                    result[q] = 1;
                }
            }
            if (result[q] == null) {
                result[q] = 0;
            }

        }

        System.out.println();


        for (Integer i : result) {
            System.out.println(i);
        }




    }

}
