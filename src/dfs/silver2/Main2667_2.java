package dfs.silver2;

import java.util.LinkedList;
import java.util.Queue;

public class Main2667_2 {

    static int N;

    static boolean[][] visited;

    static int[][] board;

    static int h,w;

    static int count;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static class Point {
        int x, y;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }


    public void BFS(int x, int y){

        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x, y));
        visited[x][y] = true;


        while (!q.isEmpty()) {
            for (int i = 0; i < 4; i++) {
                int nextX = x + dx[i];
                int nextY = y + dy[i];

                if (nextX < 0 || nextY < 0 || nextX > w || nextY > h) {
                    continue;
                }
                if (visited[nextX][nextY] || board[nextX][nextY] != 0) {
                    continue;
                }


                q.offer(new Point(nextX, nextY));
                visited[nextX][nextY] = true;



            }

            
        }

        count




    }






}
