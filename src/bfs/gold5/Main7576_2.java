package bfs.gold5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main7576_2 {
    static int M, N;
    static int[][] board;
    static int[][] days;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static class Point {
        int x, y;

        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        board = new int[N][M];
        days = new int[N][M];

        Queue<Point> queue = new LinkedList<>();

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
                if(board[i][j] == 1){
                    queue.offer(new Point(i, j));
                }
                if(board[i][j] == 0){
                    days[i][j] = -1;
                }
            }
        }

        while(!queue.isEmpty()){
            Point p = queue.poll();
            for(int i = 0; i < 4; i++){
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];

                if(nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
                if(board[nx][ny] == -1 || days[nx][ny] != -1) continue;

                days[nx][ny] = days[p.x][p.y] + 1;
                queue.offer(new Point(nx, ny));
            }
        }

        int result = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(days[i][j] == -1){
                    System.out.println(-1);
                    return;
                }
                result = Math.max(result, days[i][j]);
            }
        }

        System.out.println(result);
    }
}
