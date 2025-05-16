package bfs.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main1012 {

    // N,M 가로 세로 개수
    // K - 배추 개수
    static int N,M;

    static int T;

    static int[][] bord;

    static int K;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    static boolean visited[][];

    static int[] count;

    static boolean pass;

    static class Point{
        int x,y;

        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }


    static void bfs(int x, int y, int indexT){
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x, y));
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            Point p = queue.poll();
            pass = false;
            for (int i = 0; i < 4; i++) {
                int nextX = p.x + dx[i];
                int nextY = p.y + dy[i];

                if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) {
                    continue;
                }

                if(bord[nextX][nextY] != 1 || visited[nextX][nextY]){
                    pass = true;
                    continue;
                }

                queue.offer(new Point(nextX, nextY));
                visited[nextX][nextY] = true;




            }




        }

    }



    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());
        count = new int[T];
        for(int n = 0; n<T; n++) {
            String[] MNK = br.readLine().split(" ");
            N = Integer.parseInt(MNK[0]);
            M = Integer.parseInt(MNK[1]);
            K = Integer.parseInt(MNK[2]);

            bord = new int[N][M];
            visited = new boolean[N][M];


            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    bord[i][j] = 0;
                }
            }

            for (int i = 0; i < K; i++) {
                String[] MN = br.readLine().split(" ");
                int x = Integer.parseInt(MN[0]);
                int y = Integer.parseInt(MN[1]);
                bord[x][y] = 1;
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (bord[i][j] == 1 && !visited[i][j]) {
                        bfs(i,j,n);
                        count[n]++;
                    }
                }
            }


        }
        for(int i = 0; i<T; i++){
            System.out.println(count[i]);
        }










    }


}
