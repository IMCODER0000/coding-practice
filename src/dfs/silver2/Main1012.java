package dfs.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Main1012 {

    static int[][] Board;

    static boolean[][] visited;
    static boolean[][] visited2;

    static int[] dx = {-1, 1, 0, 0};

    static int[] dy = {0, 0, -1, 1};

    static int count;

    static class Point{
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int N, M, K;

    static void BFS(int x, int y) {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x, y));
        visited[x][y] = true;

        while (!q.isEmpty()) {
            Point poll = q.poll();

            for (int i = 0; i < 4; i++) {
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];

                if (nx < 0 || ny < 0 || nx >= N || ny >= M) {
                    continue;
                }

                if (visited[nx][ny] || Board[nx][ny] != 1) {
                    continue;
                }

                q.offer(new Point(nx, ny));
                visited[nx][ny] = true;

            }


        }



    }


    static void DFS(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || ny < 0 || nx >= N || ny >= M) {
                continue;
            }

            if(visited[nx][ny] || Board[nx][ny] != 1 ){
                continue;
            }

            DFS(nx, ny);


        }

    }



    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());


        for (int t = 0; t <T; t++) {
            count = 0;
            String[] NMK = br.readLine().split(" ");

            N = Integer.parseInt(NMK[0]);
            M = Integer.parseInt(NMK[1]);
            K = Integer.parseInt(NMK[2]);

            visited = new boolean[N][M];
            Board = new int[N][M];


            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    Board[i][j] = 0;
                }
            }

            for (int i = 0; i < K; i++) {
                String[] Ks = br.readLine().split(" ");
                Board[Integer.parseInt(Ks[0])][Integer.parseInt(Ks[1])] = 1;
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if(Board[i][j] == 1 && !visited[i][j]){
                        BFS(i,j);
                        count++;
                    }
                }
            }


            System.out.println(count);

        }













    }



}
