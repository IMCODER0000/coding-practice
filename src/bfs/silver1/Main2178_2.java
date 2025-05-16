package bfs.silver1; // 해당 클래스가 속한 패키지

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.io.*;

public class Main2178_2 {
    static int N, M;

    static int[][] miro;

    static boolean[][] visited;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};



    static class Point{
        int x,y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }


    private static void bfs(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x, y));
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            Point p = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nextX = p.x + dx[i];
                int nextY = p.y + dy[i];

                if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M)
                    continue;


                if (miro[nextX][nextY] == 0 || visited[nextX][nextY])
                    continue;


                queue.offer(new Point(nextX, nextY));
                visited[nextX][nextY] = true;

                miro[nextX][nextY] = miro[p.x][p.y] + 1;


            }


        }








    }

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] NM = br.readLine().split(" ");
        N = Integer.parseInt(NM[0]);
        M = Integer.parseInt(NM[1]);

        miro = new int[N][M];
        visited = new boolean[N][M];


        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split("");
            for (int j = 0; j < M; j++) {
                miro[i][j] = Integer.parseInt(s[j]);
            }
        }


        bfs(0, 0);

        System.out.println(miro[N - 1][M - 1]);



    }





}
