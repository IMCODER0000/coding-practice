package binarySearch.bronze1;

import java.util.*;

public class CMain10 {

    public static void main(String[] agrs) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine(); // 개행 제거

        Set<Integer> xList = new HashSet<>();
        Set<Integer> yList = new HashSet<>();

        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine(); // 한 줄 통째로 입력받음
            for (int j = 0; j < M; j++) {
                char ch = line.charAt(j);
                if (ch == 'X') {
                    xList.add(j);
                    yList.add(i);
                }
            }
        }

        int emptyRows = N - yList.size();
        int emptyCols = M - xList.size();

        System.out.println(Math.max(emptyRows, emptyCols));
    }
}
