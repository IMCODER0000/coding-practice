package dfs.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main4963 {

    static int[][] Board;
    static boolean[][] visited;

    static int h,w;

    static int[] dx = {-1, 1, 0, 0, -1, -1, 1, 1};
    static int[] dy = {0, 0, -1, 1, 1, -1, 1, -1};

    static int count;

    static class Point{
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }


    static void BFS(int x, int y) {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x, y));
        visited[x][y] = true;

        while (!q.isEmpty()) {
            Point poll = q.poll();

            for (int i = 0; i < 8; i++) {
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];

                if (nx < 0 || ny < 0 || nx >= h || ny >= w) {
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


        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || ny < 0 || nx >= h || ny >= w) {
                continue;
            }

            if (visited[nx][ny] || Board[nx][ny] != 1) {
                continue;
            }

            DFS(nx, ny);


        }



    }

    public static void main(String[] args) throws Exception {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        while (true) {
            count = 0;


            String[] hw = br.readLine().split(" ");
            w = Integer.parseInt(hw[0]);
            h = Integer.parseInt(hw[1]);

            if (h == 0 && w == 0) {
                break;
            }
            Board = new int[h][w];
            visited = new boolean[h][w];



            for (int i = 0; i < h; i++) {
                String[] Ws = br.readLine().split(" ");
                for (int j = 0; j < w; j++) {
                    Board[i][j] = Integer.parseInt(Ws[j]);
                }
            }


            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (!visited[i][j] && Board[i][j] == 1) {
//                        DFS(i, j);
                        BFS(i, j);
                        count++;
                    }
                }
            }


            System.out.println(count);




        }



    }


}
