package bfs.gold3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main2206 {

    // 이제 불이 붙으려는 칸으로 이동 X -> 불 먼저다.

    static int N,M;
    static int count;
    static int[][] Board;
    static boolean[][][] visited;
    static boolean chance;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0, 0, -1, 1};

    static int distance = -1;

    static int noAnswer;


    static class Point{
        int x,y;
        int broken;
        int dis;

        public Point(int x, int y, int dis, int broken) {
            this.x = x;
            this.y = y;
            this.broken = broken;
            this.dis = dis;
        }
    }


    static void bfs(int x, int y){
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x-1, y-1, 1, 0));
        visited[x-1][y-1][0] = true;

        while (!queue.isEmpty()) {
            Point p = queue.poll();
            boolean check = false;

            if(p.x == N-1 && p.y == M-1){
                distance = p.dis;
                return;
            }


            for (int i = 0; i < 4; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];

                if (nx < 0 || ny < 0 || nx >= N || ny >= M) {
                    continue;
                }

                if(Board[nx][ny] == 0 && !visited[nx][ny][p.broken]){
                    queue.offer(new Point(nx, ny, p.dis+1, p.broken));
                    visited[nx][ny][p.broken] = true;
                    check = true;
                }

                if(Board[nx][ny] == 1 && p.broken == 0 && !visited[nx][ny][1] ){
                    queue.offer(new Point(nx, ny, p.dis + 1, 1));
                    visited[nx][ny][1] = true;
                    check = true;
                }





            }


        }



    }
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = br.readLine().split(" ");
        count = 0;
        noAnswer = 0;

        N = Integer.parseInt(NM[0]);
        M = Integer.parseInt(NM[1]);

        Board = new int[N][M];
        visited = new boolean[N][M][2];

        for(int i = 0; i<N; i++){
            String[] Ns = br.readLine().split("");
            for(int j = 0; j<M; j++){
                Board[i][j] = Integer.parseInt(Ns[j]);
            }
        }

        bfs(1,1);

        if(noAnswer == -1){
            System.out.println(-1);
            System.exit(0);
        }

        System.out.println(distance);





    }


}
