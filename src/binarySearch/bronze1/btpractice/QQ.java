package binarySearch.bronze1.btpractice;

public class QQ {

    public static void combine(int[] arr, boolean[] visited, int start, int n, int r) {
        if (r == 0) {
            printCombination(arr, visited, n);
            return;
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            combine(arr, visited, i + 1, n, r - 1);
            visited[i] = false;
        }

    }

    public static void printCombination(int[] arr, boolean[] visited, int n) {
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // M개의 원소
        int n = arr.length;
        int r = 3; // N개 선택

        boolean[] visited = new boolean[n];
        combine(arr, visited, 0, n, r);


    }
}
