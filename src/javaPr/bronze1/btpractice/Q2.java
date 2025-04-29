package javaPr.bronze1.btpractice;

public class Q2 {

    public static int[] combine(int[] arr, boolean[] visited, int start, int n, int r) {

        if (r == 0) {
            return arr;
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            combine(arr, visited, i + 1, n, r);
            visited[i] = false;
        }

        return arr;


    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int r = 3;

        boolean[] vi = new boolean[n];


        int[] combine = combine(arr, vi, 0, n, r);

        for (int i : combine) {

            System.out.println(i + " ");

        }


    }


}
