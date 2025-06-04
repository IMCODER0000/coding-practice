package dfs.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Main2667 {

    static ArrayList<Integer>[] graph;

    static int[][] BoardB;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static boolean[][] visitedB;
    static boolean[][] visitedD;
    static ArrayList<Integer> result;
    static int count;


    static int N;

    static class Point{
        int x,y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }




    static void dfs(int x, int y){
        visitedD[x][y] = true;
        count++;

            for (int j = 0; j < 4; j++) {
                int nextX = x + dx[j];
                int nextY = y + dy[j];

                if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= N) {
                    continue;
                }

                if (BoardB[nextX][nextY] == 0 || visitedD[nextX][nextY]) {
                    continue;
                }

                dfs(nextX, nextY);


            }


    }

    static void bfs(int x, int y){
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x, y));
        visitedB[x][y] = true;

        while (!q.isEmpty()) {
            Point poll = q.poll();

            for (int i = 0; i < 4; i++) {
                int nextX = poll.x + dx[i];
                int nextY = poll.y + dy[i];

                if (nextY < 0 || nextX < 0 || nextX >= N || nextY >= N) {
                    continue;
                }

                if (visitedB[nextX][nextY] || BoardB[nextX][nextY] == 0) {
                    continue;
                }

                q.offer(new Point(nextX, nextY));
                visitedB[nextX][nextY] = true;
                count++;


            }

        }

        if (count != 0) {
            result.add(count);
       }
    }




    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        N = Integer.parseInt(br.readLine());
        BoardB = new int[N][N];
        visitedB = new boolean[N][N];
        visitedD = new boolean[N][N];
        result = new ArrayList<>();


        for (int i = 0; i <N; i++) {
            String[] Is = br.readLine().split("");
            for (int j = 0; j <N; j++) {
                BoardB[i][j] = Integer.parseInt(Is[j]);
            }

        }

//        for (int i = 0; i <N; i++) {
//            for (int j = 0; j <N; j++) {
//                if (!visitedB[i][j] && BoardB[i][j] != 0) {
//                    count = 1;
//                    bfs(i, j);
//                }
//            }
//
//        }

        for (int i = 0; i <N; i++) {
            for (int j = 0; j <N; j++) {
                if (!visitedD[i][j] && BoardB[i][j] != 0) {
                    count = 0;
                    dfs(i, j);
                    result.add(count);
                }
            }

        }

//        result.sort(null);

        Collections.sort(result);

        int size = result.size();
        System.out.println(size);
        System.out.println();
        for (int i : result) {
            System.out.println(i);

        }










    }



}
