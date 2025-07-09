package dfs.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Main2667_2 {

    static int N;

    static boolean[][] visited;

    static int[][] board;

    static ArrayList<Integer> result;



    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int BFS(int x, int y) {

        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x, y));
        visited[x][y] = true;
        int count = 1;


        while (!q.isEmpty()) {
            Point poll = q.poll();

            for (int i = 0; i < 4; i++) {
                int nextX = poll.x + dx[i];
                int nextY = poll.y + dy[i];

                if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= N) {
                    continue;
                }
                if (visited[nextX][nextY] || board[nextX][nextY] == 0) {
                    continue;
                }


                q.offer(new Point(nextX, nextY));
                visited[nextX][nextY] = true;
                count++;


            }



        }

        return count;

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        N = Integer.parseInt(br.readLine());
        board = new int[N][N];
        visited = new boolean[N][N];
        result = new ArrayList<>();


        for (int i = 0; i < N; i++) {
            String[] inputs = br.readLine().split("");
            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(inputs[j]);
            }
        }


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j] && board[i][j] != 0) {
                    result.add(BFS(i, j));
                }
            }
        }


        Collections.sort(result);

        System.out.println(result.size());

        for (int r : result) {
            System.out.println(r);
        }

    }


}
