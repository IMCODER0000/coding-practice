package bfs.silver1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main1926 {

    static int N,M;
    static int[][] bord;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int size;
    static int bigger;

    static int count;


    static class Point{
        int x,y;

        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }


    }

    private static void bfs(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x,y));
        visited[x][y] = true;
        size = 1;

        while (!queue.isEmpty()) {
            Point p = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nextX = p.x + dx[i];
                int nextY = p.y + dy[i];

                if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) {
                    continue;
                }

                if(bord[nextX][nextY] != 1 || visited[nextX][nextY]){
                    continue;
                }


                queue.offer(new Point(nextX, nextY));
                visited[nextX][nextY] = true;
                size++;

            }



        }

        if(bigger<size){
            bigger = size;
        }

        count++;

    }



    public static void main(String[] args) throws Exception{
        bigger = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = br.readLine().split(" ");
        N = Integer.parseInt(NM[0]);
        M = Integer.parseInt(NM[1]);

        bord = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                bord[i][j] = Integer.parseInt(input[j]);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(bord[i][j] == 1 && !visited[i][j] ){
                    bfs(i, j);

                }
            }
        }

        System.out.println(count);
        System.out.println(bigger);





    }



}
